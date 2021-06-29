package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numRows",
    "offset"
})
public class APIPagingConfigImpl implements APIPagingConfig {
  @JsonProperty("numRows")
  private int numRows;

  @JsonProperty("offset")
  private int offset;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new ExcludingMap();

  @JsonProperty("numRows")
  public int getNumRows() {
    return this.numRows;
  }

  @JsonProperty("numRows")
  public void setNumRows(int numRows) {
    this.numRows = numRows;
  }

  @JsonProperty("offset")
  public int getOffset() {
    return this.offset;
  }

  @JsonProperty("offset")
  public void setOffset(int offset) {
    this.offset = offset;
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
