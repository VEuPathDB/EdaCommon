package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

@JsonDeserialize(
    as = StudyVocabImpl.class
)
public interface StudyVocab {
  @JsonProperty("study")
  String getStudy();

  @JsonProperty("study")
  void setStudy(String study);

  @JsonProperty("vocab")
  List<String> getVocab();

  @JsonProperty("vocab")
  void setVocab(List<String> vocab);
}
