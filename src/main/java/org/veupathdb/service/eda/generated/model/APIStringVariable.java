package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonTypeName("string")
@JsonDeserialize(
    as = APIStringVariableImpl.class
)
public interface APIStringVariable extends APIVariable {
  APIVariableType _DISCRIMINATOR_TYPE_NAME = APIVariableType.STRING;

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

  @JsonProperty("isTemporal")
  boolean getIsTemporal();

  @JsonProperty("isTemporal")
  void setIsTemporal(boolean isTemporal);

  @JsonProperty("isFeatured")
  boolean getIsFeatured();

  @JsonProperty("isFeatured")
  void setIsFeatured(boolean isFeatured);

  @JsonProperty("isMergeKey")
  boolean getIsMergeKey();

  @JsonProperty("isMergeKey")
  void setIsMergeKey(boolean isMergeKey);

  @JsonProperty("isRepeated")
  boolean getIsRepeated();

  @JsonProperty("isRepeated")
  void setIsRepeated(boolean isRepeated);

  @JsonProperty("type")
  APIVariableType getType();

  @JsonProperty("distinctValuesCount")
  Number getDistinctValuesCount();

  @JsonProperty("distinctValuesCount")
  void setDistinctValuesCount(Number distinctValuesCount);

  @JsonProperty("isMultiValued")
  boolean getIsMultiValued();

  @JsonProperty("isMultiValued")
  void setIsMultiValued(boolean isMultiValued);

  @JsonProperty("dataShape")
  APIVariableDataShape getDataShape();

  @JsonProperty("dataShape")
  void setDataShape(APIVariableDataShape dataShape);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
