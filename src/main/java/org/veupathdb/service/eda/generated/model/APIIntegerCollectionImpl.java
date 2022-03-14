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
    "displayName",
    "description",
    "vocabulary",
    "distinctValuesCount",
    "type",
    "variables",
    "units",
    "displayRangeMin",
    "displayRangeMax",
    "rangeMin",
    "rangeMax",
    "binWidth",
    "binWidthOverride"
})
public class APIIntegerCollectionImpl implements APIIntegerCollection {
  @JsonProperty("id")
  private String id;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("description")
  private String description;

  @JsonProperty("vocabulary")
  private List<String> vocabulary;

  @JsonProperty("distinctValuesCount")
  private Number distinctValuesCount;

  @JsonProperty("type")
  private final APICollectionType type = _DISCRIMINATOR_TYPE_NAME;

  @JsonProperty("variables")
  private List<APIVariable> variables;

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

  @JsonProperty("displayName")
  public String getDisplayName() {
    return this.displayName;
  }

  @JsonProperty("displayName")
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @JsonProperty("description")
  public String getDescription() {
    return this.description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
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

  @JsonProperty("type")
  public APICollectionType getType() {
    return this.type;
  }

  @JsonProperty("variables")
  public List<APIVariable> getVariables() {
    return this.variables;
  }

  @JsonProperty("variables")
  public void setVariables(List<APIVariable> variables) {
    this.variables = variables;
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
