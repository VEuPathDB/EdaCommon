package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(
    as = VariableSpecImpl.class
)
public interface VariableSpec extends VariableSpecBaseIds {
  @JsonProperty("entityId")
  String getEntityId();

  @JsonProperty("entityId")
  void setEntityId(String entityId);

  @JsonProperty("variableId")
  String getVariableId();

  @JsonProperty("variableId")
  void setVariableId(String variableId);

  @JsonProperty("unitsId")
  String getUnitsId();

  @JsonProperty("unitsId")
  void setUnitsId(String unitsId);

  @JsonProperty("scaleId")
  String getScaleId();

  @JsonProperty("scaleId")
  void setScaleId(String scaleId);
}
