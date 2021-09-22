package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum APIBooleanOperationType {
  @JsonProperty("intersect")
  INTERSECT("intersect"),

  @JsonProperty("union")
  UNION("union");

  private String name;

  APIBooleanOperationType(String name) {
    this.name = name;
  }
  public String getValue(){ return name; } 
}
