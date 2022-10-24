package org.veupathdb.service.eda.common.plugin.constraint;

import java.util.Arrays;

import org.veupathdb.service.eda.generated.model.APIVariableDataShape;
import org.veupathdb.service.eda.generated.model.APIVariableType;
import org.veupathdb.service.eda.generated.model.VisualizationDataElementConstraintImpl;

public class VisualizationDataElement extends VisualizationDataElementConstraintImpl {

  private final ConstraintPattern _parent;

  public VisualizationDataElement(ConstraintPattern parent) {
    _parent = parent;
    // set defaults
    setIsRequired(true);
    setIsTemporal(null);
    setAllowedTypes(null);
    setAllowedShapes(null);
    setMinNumVars(1);
    setMaxNumVars(1);
    setMaxNumValues(null);
    setDescription(null);
  }

  public VisualizationDataElement required(boolean isRequired) {
    setIsRequired(isRequired);
    return this;
  }

  public VisualizationDataElement temporal(boolean isTemporal) {
    setIsTemporal(isTemporal);
    return this;
  }

  public VisualizationDataElement types(APIVariableType... allowedTypes) {
    setAllowedTypes(Arrays.asList(allowedTypes));
    return this;
  }

  public VisualizationDataElement shapes(APIVariableDataShape... allowedShapes) {
    setAllowedShapes(Arrays.asList(allowedShapes));
    return this;
  }

  public VisualizationDataElement minVars(int minNumVars) {
    setMinNumVars(minNumVars);
    return this;
  }

  public VisualizationDataElement maxVars(int maxNumVars) {
    setMaxNumVars(maxNumVars);
    return this;
  }
  
  public VisualizationDataElement maxValues(int maxNumValues) {
    setMaxNumValues(maxNumValues);
    return this;
  }

  public VisualizationDataElement description(String description) {
    setDescription(description);
    return this;
  }

  public VisualizationDataElement element(String name) {
    return _parent.element(name);
  }

  public ConstraintPattern pattern() {
    return _parent.pattern();
  }

  public ConstraintSpec done() {
    return _parent.done();
  }
}