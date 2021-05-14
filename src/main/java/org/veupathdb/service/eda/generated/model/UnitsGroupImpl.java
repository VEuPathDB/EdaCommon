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
    "unitsGroupId",
    "displayName",
    "members"
})
public class UnitsGroupImpl implements UnitsGroup {
  @JsonProperty("unitsGroupId")
  private String unitsGroupId;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("members")
  private List<UnitOption> members;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new ExcludingMap();

  @JsonProperty("unitsGroupId")
  public String getUnitsGroupId() {
    return this.unitsGroupId;
  }

  @JsonProperty("unitsGroupId")
  public void setUnitsGroupId(String unitsGroupId) {
    this.unitsGroupId = unitsGroupId;
  }

  @JsonProperty("displayName")
  public String getDisplayName() {
    return this.displayName;
  }

  @JsonProperty("displayName")
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @JsonProperty("members")
  public List<UnitOption> getMembers() {
    return this.members;
  }

  @JsonProperty("members")
  public void setMembers(List<UnitOption> members) {
    this.members = members;
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
