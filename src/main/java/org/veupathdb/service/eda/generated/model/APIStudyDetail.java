package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonDeserialize(
    as = APIStudyDetailImpl.class
)
public interface APIStudyDetail {
  @JsonProperty("id")
  String getId();

  @JsonProperty("id")
  void setId(String id);

  @JsonProperty("datasetId")
  String getDatasetId();

  @JsonProperty("datasetId")
  void setDatasetId(String datasetId);

  @JsonProperty("rootEntity")
  APIEntity getRootEntity();

  @JsonProperty("rootEntity")
  void setRootEntity(APIEntity rootEntity);

  @JsonProperty("units")
  List<UnitsGroup> getUnits();

  @JsonProperty("units")
  void setUnits(List<UnitsGroup> units);

  @JsonProperty("scale")
  List<ScaleOption> getScale();

  @JsonProperty("scale")
  void setScale(List<ScaleOption> scale);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
