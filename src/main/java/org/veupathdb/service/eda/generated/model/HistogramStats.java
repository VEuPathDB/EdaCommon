package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(
    as = HistogramStatsImpl.class
)
public interface HistogramStats {
  @JsonProperty("subsetMin")
  Object getSubsetMin();

  @JsonProperty("subsetMin")
  void setSubsetMin(Object subsetMin);

  @JsonProperty("subsetMax")
  Object getSubsetMax();

  @JsonProperty("subsetMax")
  void setSubsetMax(Object subsetMax);

  @JsonProperty("subsetMean")
  Object getSubsetMean();

  @JsonProperty("subsetMean")
  void setSubsetMean(Object subsetMean);

  @JsonProperty("numVarValues")
  int getNumVarValues();

  @JsonProperty("numVarValues")
  void setNumVarValues(int numVarValues);

  @JsonProperty("numDistinctValues")
  int getNumDistinctValues();

  @JsonProperty("numDistinctValues")
  void setNumDistinctValues(int numDistinctValues);

  @JsonProperty("numDistinctEntityRecords")
  int getNumDistinctEntityRecords();

  @JsonProperty("numDistinctEntityRecords")
  void setNumDistinctEntityRecords(int numDistinctEntityRecords);

  @JsonProperty("numMissingCases")
  int getNumMissingCases();

  @JsonProperty("numMissingCases")
  void setNumMissingCases(int numMissingCases);
}
