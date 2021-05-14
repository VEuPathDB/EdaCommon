package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonDeserialize(
    as = UnitsGroupImpl.class
)
public interface UnitsGroup {
  @JsonProperty("unitsGroupId")
  String getUnitsGroupId();

  @JsonProperty("unitsGroupId")
  void setUnitsGroupId(String unitsGroupId);

  @JsonProperty("displayName")
  String getDisplayName();

  @JsonProperty("displayName")
  void setDisplayName(String displayName);

  @JsonProperty("members")
  List<UnitOption> getMembers();

  @JsonProperty("members")
  void setMembers(List<UnitOption> members);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);
}
