package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonTypeName("date")
@JsonDeserialize(
    as = APIDateCollectionImpl.class
)
public interface APIDateCollection extends APICollection {
  APICollectionType _DISCRIMINATOR_TYPE_NAME = APICollectionType.DATE;

  @JsonProperty("id")
  String getId();

  @JsonProperty("id")
  void setId(String id);

  @JsonProperty("displayName")
  String getDisplayName();

  @JsonProperty("displayName")
  void setDisplayName(String displayName);

  @JsonProperty("description")
  String getDescription();

  @JsonProperty("description")
  void setDescription(String description);

  @JsonProperty("vocabulary")
  List<String> getVocabulary();

  @JsonProperty("vocabulary")
  void setVocabulary(List<String> vocabulary);

  @JsonProperty("distinctValuesCount")
  Number getDistinctValuesCount();

  @JsonProperty("distinctValuesCount")
  void setDistinctValuesCount(Number distinctValuesCount);

  @JsonProperty("type")
  APICollectionType getType();

  @JsonProperty("variables")
  List<APIVariable> getVariables();

  @JsonProperty("variables")
  void setVariables(List<APIVariable> variables);

  @JsonProperty("displayRangeMin")
  String getDisplayRangeMin();

  @JsonProperty("displayRangeMin")
  void setDisplayRangeMin(String displayRangeMin);

  @JsonProperty("displayRangeMax")
  String getDisplayRangeMax();

  @JsonProperty("displayRangeMax")
  void setDisplayRangeMax(String displayRangeMax);

  @JsonProperty("rangeMin")
  String getRangeMin();

  @JsonProperty("rangeMin")
  void setRangeMin(String rangeMin);

  @JsonProperty("rangeMax")
  String getRangeMax();

  @JsonProperty("rangeMax")
  void setRangeMax(String rangeMax);

  @JsonProperty("binWidthOverride")
  Number getBinWidthOverride();

  @JsonProperty("binWidthOverride")
  void setBinWidthOverride(Number binWidthOverride);

  @JsonProperty("binUnits")
  BinUnits getBinUnits();

  @JsonProperty("binUnits")
  void setBinUnits(BinUnits binUnits);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
