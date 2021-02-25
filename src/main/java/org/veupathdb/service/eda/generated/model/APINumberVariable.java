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

  @JsonProperty("units")
  String getUnits();

  @JsonProperty("units")
  void setUnits(String units);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
