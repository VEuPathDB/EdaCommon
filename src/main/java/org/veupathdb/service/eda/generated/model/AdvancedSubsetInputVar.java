package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonDeserialize(
    as = AdvancedSubsetInputVarImpl.class
)
public interface AdvancedSubsetInputVar extends VariableReference {
  @JsonProperty("name")
  String getName();

  @JsonProperty("name")
  void setName(String name);

  @JsonProperty("variable")
  VariableSpec getVariable();

  @JsonProperty("variable")
  void setVariable(VariableSpec variable);

  @JsonProperty("trueValues")
  List<String> getTrueValues();

  @JsonProperty("trueValues")
  void setTrueValues(List<String> trueValues);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
