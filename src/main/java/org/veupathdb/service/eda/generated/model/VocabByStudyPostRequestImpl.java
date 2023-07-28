package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "filters",
    "studyEntity"
})
public class VocabByStudyPostRequestImpl implements VocabByStudyPostRequest {
  @JsonProperty("filters")
  private List<APIFilter> filters;

  @JsonProperty("studyEntity")
  private String studyEntity;

  @JsonProperty("filters")
  public List<APIFilter> getFilters() {
    return this.filters;
  }

  @JsonProperty("filters")
  public void setFilters(List<APIFilter> filters) {
    this.filters = filters;
  }

  @JsonProperty("studyEntity")
  public String getStudyEntity() {
    return this.studyEntity;
  }

  @JsonProperty("studyEntity")
  public void setStudyEntity(String studyEntity) {
    this.studyEntity = studyEntity;
  }
}
