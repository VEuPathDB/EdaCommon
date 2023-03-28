package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "operation",
    "leftOperation",
    "leftVariable",
    "rightOperation",
    "rightVariable"
})
public class SetOperationImpl implements SetOperation {
  @JsonProperty("operation")
  private SetOperation.OperationType operation;

  @JsonProperty("leftOperation")
  private SetOperation leftOperation;

  @JsonProperty("leftVariable")
  private String leftVariable;

  @JsonProperty("rightOperation")
  private SetOperation rightOperation;

  @JsonProperty("rightVariable")
  private String rightVariable;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new ExcludingMap();

  @JsonProperty("operation")
  public SetOperation.OperationType getOperation() {
    return this.operation;
  }

  @JsonProperty("operation")
  public void setOperation(SetOperation.OperationType operation) {
    this.operation = operation;
  }

  @JsonProperty("leftOperation")
  public SetOperation getLeftOperation() {
    return this.leftOperation;
  }

  @JsonProperty("leftOperation")
  public void setLeftOperation(SetOperation leftOperation) {
    this.leftOperation = leftOperation;
  }

  @JsonProperty("leftVariable")
  public String getLeftVariable() {
    return this.leftVariable;
  }

  @JsonProperty("leftVariable")
  public void setLeftVariable(String leftVariable) {
    this.leftVariable = leftVariable;
  }

  @JsonProperty("rightOperation")
  public SetOperation getRightOperation() {
    return this.rightOperation;
  }

  @JsonProperty("rightOperation")
  public void setRightOperation(SetOperation rightOperation) {
    this.rightOperation = rightOperation;
  }

  @JsonProperty("rightVariable")
  public String getRightVariable() {
    return this.rightVariable;
  }

  @JsonProperty("rightVariable")
  public void setRightVariable(String rightVariable) {
    this.rightVariable = rightVariable;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperties(String key, Object value) {
    this.additionalProperties.put(key, value);
  }
}
