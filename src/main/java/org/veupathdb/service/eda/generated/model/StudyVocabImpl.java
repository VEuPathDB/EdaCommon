package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "study",
    "vocab"
})
public class StudyVocabImpl implements StudyVocab {
  @JsonProperty("study")
  private String study;

  @JsonProperty("vocab")
  private List<String> vocab;

  @JsonProperty("study")
  public String getStudy() {
    return this.study;
  }

  @JsonProperty("study")
  public void setStudy(String study) {
    this.study = study;
  }

  @JsonProperty("vocab")
  public List<String> getVocab() {
    return this.vocab;
  }

  @JsonProperty("vocab")
  public void setVocab(List<String> vocab) {
    this.vocab = vocab;
  }
}
