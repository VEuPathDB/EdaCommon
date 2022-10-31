package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "computedVariableId",
    "variablePlotRef",
    "valuePlotRef"
})
public class PlotReferenceImpl implements PlotReference {
  @JsonProperty("computedVariableId")
  private String computedVariableId;

  @JsonProperty("variablePlotRef")
  private String variablePlotRef;

  @JsonProperty("valuePlotRef")
  private String valuePlotRef;

  @JsonProperty("computedVariableId")
  public String getComputedVariableId() {
    return this.computedVariableId;
  }

  @JsonProperty("computedVariableId")
  public void setComputedVariableId(String computedVariableId) {
    this.computedVariableId = computedVariableId;
  }

  @JsonProperty("variablePlotRef")
  public String getVariablePlotRef() {
    return this.variablePlotRef;
  }

  @JsonProperty("variablePlotRef")
  public void setVariablePlotRef(String variablePlotRef) {
    this.variablePlotRef = variablePlotRef;
  }

  @JsonProperty("valuePlotRef")
  public String getValuePlotRef() {
    return this.valuePlotRef;
  }

  @JsonProperty("valuePlotRef")
  public void setValuePlotRef(String valuePlotRef) {
    this.valuePlotRef = valuePlotRef;
  }
}
