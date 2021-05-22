package org.veupathdb.service.eda.common.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.json.JSONObject;
import org.veupathdb.service.eda.generated.model.APIVariableDataShape;
import org.veupathdb.service.eda.generated.model.APIVariableType;
import org.veupathdb.service.eda.generated.model.VariableSpec;

public class EntityDef {

  private final String _id;
  private final String _displayName;
  private final InternalVariableDef _idColumnDef;
  private final List<InternalVariableDef> _variables;
  private final ReferenceMetadata _parentObj;

  public EntityDef(String id, String displayName, String idColumnName, ReferenceMetadata parentObj) {
    _id = id;
    _displayName = displayName;
    _idColumnDef = new InternalVariableDef(_id, idColumnName, APIVariableType.STRING,
        APIVariableDataShape.CONTINUOUS, null, null, null, VariableSource.ID, parentObj);
    _variables = new ArrayList<>();
    _variables.add(_idColumnDef);
    _parentObj = parentObj;
  }

  public String getId() {
    return _id;
  }

  public VariableDef getIdColumnDef() {
    return _idColumnDef.toVariableDef(null, null);
  }

  public void addVariable(InternalVariableDef var) {
    _variables.add(var);
  }

  public Optional<VariableDef> getVariable(VariableSpec var) {
    return _variables.stream()
      .filter(v -> VariableDef.hasSameEntityAndVarId(v, var))
      .findFirst()
      .map(v -> v.toVariableDef(var.getUnitsId(), var.getScaleId()));
  }

  public List<VariableDef> getVariablesWithDefaultUnitsAndScale() {
    return _variables.stream()
      .map(v -> v.toVariableDef(v.getDefaultUnitsId(), v.getDefaultScaleId()))
      .collect(Collectors.toList());
  }

  public VariableDef findFirstNativeVar() {
    // find first native var in entity to work around no-vars bug in subsetting service
    return getVariablesWithDefaultUnitsAndScale().stream()
        .filter(var -> VariableSource.NATIVE.equals(var.getSource()))
        .findFirst().orElseThrow(); // should have at least one native var
  }

  @Override
  public String toString() {
    return new JSONObject()
      .put("id", _id)
      .put("displayName", _displayName)
      .put("idColumnName", _idColumnDef.getVariableId())
      .put("variables", _variables.stream()
        .map(var -> var.getVariableId() + ":" +
            var.getType().toString().toLowerCase() + ":" +
            var.getDataShape().toString().toLowerCase())
        .collect(Collectors.toList()))
      .toString(2);
  }

}
