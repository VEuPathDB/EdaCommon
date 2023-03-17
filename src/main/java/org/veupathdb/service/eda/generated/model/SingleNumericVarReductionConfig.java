package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;

@JsonDeserialize(
    as = SingleNumericVarReductionConfigImpl.class
)
public interface SingleNumericVarReductionConfig {
  @JsonProperty("inputVariable")
  VariableSpec getInputVariable();

  @JsonProperty("inputVariable")
  void setInputVariable(VariableSpec inputVariable);

  @JsonProperty("imputeZero")
  Boolean getImputeZero();

  @JsonProperty("imputeZero")
  void setImputeZero(Boolean imputeZero);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
