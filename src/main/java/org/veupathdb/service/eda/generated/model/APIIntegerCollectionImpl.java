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
    "type",
    "dataShape",
    "vocabulary",
    "distinctValuesCount",
    "memberVariableIds",
    "imputeZero",
    "units",
    "displayRangeMin",
    "displayRangeMax",
    "rangeMin",
    "rangeMax",
    "binWidthOverride"
})
public class APIIntegerCollectionImpl implements APIIntegerCollection {
  @JsonProperty("id")
  private String id;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("type")
  private final APICollectionType type = _DISCRIMINATOR_TYPE_NAME;

  @JsonProperty("dataShape")
  private APIVariableDataShape dataShape;

  @JsonProperty("vocabulary")
  private List<String> vocabulary;

  @JsonProperty("distinctValuesCount")
  private Long distinctValuesCount;

  @JsonProperty("memberVariableIds")
  private List<String> memberVariableIds;

  @JsonProperty("imputeZero")
  private Boolean imputeZero;

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

  @JsonProperty("binWidthOverride")
  private Integer binWidthOverride;

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

  @JsonProperty("type")
  public APICollectionType getType() {
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
  public Long getDistinctValuesCount() {
    return this.distinctValuesCount;
  }

  @JsonProperty("distinctValuesCount")
  public void setDistinctValuesCount(Long distinctValuesCount) {
    this.distinctValuesCount = distinctValuesCount;
  }

  @JsonProperty("memberVariableIds")
  public List<String> getMemberVariableIds() {
    return this.memberVariableIds;
  }

  @JsonProperty("memberVariableIds")
  public void setMemberVariableIds(List<String> memberVariableIds) {
    this.memberVariableIds = memberVariableIds;
  }

  @JsonProperty("imputeZero")
  public Boolean getImputeZero() {
    return this.imputeZero;
  }

  @JsonProperty("imputeZero")
  public void setImputeZero(Boolean imputeZero) {
    this.imputeZero = imputeZero;
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

  @JsonProperty("binWidthOverride")
  public Integer getBinWidthOverride() {
    return this.binWidthOverride;
  }

  @JsonProperty("binWidthOverride")
  public void setBinWidthOverride(Integer binWidthOverride) {
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
