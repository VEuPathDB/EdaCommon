package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum APICollectionType {
  @JsonProperty("number")
  NUMBER("number"),

  @JsonProperty("date")
  DATE("date"),

  @JsonProperty("integer")
  INTEGER("integer");

  private String name;

  APICollectionType(String name) {
    this.name = name;
  }
  public String getValue(){ return name; } 
}
