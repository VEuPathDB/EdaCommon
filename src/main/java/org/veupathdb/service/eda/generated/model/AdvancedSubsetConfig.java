package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonDeserialize(
    as = AdvancedSubsetConfigImpl.class
)
public interface AdvancedSubsetConfig {
  @JsonProperty("operationTree")
  SetOperation getOperationTree();

  @JsonProperty("operationTree")
  void setOperationTree(SetOperation operationTree);

  @JsonProperty("inputVariables")
  List<AdvancedSubsetInputVar> getInputVariables();

  @JsonProperty("inputVariables")
  void setInputVariables(List<AdvancedSubsetInputVar> inputVariables);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
