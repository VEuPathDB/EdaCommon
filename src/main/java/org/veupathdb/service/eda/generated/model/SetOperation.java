package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;

@JsonDeserialize(
    as = SetOperationImpl.class
)
public interface SetOperation {
  @JsonProperty("operation")
  OperationType getOperation();

  @JsonProperty("operation")
  void setOperation(OperationType operation);

  @JsonProperty("leftOperation")
  SetOperation getLeftOperation();

  @JsonProperty("leftOperation")
  void setLeftOperation(SetOperation leftOperation);

  @JsonProperty("leftVariable")
  String getLeftVariable();

  @JsonProperty("leftVariable")
  void setLeftVariable(String leftVariable);

  @JsonProperty("rightOperation")
  SetOperation getRightOperation();

  @JsonProperty("rightOperation")
  void setRightOperation(SetOperation rightOperation);

  @JsonProperty("rightVariable")
  String getRightVariable();

  @JsonProperty("rightVariable")
  void setRightVariable(String rightVariable);

  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);

  enum OperationType {
    @JsonProperty("intersect")
    INTERSECT("intersect"),

    @JsonProperty("union")
    UNION("union"),

    @JsonProperty("minus")
    MINUS("minus");

    private final String value;

    public String getValue() {
      return this.value;
    }

    OperationType(String name) {
      this.value = name;
    }
  }
}
