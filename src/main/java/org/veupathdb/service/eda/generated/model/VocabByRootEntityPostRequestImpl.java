package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("studyEntity")
public class VocabByRootEntityPostRequestImpl implements VocabByRootEntityPostRequest {
  @JsonProperty("studyEntity")
  private String studyEntity;

  @JsonProperty("studyEntity")
  public String getStudyEntity() {
    return this.studyEntity;
  }

  @JsonProperty("studyEntity")
  public void setStudyEntity(String studyEntity) {
    this.studyEntity = studyEntity;
  }
}
