package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

@JsonDeserialize(
    as = VariableDistributionPostRequestImpl.class
)
public interface VariableDistributionPostRequest {
  @JsonProperty("filters")
  List<APIFilter> getFilters();

  @JsonProperty("filters")
  void setFilters(List<APIFilter> filters);

  @JsonProperty("binSpec")
  BinSpec getBinSpec();

  @JsonProperty("binSpec")
  void setBinSpec(BinSpec binSpec);

  @JsonProperty("valueSpec")
  ValueSpecType getValueSpec();

  @JsonProperty("valueSpec")
  void setValueSpec(ValueSpecType valueSpec);

  enum ValueSpecType {
    @JsonProperty("count")
    COUNT("count"),

    @JsonProperty("proportion")
    PROPORTION("proportion");

    private String name;

    ValueSpecType(String name) {
      this.name = name;
    }
    public String getValue(){ return name; } 
}
}

