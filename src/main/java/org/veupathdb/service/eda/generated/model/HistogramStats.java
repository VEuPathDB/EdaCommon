package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(
    as = HistogramStatsImpl.class
)
public interface HistogramStats {
  @JsonProperty("subsetSize")
  Integer getSubsetSize();

  @JsonProperty("subsetSize")
  void setSubsetSize(Integer subsetSize);

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
  Integer getNumVarValues();

  @JsonProperty("numVarValues")
  void setNumVarValues(Integer numVarValues);

  @JsonProperty("numDistinctValues")
  Integer getNumDistinctValues();

  @JsonProperty("numDistinctValues")
  void setNumDistinctValues(Integer numDistinctValues);

  @JsonProperty("numDistinctEntityRecords")
  Integer getNumDistinctEntityRecords();

  @JsonProperty("numDistinctEntityRecords")
  void setNumDistinctEntityRecords(Integer numDistinctEntityRecords);

  @JsonProperty("numMissingCases")
  Integer getNumMissingCases();

  @JsonProperty("numMissingCases")
  void setNumMissingCases(Integer numMissingCases);
}
