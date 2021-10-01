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
  @JsonProperty("sorting")
  List<SortSpecEntry> getSorting();

  @JsonProperty("sorting")
  void setSorting(List<SortSpecEntry> sorting);

  @JsonProperty("paging")
  APIPagingConfig getPaging();

  @JsonProperty("paging")
  void setPaging(APIPagingConfig paging);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
