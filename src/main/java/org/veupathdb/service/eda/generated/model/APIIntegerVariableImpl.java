package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeName("integer")
@JsonPropertyOrder({
    "id",
    "parentId",
    "providerLabel",
    "displayName",
    "definition",
    "vocabulary",
    "displayType",
    "displayOrder",
    "type",
    "dataShape",
    "units",
    "displayRangeMin",
    "displayRangeMax",
    "rangeMin",
    "rangeMax",
    "binWidthOverride",
    "binWidth",
    "distinctValuesCount",
    "isTemporal",
    "isFeatured",
    "isMergeKey",
    "isMultiValued"
})
public class APIIntegerVariableImpl implements APIIntegerVariable {
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

  @JsonProperty("displayOrder")
  private Number displayOrder;

  @JsonProperty("type")
  private final APIVariableType type = _DISCRIMINATOR_TYPE_NAME;

  @JsonProperty("dataShape")
  private APIVariableDataShape dataShape;

  @JsonProperty("units")
  private String units;

  @JsonProperty("displayRangeMin")
  private Number displayRangeMin;

  @JsonProperty("displayRangeMax")
  private Number displayRangeMax;

  @JsonProperty("rangeMin")
  private Number rangeMin;

  @JsonProperty("rangeMax")
  private Number rangeMax;

  @JsonProperty("binWidthOverride")
  private Number binWidthOverride;

  @JsonProperty("binWidth")
  private Number binWidth;

  @JsonProperty("distinctValuesCount")
  private Number distinctValuesCount;

  @JsonProperty("isTemporal")
  private boolean isTemporal;

  @JsonProperty("isFeatured")
  private boolean isFeatured;

  @JsonProperty("isMergeKey")
  private boolean isMergeKey;

  @JsonProperty("isMultiValued")
  private boolean isMultiValued;

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

  @JsonProperty("displayOrder")
  public Number getDisplayOrder() {
    return this.displayOrder;
  }

  @JsonProperty("displayOrder")
  public void setDisplayOrder(Number displayOrder) {
    this.displayOrder = displayOrder;
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

  @JsonProperty("units")
  public String getUnits() {
    return this.units;
  }

  @JsonProperty("units")
  public void setUnits(String units) {
    this.units = units;
  }

  @JsonProperty("displayRangeMin")
  public Number getDisplayRangeMin() {
    return this.displayRangeMin;
  }

  @JsonProperty("displayRangeMin")
  public void setDisplayRangeMin(Number displayRangeMin) {
    this.displayRangeMin = displayRangeMin;
  }

  @JsonProperty("displayRangeMax")
  public Number getDisplayRangeMax() {
    return this.displayRangeMax;
  }

  @JsonProperty("displayRangeMax")
  public void setDisplayRangeMax(Number displayRangeMax) {
    this.displayRangeMax = displayRangeMax;
  }

  @JsonProperty("rangeMin")
  public Number getRangeMin() {
    return this.rangeMin;
  }

  @JsonProperty("rangeMin")
  public void setRangeMin(Number rangeMin) {
    this.rangeMin = rangeMin;
  }

  @JsonProperty("rangeMax")
  public Number getRangeMax() {
    return this.rangeMax;
  }

  @JsonProperty("rangeMax")
  public void setRangeMax(Number rangeMax) {
    this.rangeMax = rangeMax;
  }

  @JsonProperty("binWidthOverride")
  public Number getBinWidthOverride() {
    return this.binWidthOverride;
  }

  @JsonProperty("binWidthOverride")
  public void setBinWidthOverride(Number binWidthOverride) {
    this.binWidthOverride = binWidthOverride;
  }

  @JsonProperty("binWidth")
  public Number getBinWidth() {
    return this.binWidth;
  }

  @JsonProperty("binWidth")
  public void setBinWidth(Number binWidth) {
    this.binWidth = binWidth;
  }

  @JsonProperty("distinctValuesCount")
  public Number getDistinctValuesCount() {
    return this.distinctValuesCount;
  }

  @JsonProperty("distinctValuesCount")
  public void setDistinctValuesCount(Number distinctValuesCount) {
    this.distinctValuesCount = distinctValuesCount;
  }

  @JsonProperty("isTemporal")
  public boolean getIsTemporal() {
    return this.isTemporal;
  }

  @JsonProperty("isTemporal")
  public void setIsTemporal(boolean isTemporal) {
    this.isTemporal = isTemporal;
  }

  @JsonProperty("isFeatured")
  public boolean getIsFeatured() {
    return this.isFeatured;
  }

  @JsonProperty("isFeatured")
  public void setIsFeatured(boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  @JsonProperty("isMergeKey")
  public boolean getIsMergeKey() {
    return this.isMergeKey;
  }

  @JsonProperty("isMergeKey")
  public void setIsMergeKey(boolean isMergeKey) {
    this.isMergeKey = isMergeKey;
  }

  @JsonProperty("isMultiValued")
  public boolean getIsMultiValued() {
    return this.isMultiValued;
  }

  @JsonProperty("isMultiValued")
  public void setIsMultiValued(boolean isMultiValued) {
    this.isMultiValued = isMultiValued;
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
