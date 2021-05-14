package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeName("longitude")
@JsonPropertyOrder({
    "id",
    "providerLabel",
    "displayName",
    "parentId",
    "type",
    "isMultiValued",
    "displayType",
    "dataShape",
    "isFeatured",
    "isTemporal",
    "unitsGroupId",
    "defaultUnitsId",
    "defaultScaleId"
})
public class APILongitudeVariableImpl implements APILongitudeVariable {
  @JsonProperty("id")
  private String id;

  @JsonProperty("providerLabel")
  private String providerLabel;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("parentId")
  private String parentId;

  @JsonProperty("type")
  private final APIVariableType type = _DISCRIMINATOR_TYPE_NAME;

  @JsonProperty("isMultiValued")
  private boolean isMultiValued;

  @JsonProperty("displayType")
  private APIVariableDisplayType displayType;

  @JsonProperty("dataShape")
  private APIVariableDataShape dataShape;

  @JsonProperty("isFeatured")
  private boolean isFeatured;

  @JsonProperty("isTemporal")
  private boolean isTemporal;

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

  @JsonProperty("parentId")
  public String getParentId() {
    return this.parentId;
  }

  @JsonProperty("parentId")
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  @JsonProperty("type")
  public APIVariableType getType() {
    return this.type;
  }

  @JsonProperty("isMultiValued")
  public boolean getIsMultiValued() {
    return this.isMultiValued;
  }

  @JsonProperty("isMultiValued")
  public void setIsMultiValued(boolean isMultiValued) {
    this.isMultiValued = isMultiValued;
  }

  @JsonProperty("displayType")
  public APIVariableDisplayType getDisplayType() {
    return this.displayType;
  }

  @JsonProperty("displayType")
  public void setDisplayType(APIVariableDisplayType displayType) {
    this.displayType = displayType;
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
