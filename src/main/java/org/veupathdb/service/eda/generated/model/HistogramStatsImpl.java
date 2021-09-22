package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subsetSize",
    "subsetMin",
    "subsetMax",
    "subsetMean",
    "numVarValues",
    "numDistinctValues",
    "numDistinctEntityRecords",
    "numMissingCases"
})
public class HistogramStatsImpl implements HistogramStats {
  @JsonProperty("subsetSize")
  private Integer subsetSize;

  @JsonProperty("subsetMin")
  private Object subsetMin;

  @JsonProperty("subsetMax")
  private Object subsetMax;

  @JsonProperty("subsetMean")
  private Object subsetMean;

  @JsonProperty("numVarValues")
  private Integer numVarValues;

  @JsonProperty("numDistinctValues")
  private Integer numDistinctValues;

  @JsonProperty("numDistinctEntityRecords")
  private Integer numDistinctEntityRecords;

  @JsonProperty("numMissingCases")
  private Integer numMissingCases;

  @JsonProperty("subsetSize")
  public Integer getSubsetSize() {
    return this.subsetSize;
  }

  @JsonProperty("subsetSize")
  public void setSubsetSize(Integer subsetSize) {
    this.subsetSize = subsetSize;
  }

  @JsonProperty("subsetMin")
  public Object getSubsetMin() {
    return this.subsetMin;
  }

  @JsonProperty("subsetMin")
  public void setSubsetMin(Object subsetMin) {
    this.subsetMin = subsetMin;
  }

  @JsonProperty("subsetMax")
  public Object getSubsetMax() {
    return this.subsetMax;
  }

  @JsonProperty("subsetMax")
  public void setSubsetMax(Object subsetMax) {
    this.subsetMax = subsetMax;
  }

  @JsonProperty("subsetMean")
  public Object getSubsetMean() {
    return this.subsetMean;
  }

  @JsonProperty("subsetMean")
  public void setSubsetMean(Object subsetMean) {
    this.subsetMean = subsetMean;
  }

  @JsonProperty("numVarValues")
  public Integer getNumVarValues() {
    return this.numVarValues;
  }

  @JsonProperty("numVarValues")
  public void setNumVarValues(Integer numVarValues) {
    this.numVarValues = numVarValues;
  }

  @JsonProperty("numDistinctValues")
  public Integer getNumDistinctValues() {
    return this.numDistinctValues;
  }

  @JsonProperty("numDistinctValues")
  public void setNumDistinctValues(Integer numDistinctValues) {
    this.numDistinctValues = numDistinctValues;
  }

  @JsonProperty("numDistinctEntityRecords")
  public Integer getNumDistinctEntityRecords() {
    return this.numDistinctEntityRecords;
  }

  @JsonProperty("numDistinctEntityRecords")
  public void setNumDistinctEntityRecords(Integer numDistinctEntityRecords) {
    this.numDistinctEntityRecords = numDistinctEntityRecords;
  }

  @JsonProperty("numMissingCases")
  public Integer getNumMissingCases() {
    return this.numMissingCases;
  }

  @JsonProperty("numMissingCases")
  public void setNumMissingCases(Integer numMissingCases) {
    this.numMissingCases = numMissingCases;
  }
}
