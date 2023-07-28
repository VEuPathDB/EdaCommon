package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

@JsonDeserialize(
    as = VocabByStudyPostResponseImpl.class
)
public interface VocabByStudyPostResponse {
  @JsonProperty("valueZeroCounts")
  List<StudyVocab> getValueZeroCounts();

  @JsonProperty("valueZeroCounts")
  void setValueZeroCounts(List<StudyVocab> valueZeroCounts);
}
