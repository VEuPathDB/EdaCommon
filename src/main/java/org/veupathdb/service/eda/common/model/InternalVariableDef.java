package org.veupathdb.service.eda.common.model;

import org.veupathdb.service.eda.generated.model.APIVariableDataShape;
import org.veupathdb.service.eda.generated.model.APIVariableType;
import org.veupathdb.service.eda.generated.model.VariableSpecBaseIdsImpl;

class InternalVariableDef extends VariableSpecBaseIdsImpl {

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
    if (unitsId != null) { // passed value not null
      if (_defaultUnitsId == null || !_metadata.isValidUnitsId(_unitsGroupId, unitsId)) {
        throw new IllegalArgumentException("Invalid units ID '" + unitsId + "' for variable " + getEntityId() + ":" + getVariableId());
      }
    }
    else if (_defaultUnitsId != null) {
      // assign default if null passed in but units is relevant to this var
      unitsId = _defaultUnitsId;
    }
    if (scaleId != null) { // passed value not null
      if (_defaultScaleId == null || !_metadata.isValidScaleId(scaleId)) {
        throw new IllegalArgumentException("Invalid scale ID '" + scaleId + "' for variable " + getEntityId() + ":" + getVariableId());
      }
    }
    else if (_defaultScaleId != null) {
      // assign default if null passed in but scale is relevant to this var
      scaleId = _defaultScaleId;
    }
    return new VariableDef(getEntityId(), getVariableId(), unitsId, scaleId, getType(), getDataShape(), getSource());
  }

  private static boolean bothOrNeitherNull(String value1, String value2) {
    return value1 == null ? value2 == null : value2 != null;
  }
}
