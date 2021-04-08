package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityId",
    "variableId",
    "unitsId",
    "scaleId",
    "variableType",
    "derivationType",
    "dependentVariables",
    "construction"
})
public class DerivedVariableImpl implements DerivedVariable {
  @JsonProperty("entityId")
  private String entityId;

  @JsonProperty("variableId")
  private String variableId;

  @JsonProperty("unitsId")
  private String unitsId;

  @JsonProperty("scaleId")
  private String scaleId;

  @JsonProperty("variableType")
  private APIVariableType variableType;

  @JsonProperty("derivationType")
  private DerivationType derivationType;

  @JsonProperty("dependentVariables")
  private List<VariableSpec> dependentVariables;

  @JsonProperty("construction")
  private Object construction;

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

  @JsonProperty("variableType")
  public APIVariableType getVariableType() {
    return this.variableType;
  }

  @JsonProperty("variableType")
  public void setVariableType(APIVariableType variableType) {
    this.variableType = variableType;
  }

  @JsonProperty("derivationType")
  public DerivationType getDerivationType() {
    return this.derivationType;
  }

  @JsonProperty("derivationType")
  public void setDerivationType(DerivationType derivationType) {
    this.derivationType = derivationType;
  }

  @JsonProperty("dependentVariables")
  public List<VariableSpec> getDependentVariables() {
    return this.dependentVariables;
  }

  @JsonProperty("dependentVariables")
  public void setDependentVariables(List<VariableSpec> dependentVariables) {
    this.dependentVariables = dependentVariables;
  }

  @JsonProperty("construction")
  public Object getConstruction() {
    return this.construction;
  }

  @JsonProperty("construction")
  public void setConstruction(Object construction) {
    this.construction = construction;
  }
}
