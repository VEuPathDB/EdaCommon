package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonDeserialize(
    as = APITabularReportConfigImpl.class
)
public interface APITabularReportConfig {
  @JsonProperty("sortingColumns")
  List<String> getSortingColumns();

  @JsonProperty("sortingColumns")
  void setSortingColumns(List<String> sortingColumns);

  @JsonProperty("pagingConfig")
  APIPagingConfig getPagingConfig();

  @JsonProperty("pagingConfig")
  void setPagingConfig(APIPagingConfig pagingConfig);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
