package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("valueZeroCounts")
public class VocabByStudyPostResponseImpl implements VocabByStudyPostResponse {
  @JsonProperty("valueZeroCounts")
  private List<StudyVocab> valueZeroCounts;

  @JsonProperty("valueZeroCounts")
  public List<StudyVocab> getValueZeroCounts() {
    return this.valueZeroCounts;
  }

  @JsonProperty("valueZeroCounts")
  public void setValueZeroCounts(List<StudyVocab> valueZeroCounts) {
    this.valueZeroCounts = valueZeroCounts;
  }
}
