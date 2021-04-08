package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityId",
    "variableId",
    "unitsId",
    "scaleId"
})
public class VariableSpecImpl implements VariableSpec {
  @JsonProperty("entityId")
  private String entityId;

  @JsonProperty("variableId")
  private String variableId;

  @JsonProperty("unitsId")
  private String unitsId;

  @JsonProperty("scaleId")
  private String scaleId;

  @JsonProperty("entityId")
  public String getEntityId() {
    return this.entityId;
  }

  @JsonProperty("entityId")
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  @JsonProperty("variableId")
  public String getVariableId() {
    return this.variableId;
  }

  @JsonProperty("variableId")
  public void setVariableId(String variableId) {
    this.variableId = variableId;
  }

  @JsonProperty("unitsId")
  public String getUnitsId() {
    return this.unitsId;
  }

  @JsonProperty("unitsId")
  public void setUnitsId(String unitsId) {
    this.unitsId = unitsId;
  }

  @JsonProperty("scaleId")
  public String getScaleId() {
    return this.scaleId;
  }

  @JsonProperty("scaleId")
  public void setScaleId(String scaleId) {
    this.scaleId = scaleId;
  }
}
