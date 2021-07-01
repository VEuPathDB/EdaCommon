package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(org.veupathdb.service.eda.generated.model.APIStringVariable.class),
    @JsonSubTypes.Type(org.veupathdb.service.eda.generated.model.APIDateVariable.class),
    @JsonSubTypes.Type(org.veupathdb.service.eda.generated.model.APILongitudeVariable.class),
    @JsonSubTypes.Type(org.veupathdb.service.eda.generated.model.APIVariablesCategory.class),
    @JsonSubTypes.Type(org.veupathdb.service.eda.generated.model.APINumberVariable.class),
    @JsonSubTypes.Type(org.veupathdb.service.eda.generated.model.APIVariable.class)
})
@JsonDeserialize(
    as = APIVariableImpl.class
)
public interface APIVariable {
  APIVariableType _DISCRIMINATOR_TYPE_NAME = null;

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

  @JsonProperty("type")
  APIVariableType getType();

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

  @JsonProperty("displayOrder")
  Number getDisplayOrder();

  @JsonProperty("displayOrder")
  void setDisplayOrder(Number displayOrder);

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
