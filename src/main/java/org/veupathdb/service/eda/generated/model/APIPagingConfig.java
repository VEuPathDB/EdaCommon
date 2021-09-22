package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;

@JsonDeserialize(
    as = APIPagingConfigImpl.class
)
public interface APIPagingConfig {
  @JsonProperty("numRows")
  Integer getNumRows();

  @JsonProperty("numRows")
  void setNumRows(Integer numRows);

  @JsonProperty("offset")
  Integer getOffset();

  @JsonProperty("offset")
  void setOffset(Integer offset);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
