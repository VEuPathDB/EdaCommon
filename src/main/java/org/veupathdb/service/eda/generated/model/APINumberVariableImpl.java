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
@JsonTypeName("number")
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
    "unitsId",
    "unitsDisplayName",
    "precision",
    "scaleId",
    "scaleDisplayName"
})
public class APINumberVariableImpl implements APINumberVariable {
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

  @JsonProperty("unitsId")
  private String unitsId;

  @JsonProperty("unitsDisplayName")
  private String unitsDisplayName;

  @JsonProperty("precision")
  private int precision;

  @JsonProperty("scaleId")
  private String scaleId;

  @JsonProperty("scaleDisplayName")
  private String scaleDisplayName;

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

  @JsonProperty("unitsId")
  public String getUnitsId() {
    return this.unitsId;
  }

  @JsonProperty("unitsId")
  public void setUnitsId(String unitsId) {
    this.unitsId = unitsId;
  }

  @JsonProperty("unitsDisplayName")
  public String getUnitsDisplayName() {
    return this.unitsDisplayName;
  }

  @JsonProperty("unitsDisplayName")
  public void setUnitsDisplayName(String unitsDisplayName) {
    this.unitsDisplayName = unitsDisplayName;
  }

  @JsonProperty("precision")
  public int getPrecision() {
    return this.precision;
  }

  @JsonProperty("precision")
  public void setPrecision(int precision) {
    this.precision = precision;
  }

  @JsonProperty("scaleId")
  public String getScaleId() {
    return this.scaleId;
  }

  @JsonProperty("scaleId")
  public void setScaleId(String scaleId) {
    this.scaleId = scaleId;
  }

  @JsonProperty("scaleDisplayName")
  public String getScaleDisplayName() {
    return this.scaleDisplayName;
  }

  @JsonProperty("scaleDisplayName")
  public void setScaleDisplayName(String scaleDisplayName) {
    this.scaleDisplayName = scaleDisplayName;
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
