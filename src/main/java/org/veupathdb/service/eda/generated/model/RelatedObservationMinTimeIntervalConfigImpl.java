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
    "relatedObservationsSubset",
    "anchorVariable",
    "anchorVariableTrueValues",
    "targetVariable",
    "targetVariableTrueValues",
    "timestampVariable",
    "minimumTimeIntervalDays"
})
public class RelatedObservationMinTimeIntervalConfigImpl implements RelatedObservationMinTimeIntervalConfig {
  @JsonProperty("relatedObservationsSubset")
  private List<APIFilter> relatedObservationsSubset;

  @JsonProperty("anchorVariable")
  private VariableSpec anchorVariable;

  @JsonProperty("anchorVariableTrueValues")
  private List<String> anchorVariableTrueValues;

  @JsonProperty("targetVariable")
  private VariableSpec targetVariable;

  @JsonProperty("targetVariableTrueValues")
  private List<String> targetVariableTrueValues;

  @JsonProperty("timestampVariable")
  private VariableSpec timestampVariable;

  @JsonProperty("minimumTimeIntervalDays")
  private Integer minimumTimeIntervalDays;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new ExcludingMap();

  @JsonProperty("relatedObservationsSubset")
  public List<APIFilter> getRelatedObservationsSubset() {
    return this.relatedObservationsSubset;
  }

  @JsonProperty("relatedObservationsSubset")
  public void setRelatedObservationsSubset(List<APIFilter> relatedObservationsSubset) {
    this.relatedObservationsSubset = relatedObservationsSubset;
  }

  @JsonProperty("anchorVariable")
  public VariableSpec getAnchorVariable() {
    return this.anchorVariable;
  }

  @JsonProperty("anchorVariable")
  public void setAnchorVariable(VariableSpec anchorVariable) {
    this.anchorVariable = anchorVariable;
  }

  @JsonProperty("anchorVariableTrueValues")
  public List<String> getAnchorVariableTrueValues() {
    return this.anchorVariableTrueValues;
  }

  @JsonProperty("anchorVariableTrueValues")
  public void setAnchorVariableTrueValues(List<String> anchorVariableTrueValues) {
    this.anchorVariableTrueValues = anchorVariableTrueValues;
  }

  @JsonProperty("targetVariable")
  public VariableSpec getTargetVariable() {
    return this.targetVariable;
  }

  @JsonProperty("targetVariable")
  public void setTargetVariable(VariableSpec targetVariable) {
    this.targetVariable = targetVariable;
  }

  @JsonProperty("targetVariableTrueValues")
  public List<String> getTargetVariableTrueValues() {
    return this.targetVariableTrueValues;
  }

  @JsonProperty("targetVariableTrueValues")
  public void setTargetVariableTrueValues(List<String> targetVariableTrueValues) {
    this.targetVariableTrueValues = targetVariableTrueValues;
  }

  @JsonProperty("timestampVariable")
  public VariableSpec getTimestampVariable() {
    return this.timestampVariable;
  }

  @JsonProperty("timestampVariable")
  public void setTimestampVariable(VariableSpec timestampVariable) {
    this.timestampVariable = timestampVariable;
  }

  @JsonProperty("minimumTimeIntervalDays")
  public Integer getMinimumTimeIntervalDays() {
    return this.minimumTimeIntervalDays;
  }

  @JsonProperty("minimumTimeIntervalDays")
  public void setMinimumTimeIntervalDays(Integer minimumTimeIntervalDays) {
    this.minimumTimeIntervalDays = minimumTimeIntervalDays;
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
