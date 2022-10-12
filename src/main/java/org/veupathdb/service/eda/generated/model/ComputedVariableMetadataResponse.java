package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

@JsonDeserialize(
    as = ComputedVariableMetadataResponseImpl.class
)
public interface ComputedVariableMetadataResponse {
  @JsonProperty("variables")
  List<VariableMetadata> getVariables();

  @JsonProperty("variables")
  void setVariables(List<VariableMetadata> variables);
}
