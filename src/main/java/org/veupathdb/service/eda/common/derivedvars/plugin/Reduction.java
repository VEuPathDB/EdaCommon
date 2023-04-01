package org.veupathdb.service.eda.common.derivedvars.plugin;

import jakarta.ws.rs.BadRequestException;
import org.veupathdb.service.eda.common.client.spec.StreamSpec;
import org.veupathdb.service.eda.common.derivedvars.DerivedVariableFactory.PluginMap;
import org.veupathdb.service.eda.common.derivedvars.plugin.reductions.Mean;
import org.veupathdb.service.eda.common.derivedvars.plugin.reductions.RelativeObservationMinTimeIntervalHelper;
import org.veupathdb.service.eda.common.derivedvars.plugin.reductions.SubsetMembership;
import org.veupathdb.service.eda.common.derivedvars.plugin.reductions.Sum;
import org.veupathdb.service.eda.common.model.EntityDef;
import org.veupathdb.service.eda.common.model.VariableDef;
import org.veupathdb.service.eda.generated.model.APIFilter;
import org.veupathdb.service.eda.generated.model.VariableSpec;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.veupathdb.service.eda.common.derivedvars.DerivedVariableFactory.pluginsOf;

public abstract class Reduction<T> extends AbstractDerivedVariable<T> {

  public static PluginMap<Reduction> getPlugins() {
    return pluginsOf(Reduction.class,
      // available reductions
      Sum.class,
      Mean.class,
      SubsetMembership.class,
      RelativeObservationMinTimeIntervalHelper.class
    );
  }

  public interface Reducer {
    void addRow(Map<String,String> nextRow);
    String getResultingValue();
  }

  public abstract Reducer createReducer();

  private StreamSpec _inputStreamSpec;

  public StreamSpec getInputStreamSpec() {
    if (_inputStreamSpec == null) {
      EntityDef entity = _metadata.getEntity(getCommonEntityId()).orElseThrow();
      _inputStreamSpec = new StreamSpec(UUID.randomUUID().toString(), entity.getId())
          .addVars(getRequiredInputVars().stream()
              // filter out IDs of the requested entity and its ancestors
              .filter(var -> !isVariableInList(var, _metadata.getTabularColumns(entity, Collections.emptyList())))
              .toList())
          .setFiltersOverride(getFiltersOverride());
    }
    return _inputStreamSpec;
  }

  private static boolean isVariableInList(VariableSpec var, List<VariableDef> list) {
    for (VariableSpec listVar : list) {
      if (VariableDef.isSameVariable(listVar, var)) return true;
    }
    return false;
  }

  protected List<APIFilter> getFiltersOverride() {
    return null;
  }

  @Override
  public void validateDependedVariableLocations() {
    // find the ancestors of the common entity of the input vars, which should be a descendant of the target entity
    List<String> ancestorIds = _metadata
        .getAncestors(_metadata.getEntity(getCommonEntityId()).orElseThrow())
        .stream().map(EntityDef::getId).toList();
    if (!ancestorIds.contains(getEntity().getId())) {
      throw new BadRequestException("Input vars configured for reduction derived var " + getFunctionName() + " are not on a descendant entity.");
    }
  }

  private String getCommonEntityId() {
    // depended vars must all be on the same entity, which must be a descendant of this entity
    String commonEntityId = null;
    for (VariableSpec spec : getRequiredInputVars()) {
      _metadata.getVariable(spec).orElseThrow(() ->
          new BadRequestException("Input variable for reduction derived var " + getFunctionName() + " does not exist."));
      if (commonEntityId == null) {
        commonEntityId = spec.getEntityId();
      }
      else {
        if (!spec.getEntityId().equals(commonEntityId)) {
          throw new BadRequestException("Not all input variables for reduction derived var " + getFunctionName() + " come from the same entity.");
        }
      }
    }
    if (commonEntityId == null) {
      throw new IllegalStateException("No required input vars specified in reduction plugin " + getFunctionName());
    }
    return commonEntityId;
  }
}
