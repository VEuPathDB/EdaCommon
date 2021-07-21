package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ValueSpec {
  @JsonProperty("count")
  COUNT("count"),

  @JsonProperty("proportion")
  PROPORTION("proportion");

  private String name;

  ValueSpec(String name) {
    this.name = name;
  }
  public String getValue(){ return name; } 
}

