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
    as = APIIntegerVariableImpl.class
)
public interface APIIntegerVariable extends APIVariableWithValues {
  APIVariableType _DISCRIMINATOR_TYPE_NAME = APIVariableType.INTEGER;

  @JsonProperty("id")
  String getId();

  @JsonProperty("id")
  void setId(String id);

  @JsonProperty("parentId")
  String getParentId();

  @JsonProperty("parentId")
  void setParentId(String parentId);

  @JsonProperty("providerLabel")
  String getProviderLabel();

  @JsonProperty("providerLabel")
  void setProviderLabel(String providerLabel);

  @JsonProperty("displayName")
  String getDisplayName();

  @JsonProperty("displayName")
  void setDisplayName(String displayName);

  @JsonProperty("definition")
  String getDefinition();

  @JsonProperty("definition")
  void setDefinition(String definition);

  @JsonProperty("displayType")
  APIVariableDisplayType getDisplayType();

  @JsonProperty("displayType")
  void setDisplayType(APIVariableDisplayType displayType);

  @JsonProperty("displayOrder")
  Number getDisplayOrder();

  @JsonProperty("displayOrder")
  void setDisplayOrder(Number displayOrder);

  @JsonProperty("isCategory")
  String getIsCategory();

  @JsonProperty("isCategory")
  void setIsCategory(String isCategory);

  @JsonProperty("type")
  APIVariableType getType();

  @JsonProperty("dataShape")
  APIVariableDataShape getDataShape();

  @JsonProperty("dataShape")
  void setDataShape(APIVariableDataShape dataShape);

  @JsonProperty("vocabulary")
  List<String> getVocabulary();

  @JsonProperty("vocabulary")
  void setVocabulary(List<String> vocabulary);

  @JsonProperty("distinctValuesCount")
  Number getDistinctValuesCount();

  @JsonProperty("distinctValuesCount")
  void setDistinctValuesCount(Number distinctValuesCount);

  @JsonProperty("isTemporal")
  Boolean getIsTemporal();

  @JsonProperty("isTemporal")
  void setIsTemporal(Boolean isTemporal);

  @JsonProperty("isFeatured")
  Boolean getIsFeatured();

  @JsonProperty("isFeatured")
  void setIsFeatured(Boolean isFeatured);

  @JsonProperty("isMergeKey")
  Boolean getIsMergeKey();

  @JsonProperty("isMergeKey")
  void setIsMergeKey(Boolean isMergeKey);

  @JsonProperty("isMultiValued")
  Boolean getIsMultiValued();

  @JsonProperty("isMultiValued")
  void setIsMultiValued(Boolean isMultiValued);

  @JsonProperty("units")
  String getUnits();

  @JsonProperty("units")
  void setUnits(String units);

  @JsonProperty("displayRangeMin")
  Integer getDisplayRangeMin();

  @JsonProperty("displayRangeMin")
  void setDisplayRangeMin(Integer displayRangeMin);

  @JsonProperty("displayRangeMax")
  Integer getDisplayRangeMax();

  @JsonProperty("displayRangeMax")
  void setDisplayRangeMax(Integer displayRangeMax);

  @JsonProperty("rangeMin")
  Integer getRangeMin();

  @JsonProperty("rangeMin")
  void setRangeMin(Integer rangeMin);

  @JsonProperty("rangeMax")
  Integer getRangeMax();

  @JsonProperty("rangeMax")
  void setRangeMax(Integer rangeMax);

  @JsonProperty("binWidth")
  Integer getBinWidth();

  @JsonProperty("binWidth")
  void setBinWidth(Integer binWidth);

  @JsonProperty("binWidthOverride")
  Integer getBinWidthOverride();

  @JsonProperty("binWidthOverride")
  void setBinWidthOverride(Integer binWidthOverride);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
