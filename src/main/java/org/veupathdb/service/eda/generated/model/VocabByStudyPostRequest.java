package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

@JsonDeserialize(
    as = VocabByStudyPostRequestImpl.class
)
public interface VocabByStudyPostRequest {
  @JsonProperty("filters")
  List<APIFilter> getFilters();

  @JsonProperty("filters")
  void setFilters(List<APIFilter> filters);

  @JsonProperty("studyEntity")
  String getStudyEntity();

  @JsonProperty("studyEntity")
  void setStudyEntity(String studyEntity);
}
