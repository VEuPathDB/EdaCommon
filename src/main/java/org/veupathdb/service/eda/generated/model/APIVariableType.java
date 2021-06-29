package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum APIVariableType {
  @JsonProperty("category")
  CATEGORY("category"),

  @JsonProperty("string")
  STRING("string"),

  @JsonProperty("number")
  NUMBER("number"),

  @JsonProperty("date")
  DATE("date"),

  @JsonProperty("longitude")
  LONGITUDE("longitude");

  private String name;

  APIVariableType(String name) {
    this.name = name;
  }
  public String getValue(){ return name; } 
}

