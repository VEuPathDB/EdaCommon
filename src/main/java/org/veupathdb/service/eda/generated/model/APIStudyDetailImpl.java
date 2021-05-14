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
    "id",
    "datasetId",
    "rootEntity",
    "units",
    "scale"
})
public class APIStudyDetailImpl implements APIStudyDetail {
  @JsonProperty("id")
  private String id;

  @JsonProperty("datasetId")
  private String datasetId;

  @JsonProperty("rootEntity")
  private APIEntity rootEntity;

  @JsonProperty("units")
  private List<UnitsGroup> units;

  @JsonProperty("scale")
  private List<ScaleOption> scale;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new ExcludingMap();

  @JsonProperty("id")
  public String getId() {
    return this.id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("datasetId")
  public String getDatasetId() {
    return this.datasetId;
  }

  @JsonProperty("datasetId")
  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  @JsonProperty("rootEntity")
  public APIEntity getRootEntity() {
    return this.rootEntity;
  }

  @JsonProperty("rootEntity")
  public void setRootEntity(APIEntity rootEntity) {
    this.rootEntity = rootEntity;
  }

  @JsonProperty("units")
  public List<UnitsGroup> getUnits() {
    return this.units;
  }

  @JsonProperty("units")
  public void setUnits(List<UnitsGroup> units) {
    this.units = units;
  }

  @JsonProperty("scale")
  public List<ScaleOption> getScale() {
    return this.scale;
  }

  @JsonProperty("scale")
  public void setScale(List<ScaleOption> scale) {
    this.scale = scale;
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
