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
    "name",
    "variable",
    "trueValues"
})
public class AdvancedSubsetInputVarImpl implements AdvancedSubsetInputVar {
  @JsonProperty("name")
  private String name;

  @JsonProperty("variable")
  private VariableSpec variable;

  @JsonProperty("trueValues")
  private List<String> trueValues;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new ExcludingMap();

  @JsonProperty("name")
  public String getName() {
    return this.name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("variable")
  public VariableSpec getVariable() {
    return this.variable;
  }

  @JsonProperty("variable")
  public void setVariable(VariableSpec variable) {
    this.variable = variable;
  }

  @JsonProperty("trueValues")
  public List<String> getTrueValues() {
    return this.trueValues;
  }

  @JsonProperty("trueValues")
  public void setTrueValues(List<String> trueValues) {
    this.trueValues = trueValues;
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
