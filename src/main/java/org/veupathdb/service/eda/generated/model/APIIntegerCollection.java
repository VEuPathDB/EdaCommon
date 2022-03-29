package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonTypeName("integer")
@JsonDeserialize(
    as = APIIntegerCollectionImpl.class
)
public interface APIIntegerCollection extends APICollection {
  APICollectionType _DISCRIMINATOR_TYPE_NAME = APICollectionType.INTEGER;

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

  @JsonProperty("displayRangeMin")
  Long getDisplayRangeMin();

  @JsonProperty("displayRangeMin")
  void setDisplayRangeMin(Long displayRangeMin);

  @JsonProperty("displayRangeMax")
  Long getDisplayRangeMax();

  @JsonProperty("displayRangeMax")
  void setDisplayRangeMax(Long displayRangeMax);

  @JsonProperty("rangeMin")
  Long getRangeMin();

  @JsonProperty("rangeMin")
  void setRangeMin(Long rangeMin);

  @JsonProperty("rangeMax")
  Long getRangeMax();

  @JsonProperty("rangeMax")
  void setRangeMax(Long rangeMax);

  @JsonProperty("binWidthOverride")
  Long getBinWidthOverride();

  @JsonProperty("binWidthOverride")
  void setBinWidthOverride(Long binWidthOverride);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
