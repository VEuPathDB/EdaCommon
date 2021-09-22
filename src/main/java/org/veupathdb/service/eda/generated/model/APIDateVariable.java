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
    as = APIDateVariableImpl.class
)
public interface APIDateVariable extends APIVariable {
  APIVariableType _DISCRIMINATOR_TYPE_NAME = APIVariableType.DATE;

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

  @JsonProperty("vocabulary")
  List<String> getVocabulary();

  @JsonProperty("vocabulary")
  void setVocabulary(List<String> vocabulary);

  @JsonProperty("displayType")
  APIVariableDisplayType getDisplayType();

  @JsonProperty("displayType")
  void setDisplayType(APIVariableDisplayType displayType);

  @JsonProperty("displayOrder")
  Number getDisplayOrder();

  @JsonProperty("displayOrder")
  void setDisplayOrder(Number displayOrder);

  @JsonProperty("type")
  APIVariableType getType();

  @JsonProperty("dataShape")
  APIVariableDataShape getDataShape();

  @JsonProperty("dataShape")
  void setDataShape(APIVariableDataShape dataShape);

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

  @JsonProperty("binWidth")
  Number getBinWidth();

  @JsonProperty("binWidth")
  void setBinWidth(Number binWidth);

  @JsonProperty("binUnits")
  BinUnits getBinUnits();

  @JsonProperty("binUnits")
  void setBinUnits(BinUnits binUnits);

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

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
