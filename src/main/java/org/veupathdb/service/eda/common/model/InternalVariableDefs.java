package org.veupathdb.service.eda.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.veupathdb.service.eda.generated.model.APIVariableDataShape;
import org.veupathdb.service.eda.generated.model.APIVariableType;
import org.veupathdb.service.eda.generated.model.VariableSpecBaseIdsImpl;

class InternalVariableDefs {

  // static class
  private InternalVariableDefs(){}

  public static class InternalVariableDef extends VariableSpecBaseIdsImpl {

    private final APIVariableType _type;
    private final APIVariableDataShape _dataShape;
    private final String _unitsGroupId;
    private final String _defaultUnitsId;
    private final String _defaultScaleId;
    private final VariableSource _source;
    private final ReferenceMetadata _metadata;

    InternalVariableDef(
        String entityId,
        String variableId,
        APIVariableType type,
        APIVariableDataShape dataShape,
        String unitsGroupId,
        String defaultUnitsId,
        String defaultScaleId,
        VariableSource source,
        ReferenceMetadata metadata) {
      setEntityId(entityId);
      setVariableId(variableId);
      _type = type;
      _dataShape = dataShape;
      _unitsGroupId = unitsGroupId;
      _defaultUnitsId = defaultUnitsId;
      _defaultScaleId = defaultScaleId;
      _source = source;
      _metadata = metadata;
    }

    public APIVariableType getType() {
      return _type;
    }

    public APIVariableDataShape getDataShape() {
      return _dataShape;
    }

    public String getUnitsGroupId() {
      return _unitsGroupId;
    }

    public String getDefaultUnitsId() {
      return _defaultUnitsId;
    }

    public String getDefaultScaleId() {
      return _defaultScaleId;
    }

    public VariableSource getSource() {
      return _source;
    }

    public VariableDef toVariableDef(String unitsId, String scaleId) {
      if (_defaultScaleId == null && scaleId != null || !_metadata.isValidScaleId(scaleId)) {

      }
    }
  }

  public static class NonNumericInternalVariableDef extends InternalVariableDef {

    public NonNumericInternalVariableDef(
        String entityId,
        String variableId,
        APIVariableType type,
        APIVariableDataShape dataShape,
        VariableSource source) {
      super(entityId, variableId, type, dataShape, null, null, null, source);
    }
  }
}
