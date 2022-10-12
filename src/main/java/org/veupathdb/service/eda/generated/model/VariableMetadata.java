package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

@JsonDeserialize(
    as = VariableMetadataImpl.class
)
public interface VariableMetadata {
  @JsonProperty("dataElement")
  String getDataElement();

  @JsonProperty("dataElement")
  void setDataElement(String dataElement);

  @JsonProperty("class")
  VariableClass getClazz();

  @JsonProperty("class")
  void setClazz(VariableClass classVariable);

  @JsonProperty("variableSpec")
  VariableSpec getVariableSpec();

  @JsonProperty("variableSpec")
  void setVariableSpec(VariableSpec variableSpec);

  @JsonProperty("dataType")
  APIVariableType getDataType();

  @JsonProperty("dataType")
  void setDataType(APIVariableType dataType);

  @JsonProperty("dataShape")
  APIVariableDataShape getDataShape();

  @JsonProperty("dataShape")
  void setDataShape(APIVariableDataShape dataShape);

  @JsonProperty("displayName")
  String getDisplayName();

  @JsonProperty("displayName")
  void setDisplayName(String displayName);

  @JsonProperty("displayRangeMin")
  Object getDisplayRangeMin();

  @JsonProperty("displayRangeMin")
  void setDisplayRangeMin(Object displayRangeMin);

  @JsonProperty("displayRangeMax")
  Object getDisplayRangeMax();

  @JsonProperty("displayRangeMax")
  void setDisplayRangeMax(Object displayRangeMax);

  @JsonProperty("vocabulary")
  List<String> getVocabulary();

  @JsonProperty("vocabulary")
  void setVocabulary(List<String> vocabulary);

  @JsonProperty("members")
  List<VariableSpec> getMembers();

  @JsonProperty("members")
  void setMembers(List<VariableSpec> members);
}
