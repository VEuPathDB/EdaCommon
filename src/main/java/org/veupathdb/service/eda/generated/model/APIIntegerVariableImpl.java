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
    "displayType",
    "displayOrder",
    "isCategory",
    "type",
    "dataShape",
    "vocabulary",
    "distinctValuesCount",
    "isTemporal",
    "isFeatured",
    "isMergeKey",
    "isMultiValued",
    "units",
    "displayRangeMin",
    "displayRangeMax",
    "rangeMin",
    "rangeMax",
    "binWidth",
    "binWidthOverride"
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

  @JsonProperty("displayType")
  private APIVariableDisplayType displayType;

  @JsonProperty("displayOrder")
  private Number displayOrder;

  @JsonProperty("isCategory")
  private String isCategory;

  @JsonProperty("type")
  private final APIVariableType type = _DISCRIMINATOR_TYPE_NAME;

  @JsonProperty("dataShape")
  private APIVariableDataShape dataShape;

  @JsonProperty("vocabulary")
  private List<String> vocabulary;

  @JsonProperty("distinctValuesCount")
  private Number distinctValuesCount;

  @JsonProperty("isTemporal")
  private Boolean isTemporal;

  @JsonProperty("isFeatured")
  private Boolean isFeatured;

  @JsonProperty("isMergeKey")
  private Boolean isMergeKey;

  @JsonProperty("isMultiValued")
  private Boolean isMultiValued;

  @JsonProperty("units")
  private String units;

  @JsonProperty("displayRangeMin")
  private Long displayRangeMin;

  @JsonProperty("displayRangeMax")
  private Long displayRangeMax;

  @JsonProperty("rangeMin")
  private Long rangeMin;

  @JsonProperty("rangeMax")
  private Long rangeMax;

  @JsonProperty("binWidth")
  private Long binWidth;

  @JsonProperty("binWidthOverride")
  private Long binWidthOverride;

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

  @JsonProperty("isCategory")
  public String getIsCategory() {
    return this.isCategory;
  }

  @JsonProperty("isCategory")
  public void setIsCategory(String isCategory) {
    this.isCategory = isCategory;
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

  @JsonProperty("vocabulary")
  public List<String> getVocabulary() {
    return this.vocabulary;
  }

  @JsonProperty("vocabulary")
  public void setVocabulary(List<String> vocabulary) {
    this.vocabulary = vocabulary;
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
  public Boolean getIsTemporal() {
    return this.isTemporal;
  }

  @JsonProperty("isTemporal")
  public void setIsTemporal(Boolean isTemporal) {
    this.isTemporal = isTemporal;
  }

  @JsonProperty("isFeatured")
  public Boolean getIsFeatured() {
    return this.isFeatured;
  }

  @JsonProperty("isFeatured")
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  @JsonProperty("isMergeKey")
  public Boolean getIsMergeKey() {
    return this.isMergeKey;
  }

  @JsonProperty("isMergeKey")
  public void setIsMergeKey(Boolean isMergeKey) {
    this.isMergeKey = isMergeKey;
  }

  @JsonProperty("isMultiValued")
  public Boolean getIsMultiValued() {
    return this.isMultiValued;
  }

  @JsonProperty("isMultiValued")
  public void setIsMultiValued(Boolean isMultiValued) {
    this.isMultiValued = isMultiValued;
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
  public Long getDisplayRangeMin() {
    return this.displayRangeMin;
  }

  @JsonProperty("displayRangeMin")
  public void setDisplayRangeMin(Long displayRangeMin) {
    this.displayRangeMin = displayRangeMin;
  }

  @JsonProperty("displayRangeMax")
  public Long getDisplayRangeMax() {
    return this.displayRangeMax;
  }

  @JsonProperty("displayRangeMax")
  public void setDisplayRangeMax(Long displayRangeMax) {
    this.displayRangeMax = displayRangeMax;
  }

  @JsonProperty("rangeMin")
  public Long getRangeMin() {
    return this.rangeMin;
  }

  @JsonProperty("rangeMin")
  public void setRangeMin(Long rangeMin) {
    this.rangeMin = rangeMin;
  }

  @JsonProperty("rangeMax")
  public Long getRangeMax() {
    return this.rangeMax;
  }

  @JsonProperty("rangeMax")
  public void setRangeMax(Long rangeMax) {
    this.rangeMax = rangeMax;
  }

  @JsonProperty("binWidth")
  public Long getBinWidth() {
    return this.binWidth;
  }

  @JsonProperty("binWidth")
  public void setBinWidth(Long binWidth) {
    this.binWidth = binWidth;
  }

  @JsonProperty("binWidthOverride")
  public Long getBinWidthOverride() {
    return this.binWidthOverride;
  }

  @JsonProperty("binWidthOverride")
  public void setBinWidthOverride(Long binWidthOverride) {
    this.binWidthOverride = binWidthOverride;
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
