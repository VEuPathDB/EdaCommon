package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonTypeName("number")
@JsonDeserialize(
    as = APINumberCollectionImpl.class
)
public interface APINumberCollection extends APICollection {
  APICollectionType _DISCRIMINATOR_TYPE_NAME = APICollectionType.NUMBER;

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

  @JsonProperty("units")
  String getUnits();

  @JsonProperty("units")
  void setUnits(String units);

  @JsonProperty("precision")
  Number getPrecision();

  @JsonProperty("precision")
  void setPrecision(Number precision);

  @JsonProperty("displayRangeMin")
  Number getDisplayRangeMin();

  @JsonProperty("displayRangeMin")
  void setDisplayRangeMin(Number displayRangeMin);

  @JsonProperty("displayRangeMax")
  Number getDisplayRangeMax();

  @JsonProperty("displayRangeMax")
  void setDisplayRangeMax(Number displayRangeMax);

  @JsonProperty("rangeMin")
  Number getRangeMin();

  @JsonProperty("rangeMin")
  void setRangeMin(Number rangeMin);

  @JsonProperty("rangeMax")
  Number getRangeMax();

  @JsonProperty("rangeMax")
  void setRangeMax(Number rangeMax);

  @JsonProperty("binWidthOverride")
  Number getBinWidthOverride();

  @JsonProperty("binWidthOverride")
  void setBinWidthOverride(Number binWidthOverride);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
