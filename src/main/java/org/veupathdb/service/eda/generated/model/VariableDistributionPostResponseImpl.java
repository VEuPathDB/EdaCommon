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
    "entitiesCount",
    "distribution"
})
public class VariableDistributionPostResponseImpl implements VariableDistributionPostResponse {
  @JsonProperty("entitiesCount")
  private int entitiesCount;

  @JsonProperty("distribution")
  private VariableDistributionPostResponse.DistributionType distribution;

  @JsonProperty("entitiesCount")
  public int getEntitiesCount() {
    return this.entitiesCount;
  }

  @JsonProperty("entitiesCount")
  public void setEntitiesCount(int entitiesCount) {
    this.entitiesCount = entitiesCount;
  }

  @JsonProperty("distribution")
  public VariableDistributionPostResponse.DistributionType getDistribution() {
    return this.distribution;
  }

  @JsonProperty("distribution")
  public void setDistribution(VariableDistributionPostResponse.DistributionType distribution) {
    this.distribution = distribution;
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonPropertyOrder
  public static class DistributionTypeImpl implements VariableDistributionPostResponse.DistributionType {
    @JsonIgnore
    private Map<String, Object> additionalProperties = new ExcludingMap();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
      return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String key, Object value) {
      this.additionalProperties.put(key, value);
    }
  }
}
