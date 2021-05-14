package org.veupathdb.service.eda.common.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.json.JSONObject;
import org.veupathdb.service.eda.common.model.InternalVariableDefs.InternalVariableDef;
import org.veupathdb.service.eda.common.model.InternalVariableDefs.NonNumericInternalVariableDef;
import org.veupathdb.service.eda.generated.model.APIVariableDataShape;
import org.veupathdb.service.eda.generated.model.APIVariableType;
import org.veupathdb.service.eda.generated.model.VariableSpec;

public class EntityDef {

  private final String _id;
  private final String _displayName;
  private final InternalVariableDef _idColumnDef;
  private final List<InternalVariableDef> _variables;

  public EntityDef(String id, String displayName, String idColumnName) {
    _id = id;
    _displayName = displayName;
    _idColumnDef = new NonNumericInternalVariableDef(_id, idColumnName, APIVariableType.STRING,
        APIVariableDataShape.CONTINUOUS ,VariableSource.ID);
    _variables = new ArrayList<>();
    _variables.add(_idColumnDef);
  }

  public String getId() {
    return _id;
  }

  public VariableDef getIdColumnDef() {
    return _idColumnDef.toVariableDef(null, null);
  }

  public void addVariable(InternalVariableDef var) {
    _variables.add(var);
  }

  public Optional<VariableDef> getVariable(VariableSpec var) {
    return stream()
      .filter(v -> VariableDef.hasSameEntityAndVarId(v, var))
      .findFirst()
      .map(v -> v.to)
      .map()
  }

  @Override
  public String toString() {
    return new JSONObject()
      .put("id", _id)
      .put("displayName", _displayName)
      .put("idColumnName", _idColumnDef.getVariableId())
      .put("variables", stream()
        .map(var -> VariableDef.toDotNotation(var) + ":" + var.getType().toString().toLowerCase())
        .collect(Collectors.toList()))
      .toString(2);
  }

}
