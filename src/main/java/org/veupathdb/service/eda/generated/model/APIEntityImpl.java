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
    "idColumnName",
    "displayName",
    "displayNamePlural",
    "description",
    "children",
    "variables"
})
public class APIEntityImpl implements APIEntity {
  @JsonProperty("id")
  private String id;

  @JsonProperty("idColumnName")
  private String idColumnName;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("displayNamePlural")
  private String displayNamePlural;

  @JsonProperty("description")
  private String description;

  @JsonProperty("children")
  private List<APIEntity> children;

  @JsonProperty("variables")
  private List<APIVariable> variables;

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

  @JsonProperty("idColumnName")
  public String getIdColumnName() {
    return this.idColumnName;
  }

  @JsonProperty("idColumnName")
  public void setIdColumnName(String idColumnName) {
    this.idColumnName = idColumnName;
  }

  @JsonProperty("displayName")
  public String getDisplayName() {
    return this.displayName;
  }

  @JsonProperty("displayName")
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @JsonProperty("displayNamePlural")
  public String getDisplayNamePlural() {
    return this.displayNamePlural;
  }

  @JsonProperty("displayNamePlural")
  public void setDisplayNamePlural(String displayNamePlural) {
    this.displayNamePlural = displayNamePlural;
  }

  @JsonProperty("description")
  public String getDescription() {
    return this.description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  @JsonProperty("children")
  public List<APIEntity> getChildren() {
    return this.children;
  }

  @JsonProperty("children")
  public void setChildren(List<APIEntity> children) {
    this.children = children;
  }

  @JsonProperty("variables")
  public List<APIVariable> getVariables() {
    return this.variables;
  }

  @JsonProperty("variables")
  public void setVariables(List<APIVariable> variables) {
    this.variables = variables;
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
