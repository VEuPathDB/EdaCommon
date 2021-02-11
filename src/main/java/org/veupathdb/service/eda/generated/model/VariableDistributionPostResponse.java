package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;

@JsonDeserialize(
    as = VariableDistributionPostResponseImpl.class
)
public interface VariableDistributionPostResponse {
  @JsonProperty("entitiesCount")
  int getEntitiesCount();

  @JsonProperty("entitiesCount")
  void setEntitiesCount(int entitiesCount);

  @JsonProperty("distribution")
  DistributionType getDistribution();

  @JsonProperty("distribution")
  void setDistribution(DistributionType distribution);

  @JsonDeserialize(
      as = VariableDistributionPostResponseImpl.DistributionTypeImpl.class
  )
  interface DistributionType {
    @JsonAnyGetter
    Map<String, Object> getAdditionalProperties();

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value);
  }
}
