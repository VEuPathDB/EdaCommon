package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "filters",
    "outputVariableSpecs"
})
public class EntityTabularPostRequestImpl implements EntityTabularPostRequest {
  @JsonProperty("filters")
  private List<APIFilter> filters;

  @JsonProperty("outputVariableSpecs")
  private List<VariableSpec> outputVariableSpecs;

  @JsonProperty("filters")
  public List<APIFilter> getFilters() {
    return this.filters;
  }

  @JsonProperty("filters")
  public void setFilters(List<APIFilter> filters) {
    this.filters = filters;
  }

  @JsonProperty("outputVariableSpecs")
  public List<VariableSpec> getOutputVariableSpecs() {
    return this.outputVariableSpecs;
  }

  @JsonProperty("outputVariableSpecs")
  public void setOutputVariableSpecs(List<VariableSpec> outputVariableSpecs) {
    this.outputVariableSpecs = outputVariableSpecs;
  }
}
