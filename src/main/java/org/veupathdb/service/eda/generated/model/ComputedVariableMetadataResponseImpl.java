package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("variables")
public class ComputedVariableMetadataResponseImpl implements ComputedVariableMetadataResponse {
  @JsonProperty("variables")
  private List<VariableMetadata> variables;

  @JsonProperty("variables")
  public List<VariableMetadata> getVariables() {
    return this.variables;
  }

  @JsonProperty("variables")
  public void setVariables(List<VariableMetadata> variables) {
    this.variables = variables;
  }
}
