package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(
    as = VariableSpecBaseIdsImpl.class
)
public interface VariableSpecBaseIds {
  @JsonProperty("entityId")
  String getEntityId();

  @JsonProperty("entityId")
  void setEntityId(String entityId);

  @JsonProperty("variableId")
  String getVariableId();

  @JsonProperty("variableId")
  void setVariableId(String variableId);
}
