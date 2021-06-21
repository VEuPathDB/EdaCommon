package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DerivationType {
  @JsonProperty("transform")
  TRANSFORM("transform"),

  @JsonProperty("reduction")
  REDUCTION("reduction");

  private String name;

  DerivationType(String name) {
    this.name = name;
  }
  public String getValue(){ return name; } 
}
