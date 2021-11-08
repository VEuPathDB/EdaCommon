package org.veupathdb.service.eda.common.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.gusdb.fgputil.functional.TreeNode;
import org.json.JSONObject;
import org.veupathdb.service.eda.generated.model.APIVariableDataShape;
import org.veupathdb.service.eda.generated.model.APIVariableType;
import org.veupathdb.service.eda.generated.model.VariableSpec;

public class EntityDef extends ArrayList<VariableDef> {

  private static final Logger LOG = LogManager.getLogger(EntityDef.class);

  private final String _id;
  private final String _displayName;
  private final VariableDef _idColumnDef;
  private final List<VariableDef> _categories;

  public EntityDef(String id, String displayName, String idColumnName) {
    _id = id;
    _displayName = displayName;
    _idColumnDef = new VariableDef(_id, idColumnName, APIVariableType.STRING,
        APIVariableDataShape.CONTINUOUS, false, Optional.empty(), null, VariableSource.ID);
    add(_idColumnDef);
    _categories = new ArrayList<>();
  }

  public String getId() {
    return _id;
  }

  public VariableDef getIdColumnDef() {
    return _idColumnDef;
  }

  public Optional<VariableDef> getVariable(VariableSpec var) {
    return stream()
      .filter(v -> VariableDef.isSameVariable(v, var))
      .findFirst();
  }

  public TreeNode<VariableDef> getNativeVariableTreeNode(VariableDef varSpec) {
    return Optional.ofNullable(
      getNativeVariableTree().findFirst(var -> VariableDef.isSameVariable(var, varSpec))
    ).orElseThrow(() ->
      new IllegalArgumentException("Variable tree requested on wrong entity or for non-native var.")
    );
  }

  public TreeNode<VariableDef> getNativeVariableTree() {

    // add only native vars (not IDs or inherited or derived vars)
    Map<String, TreeNode<VariableDef>> allVarNodes = stream()
        .filter(var -> var.getSource() == VariableSource.NATIVE)
        .collect(Collectors.toMap(
            var -> var.getVariableId(),
            var -> new TreeNode<>(var)
        ));

    // add categories for proper tree structure
    _categories.stream().forEach(cat -> allVarNodes.put(cat.getVariableId(), new TreeNode<>(cat)));

    List<TreeNode<VariableDef>> parentlessNodes = new ArrayList<>();
    for (TreeNode<VariableDef> varNode : allVarNodes.values()) {
      VariableDef var = varNode.getContents();
      String parentId = var.getParentId();
      if (parentId == null) {
        parentlessNodes.add(varNode);
      }
      else {
        TreeNode<VariableDef> parentNode = allVarNodes.get(parentId);
        if (parentNode == null) {
          // This can happen legally if parentId = this entity's ID OR if repeated measure is false,
          //   it can even be the ID of this entity's parent entity (!!).  For our purposes, any
          //   non-variable ID is not useful; treat as if parent is null and warn for debug purposes.
          LOG.warn("Variable " + var + " contains parentId '" +
              parentId + "' that does not map to a variable in this entity's tree." );
          parentlessNodes.add(varNode);
        }
        else {
          parentNode.addChildNode(varNode);
        }
      }
    }
    switch(parentlessNodes.size()) {
      case 0: throw new RuntimeException("Found no native vars in entity " +
          getId() + " with no parentId specified (illegal variable tree)");
      case 1: return parentlessNodes.get(0);
      default:
        // create a dummy root containing all (>1) parentless nodes
        TreeNode<VariableDef> dummyRoot = new TreeNode<>(new VariableDef(
          "dummyRoot", "dummyRoot", APIVariableType.STRING, APIVariableDataShape.CATEGORICAL,
          false, Optional.empty(), null, VariableSource.NATIVE
        ));
        dummyRoot.addAllChildNodes(parentlessNodes);
        return dummyRoot;
    }
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

  public void addCategory(VariableDef cat) {
    _categories.add(cat);
  }
}
