package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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

  @JsonProperty("providerLabel")
  String getProviderLabel();

  @JsonProperty("providerLabel")
  void setProviderLabel(String providerLabel);

  @JsonProperty("displayName")
  String getDisplayName();

  @JsonProperty("displayName")
  void setDisplayName(String displayName);

  @JsonProperty("parentId")
  String getParentId();

  @JsonProperty("parentId")
  void setParentId(String parentId);

  @JsonProperty("type")
  APIVariableType getType();

  @JsonProperty("isMultiValued")
  boolean getIsMultiValued();

  @JsonProperty("isMultiValued")
  void setIsMultiValued(boolean isMultiValued);

  @JsonProperty("displayType")
  APIVariableDisplayType getDisplayType();

  @JsonProperty("displayType")
  void setDisplayType(APIVariableDisplayType displayType);

  @JsonProperty("dataShape")
  APIVariableDataShape getDataShape();

  @JsonProperty("dataShape")
  void setDataShape(APIVariableDataShape dataShape);

  @JsonProperty("isFeatured")
  boolean getIsFeatured();

  @JsonProperty("isFeatured")
  void setIsFeatured(boolean isFeatured);

  @JsonProperty("isTemporal")
  boolean getIsTemporal();

  @JsonProperty("isTemporal")
  void setIsTemporal(boolean isTemporal);

  @JsonProperty("unitsGroupId")
  String getUnitsGroupId();

  @JsonProperty("unitsGroupId")
  void setUnitsGroupId(String unitsGroupId);

  @JsonProperty("defaultUnitsId")
  String getDefaultUnitsId();

  @JsonProperty("defaultUnitsId")
  void setDefaultUnitsId(String defaultUnitsId);

  @JsonProperty("defaultScaleId")
  String getDefaultScaleId();

  @JsonProperty("defaultScaleId")
  void setDefaultScaleId(String defaultScaleId);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
