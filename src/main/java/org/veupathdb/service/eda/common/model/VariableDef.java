package org.veupathdb.service.eda.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.gusdb.fgputil.json.JsonUtil;
import org.veupathdb.service.eda.generated.model.APIVariableDataShape;
import org.veupathdb.service.eda.generated.model.APIVariableType;
import org.veupathdb.service.eda.generated.model.VariableSpec;
import org.veupathdb.service.eda.generated.model.VariableSpecImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Encapsulates information about variables across all data types and sources (inherited, computed, and derived vars.
 */
// for logging purposes and if these are ever serialized by JSON, we only want the VariableSpec fields
@JsonPropertyOrder({
    "entityId",
    "variableId"
})
public class VariableDef extends VariableSpecImpl {

  public static VariableSpec newVariableSpec(String entityId, String variableId) {
    VariableSpec spec = new VariableSpecImpl();
    spec.setEntityId(entityId);
    spec.setVariableId(variableId);
    return spec;
  }

  @JsonIgnore
  private final APIVariableType _type;

  @JsonIgnore
  private final APIVariableDataShape _dataShape;

  @JsonIgnore
  private final VariableSource _source;

  @JsonIgnore
  private final boolean _isMultiValue;

  @JsonIgnore
  private final boolean _isImputeZero;

  @JsonIgnore
  private final Optional<DataRanges> _dataRanges;

  @JsonIgnore
  private final Optional<String> _units;

  @JsonIgnore
  private final String _parentId;

  @JsonIgnore
  private final boolean _hasStudyDependentVocabulary;

  @JsonIgnore
  private final VariableSpec _variableSpecToImputeZeroesFor;

  public VariableDef(
      String entityId,
      String variableId,
      APIVariableType type,
      APIVariableDataShape dataShape,
      boolean isMultiValue,
      boolean isImputZero,
      Optional<DataRanges> dataRanges,
      Optional<String> units,
      String parentId,
      boolean hasStudyDependentVocabulary,
      VariableSpec variableSpecToImputeZeroesFor,
      VariableSource source) {
    setEntityId(entityId);
    setVariableId(variableId);
    _type = type;
    _dataShape = dataShape;
    _isMultiValue = isMultiValue;
    _isImputeZero = isImputZero;
    _dataRanges = dataRanges;
    _units = units;
    _parentId = parentId;
    _hasStudyDependentVocabulary = hasStudyDependentVocabulary;
    _variableSpecToImputeZeroesFor = variableSpecToImputeZeroesFor;
    _source = source;
  }

  @JsonIgnore
  public APIVariableType getType() {
    return _type;
  }

  @JsonIgnore
  public APIVariableDataShape getDataShape() {
    return _dataShape;
  }

  @JsonIgnore
  public boolean isMultiValue() {
    return _isMultiValue;
  }

  @JsonIgnore
  public boolean isImputeZero() {
    return _isImputeZero;
  }

  @JsonIgnore
  public Optional<DataRanges> getDataRanges() {
    return _dataRanges;
  }

  @JsonIgnore
  public Optional<String> getUnits() {
    return _units;
  }

  @JsonIgnore
  public VariableSource getSource() {
    return _source;
  }

  @JsonIgnore
  public String getParentId() {
    return _parentId;
  }

  @JsonIgnore
  public boolean getHasStudyDependentVocabulary() {
    return _hasStudyDependentVocabulary;
  }

  @JsonIgnore
  public VariableSpec getVariableSpecToImputeZeroesFor() {
    return _variableSpecToImputeZeroesFor;
  }

  @Override
  public String toString() {
    return JsonUtil.serializeObject(this);
  }

  public static String toDotNotation(VariableSpec var) {
    return var.getEntityId() + "." + var.getVariableId();
  }

  public static <T extends VariableSpec> List<String> toDotNotation(List<T> vars) {
    return vars.stream().map(VariableDef::toDotNotation).collect(Collectors.toList());
  }

  public static boolean isSameVariable(VariableSpec v1, VariableSpec v2) {
    return v1.getEntityId().equals(v2.getEntityId()) && v1.getVariableId().equals(v2.getVariableId());
  }

}
