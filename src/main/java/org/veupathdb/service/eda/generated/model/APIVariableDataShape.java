package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum APIVariableDataShape {
  @JsonProperty("continuous")
  CONTINUOUS("continuous"),

  @JsonProperty("categorical")
  CATEGORICAL("categorical"),

  @JsonProperty("ordinal")
  ORDINAL("ordinal"),

  @JsonProperty("binary")
  BINARY("binary");

  private String name;

  APIVariableDataShape(String name) {
    this.name = name;
  }
  public String getValue(){ return name; } 
}
