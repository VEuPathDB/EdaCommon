package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "parentId",
    "providerLabel",
    "displayName",
    "definition",
    "vocabulary",
    "displayType",
    "type",
    "dataShape",
    "isFeatured",
    "isTemporal",
    "displayOrder",
    "unitsGroupId",
    "defaultUnitsId",
    "defaultScaleId"
})
public class APIVariableImpl implements APIVariable {
  @JsonProperty("id")
  private String id;

  @JsonProperty("parentId")
  private String parentId;

  @JsonProperty("providerLabel")
  private String providerLabel;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("definition")
  private String definition;

  @JsonProperty("vocabulary")
  private List<String> vocabulary;

  @JsonProperty("displayType")
  private APIVariableDisplayType displayType;

  @JsonProperty("type")
  private final APIVariableType type = _DISCRIMINATOR_TYPE_NAME;

  @JsonProperty("dataShape")
  private APIVariableDataShape dataShape;

  @JsonProperty("isFeatured")
  private boolean isFeatured;

  @JsonProperty("isTemporal")
  private boolean isTemporal;

  @JsonProperty("displayOrder")
  private Number displayOrder;

  @JsonProperty("unitsGroupId")
  private String unitsGroupId;

  @JsonProperty("defaultUnitsId")
  private String defaultUnitsId;

  @JsonProperty("defaultScaleId")
  private String defaultScaleId;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new ExcludingMap();

  @JsonProperty("id")
  public String getId() {
    return this.id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("parentId")
  public String getParentId() {
    return this.parentId;
  }

  @JsonProperty("parentId")
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  @JsonProperty("providerLabel")
  public String getProviderLabel() {
    return this.providerLabel;
  }

  @JsonProperty("providerLabel")
  public void setProviderLabel(String providerLabel) {
    this.providerLabel = providerLabel;
  }

  @JsonProperty("displayName")
  public String getDisplayName() {
    return this.displayName;
  }

  @JsonProperty("displayName")
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @JsonProperty("definition")
  public String getDefinition() {
    return this.definition;
  }

  @JsonProperty("definition")
  public void setDefinition(String definition) {
    this.definition = definition;
  }

  @JsonProperty("vocabulary")
  public List<String> getVocabulary() {
    return this.vocabulary;
  }

  @JsonProperty("vocabulary")
  public void setVocabulary(List<String> vocabulary) {
    this.vocabulary = vocabulary;
  }

  @JsonProperty("displayType")
  public APIVariableDisplayType getDisplayType() {
    return this.displayType;
  }

  @JsonProperty("displayType")
  public void setDisplayType(APIVariableDisplayType displayType) {
    this.displayType = displayType;
  }

  @JsonProperty("type")
  public APIVariableType getType() {
    return this.type;
  }

  @JsonProperty("dataShape")
  public APIVariableDataShape getDataShape() {
    return this.dataShape;
  }

  @JsonProperty("dataShape")
  public void setDataShape(APIVariableDataShape dataShape) {
    this.dataShape = dataShape;
  }

  @JsonProperty("isFeatured")
  public boolean getIsFeatured() {
    return this.isFeatured;
  }

  @JsonProperty("isFeatured")
  public void setIsFeatured(boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  @JsonProperty("isTemporal")
  public boolean getIsTemporal() {
    return this.isTemporal;
  }

  @JsonProperty("isTemporal")
  public void setIsTemporal(boolean isTemporal) {
    this.isTemporal = isTemporal;
  }

  @JsonProperty("displayOrder")
  public Number getDisplayOrder() {
    return this.displayOrder;
  }

  @JsonProperty("displayOrder")
  public void setDisplayOrder(Number displayOrder) {
    this.displayOrder = displayOrder;
  }

  @JsonProperty("unitsGroupId")
  public String getUnitsGroupId() {
    return this.unitsGroupId;
  }

  @JsonProperty("unitsGroupId")
  public void setUnitsGroupId(String unitsGroupId) {
    this.unitsGroupId = unitsGroupId;
  }

  @JsonProperty("defaultUnitsId")
  public String getDefaultUnitsId() {
    return this.defaultUnitsId;
  }

  @JsonProperty("defaultUnitsId")
  public void setDefaultUnitsId(String defaultUnitsId) {
    this.defaultUnitsId = defaultUnitsId;
  }

  @JsonProperty("defaultScaleId")
  public String getDefaultScaleId() {
    return this.defaultScaleId;
  }

  @JsonProperty("defaultScaleId")
  public void setDefaultScaleId(String defaultScaleId) {
    this.defaultScaleId = defaultScaleId;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperties(String key, Object value) {
    this.additionalProperties.put(key, value);
  }
}
