package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "filters",
    "binSpec",
    "valueSpec"
})
public class VariableDistributionPostRequestImpl implements VariableDistributionPostRequest {
  @JsonProperty("filters")
  private List<APIFilter> filters;

  @JsonProperty("binSpec")
  private BinSpec binSpec;

  @JsonProperty("valueSpec")
  private VariableDistributionPostRequest.ValueSpecType valueSpec;

  @JsonProperty("filters")
  public List<APIFilter> getFilters() {
    return this.filters;
  }

  @JsonProperty("filters")
  public void setFilters(List<APIFilter> filters) {
    this.filters = filters;
  }

  @JsonProperty("binSpec")
  public BinSpec getBinSpec() {
    return this.binSpec;
  }

  @JsonProperty("binSpec")
  public void setBinSpec(BinSpec binSpec) {
    this.binSpec = binSpec;
  }

  @JsonProperty("valueSpec")
  public VariableDistributionPostRequest.ValueSpecType getValueSpec() {
    return this.valueSpec;
  }

  @JsonProperty("valueSpec")
  public void setValueSpec(VariableDistributionPostRequest.ValueSpecType valueSpec) {
    this.valueSpec = valueSpec;
  }
}
