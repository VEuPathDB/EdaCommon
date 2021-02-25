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
    "units"
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

  @JsonProperty("units")
  private String units;

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

  @JsonProperty("units")
  public String getUnits() {
    return this.units;
  }

  @JsonProperty("units")
  public void setUnits(String units) {
    this.units = units;
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
