package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum APIVariableDisplayType {
  @JsonProperty("default")
  DEFAULT("default"),

  @JsonProperty("multifilter")
  MULTIFILTER("multifilter"),

  @JsonProperty("hidden")
  HIDDEN("hidden");

  private String name;

  APIVariableDisplayType(String name) {
    this.name = name;
  }
  public String getValue(){ return name; } 
}

