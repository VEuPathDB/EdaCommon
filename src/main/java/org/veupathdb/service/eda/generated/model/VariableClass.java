package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum VariableClass {
  @JsonProperty("native")
  NATIVE("native"),

  @JsonProperty("derived")
  DERIVED("derived"),

  @JsonProperty("computed")
  COMPUTED("computed");

  private String name;

  VariableClass(String name) {
    this.name = name;
  }
  public String getValue(){ return name; } 
}
