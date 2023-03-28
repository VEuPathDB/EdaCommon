package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "operationTree",
    "inputVariables"
})
public class AdvancedSubsetConfigImpl implements AdvancedSubsetConfig {
  @JsonProperty("operationTree")
  private SetOperation operationTree;

  @JsonProperty("inputVariables")
  private List<AdvancedSubsetInputVar> inputVariables;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new ExcludingMap();

  @JsonProperty("operationTree")
  public SetOperation getOperationTree() {
    return this.operationTree;
  }

  @JsonProperty("operationTree")
  public void setOperationTree(SetOperation operationTree) {
    this.operationTree = operationTree;
  }

  @JsonProperty("inputVariables")
  public List<AdvancedSubsetInputVar> getInputVariables() {
    return this.inputVariables;
  }

  @JsonProperty("inputVariables")
  public void setInputVariables(List<AdvancedSubsetInputVar> inputVariables) {
    this.inputVariables = inputVariables;
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
