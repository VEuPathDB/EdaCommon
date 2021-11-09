package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TabularHeaderFormat {
  @JsonProperty("standard")
  STANDARD("standard"),

  @JsonProperty("display")
  DISPLAY("display");

  private String name;

  TabularHeaderFormat(String name) {
    this.name = name;
  }
  public String getValue(){ return name; } 
}
