package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "subsetMin",
    "subsetMax",
    "subsetMean",
    "numVarValues",
    "numDistinctValues",
    "numDistinctEntityRecords",
    "numMissingCases"
})
public class HistogramStatsImpl implements HistogramStats {
  @JsonProperty("subsetMin")
  private Object subsetMin;

  @JsonProperty("subsetMax")
  private Object subsetMax;

  @JsonProperty("subsetMean")
  private Object subsetMean;

  @JsonProperty("numVarValues")
  private int numVarValues;

  @JsonProperty("numDistinctValues")
  private int numDistinctValues;

  @JsonProperty("numDistinctEntityRecords")
  private int numDistinctEntityRecords;

  @JsonProperty("numMissingCases")
  private int numMissingCases;

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
  public int getNumVarValues() {
    return this.numVarValues;
  }

  @JsonProperty("numVarValues")
  public void setNumVarValues(int numVarValues) {
    this.numVarValues = numVarValues;
  }

  @JsonProperty("numDistinctValues")
  public int getNumDistinctValues() {
    return this.numDistinctValues;
  }

  @JsonProperty("numDistinctValues")
  public void setNumDistinctValues(int numDistinctValues) {
    this.numDistinctValues = numDistinctValues;
  }

  @JsonProperty("numDistinctEntityRecords")
  public int getNumDistinctEntityRecords() {
    return this.numDistinctEntityRecords;
  }

  @JsonProperty("numDistinctEntityRecords")
  public void setNumDistinctEntityRecords(int numDistinctEntityRecords) {
    this.numDistinctEntityRecords = numDistinctEntityRecords;
  }

  @JsonProperty("numMissingCases")
  public int getNumMissingCases() {
    return this.numMissingCases;
  }

  @JsonProperty("numMissingCases")
  public void setNumMissingCases(int numMissingCases) {
    this.numMissingCases = numMissingCases;
  }
}
