package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataElement",
    "class",
    "variableSpec",
    "dataType",
    "dataShape",
    "displayName",
    "displayRangeMin",
    "displayRangeMax",
    "vocabulary",
    "members"
})
public class VariableMetadataImpl implements VariableMetadata {
  @JsonProperty("dataElement")
  private String dataElement;

  @JsonProperty("class")
  private VariableClass classVariable;

  @JsonProperty("variableSpec")
  private VariableSpec variableSpec;

  @JsonProperty("dataType")
  private APIVariableType dataType;

  @JsonProperty("dataShape")
  private APIVariableDataShape dataShape;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("displayRangeMin")
  private Object displayRangeMin;

  @JsonProperty("displayRangeMax")
  private Object displayRangeMax;

  @JsonProperty("vocabulary")
  private List<String> vocabulary;

  @JsonProperty("members")
  private List<VariableSpec> members;

  @JsonProperty("dataElement")
  public String getDataElement() {
    return this.dataElement;
  }

  @JsonProperty("dataElement")
  public void setDataElement(String dataElement) {
    this.dataElement = dataElement;
  }

  @JsonProperty("class")
  public VariableClass getClazz() {
    return this.classVariable;
  }

  @JsonProperty("class")
  public void setClazz(VariableClass classVariable) {
    this.classVariable = classVariable;
  }

  @JsonProperty("variableSpec")
  public VariableSpec getVariableSpec() {
    return this.variableSpec;
  }

  @JsonProperty("variableSpec")
  public void setVariableSpec(VariableSpec variableSpec) {
    this.variableSpec = variableSpec;
  }

  @JsonProperty("dataType")
  public APIVariableType getDataType() {
    return this.dataType;
  }

  @JsonProperty("dataType")
  public void setDataType(APIVariableType dataType) {
    this.dataType = dataType;
  }

  @JsonProperty("dataShape")
  public APIVariableDataShape getDataShape() {
    return this.dataShape;
  }

  @JsonProperty("dataShape")
  public void setDataShape(APIVariableDataShape dataShape) {
    this.dataShape = dataShape;
  }

  @JsonProperty("displayName")
  public String getDisplayName() {
    return this.displayName;
  }

  @JsonProperty("displayName")
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @JsonProperty("displayRangeMin")
  public Object getDisplayRangeMin() {
    return this.displayRangeMin;
  }

  @JsonProperty("displayRangeMin")
  public void setDisplayRangeMin(Object displayRangeMin) {
    this.displayRangeMin = displayRangeMin;
  }

  @JsonProperty("displayRangeMax")
  public Object getDisplayRangeMax() {
    return this.displayRangeMax;
  }

  @JsonProperty("displayRangeMax")
  public void setDisplayRangeMax(Object displayRangeMax) {
    this.displayRangeMax = displayRangeMax;
  }

  @JsonProperty("vocabulary")
  public List<String> getVocabulary() {
    return this.vocabulary;
  }

  @JsonProperty("vocabulary")
  public void setVocabulary(List<String> vocabulary) {
    this.vocabulary = vocabulary;
  }

  @JsonProperty("members")
  public List<VariableSpec> getMembers() {
    return this.members;
  }

  @JsonProperty("members")
  public void setMembers(List<VariableSpec> members) {
    this.members = members;
  }
}
