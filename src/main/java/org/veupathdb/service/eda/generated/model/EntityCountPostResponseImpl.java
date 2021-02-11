package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("count")
public class EntityCountPostResponseImpl implements EntityCountPostResponse {
  @JsonProperty("count")
  private int count;

  @JsonProperty("count")
  public int getCount() {
    return this.count;
  }

  @JsonProperty("count")
  public void setCount(int count) {
    this.count = count;
  }
}
