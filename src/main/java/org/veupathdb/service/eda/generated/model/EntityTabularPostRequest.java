package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

@JsonDeserialize(
    as = EntityTabularPostRequestImpl.class
)
public interface EntityTabularPostRequest {
  @JsonProperty("filters")
  List<APIFilter> getFilters();

  @JsonProperty("filters")
  void setFilters(List<APIFilter> filters);

  @JsonProperty("outputVariableSpecs")
  List<VariableSpec> getOutputVariableSpecs();

  @JsonProperty("outputVariableSpecs")
  void setOutputVariableSpecs(List<VariableSpec> outputVariableSpecs);
}
