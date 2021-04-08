package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;

@JsonTypeName("number")
@JsonDeserialize(
    as = APINumberVariableImpl.class
)
public interface APINumberVariable extends APIVariable {
  APIVariableType _DISCRIMINATOR_TYPE_NAME = APIVariableType.NUMBER;

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

  @JsonProperty("unitsId")
  String getUnitsId();

  @JsonProperty("unitsId")
  void setUnitsId(String unitsId);

  @JsonProperty("unitsDisplayName")
  String getUnitsDisplayName();

  @JsonProperty("unitsDisplayName")
  void setUnitsDisplayName(String unitsDisplayName);

  @JsonProperty("precision")
  int getPrecision();

  @JsonProperty("precision")
  void setPrecision(int precision);

  @JsonProperty("scaleId")
  String getScaleId();

  @JsonProperty("scaleId")
  void setScaleId(String scaleId);

  @JsonProperty("scaleDisplayName")
  String getScaleDisplayName();

  @JsonProperty("scaleDisplayName")
  void setScaleDisplayName(String scaleDisplayName);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
