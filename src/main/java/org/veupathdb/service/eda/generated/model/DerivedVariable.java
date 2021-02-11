package org.veupathdb.service.eda.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

@JsonDeserialize(
    as = DerivedVariableImpl.class
)
public interface DerivedVariable extends VariableSpec {
  @JsonProperty("entityId")
  String getEntityId();

  @JsonProperty("entityId")
  void setEntityId(String entityId);

  @JsonProperty("variableId")
  String getVariableId();

  @JsonProperty("variableId")
  void setVariableId(String variableId);

  @JsonProperty("variableType")
  APIVariableType getVariableType();

  @JsonProperty("variableType")
  void setVariableType(APIVariableType variableType);

  @JsonProperty("derivationType")
  DerivationType getDerivationType();

  @JsonProperty("derivationType")
  void setDerivationType(DerivationType derivationType);

  @JsonProperty("dependentVariables")
  List<VariableSpec> getDependentVariables();

  @JsonProperty("dependentVariables")
  void setDependentVariables(List<VariableSpec> dependentVariables);

  @JsonProperty("construction")
  Object getConstruction();

  @JsonProperty("construction")
  void setConstruction(Object construction);
}
