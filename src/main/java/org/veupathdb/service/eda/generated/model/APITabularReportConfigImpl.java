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
    "sortingColumns",
    "pagingConfig"
})
public class APITabularReportConfigImpl implements APITabularReportConfig {
  @JsonProperty("sortingColumns")
  private List<String> sortingColumns;

  @JsonProperty("pagingConfig")
  private APIPagingConfig pagingConfig;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new ExcludingMap();

  @JsonProperty("sortingColumns")
  public List<String> getSortingColumns() {
    return this.sortingColumns;
  }

  @JsonProperty("sortingColumns")
  public void setSortingColumns(List<String> sortingColumns) {
    this.sortingColumns = sortingColumns;
  }

  @JsonProperty("pagingConfig")
  public APIPagingConfig getPagingConfig() {
    return this.pagingConfig;
  }

  @JsonProperty("pagingConfig")
  public void setPagingConfig(APIPagingConfig pagingConfig) {
    this.pagingConfig = pagingConfig;
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
