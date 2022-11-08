package org.veupathdb.service.eda.common.plugin.constraint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.veupathdb.service.eda.generated.model.VisualizationDataElementConstraintPattern;

/**
 * interface PatternSet {
 *   [AxisName: string]: {
 *     required?: boolean;
 *     entitySameAsOrDescendedFromEntityOf?: string; //
 *     patterns: [{
 *       type?: TypeEnum[];
 *       shape?: ShapeEnum[];
 *     }];
 *   }
 * }
 * if var1 is at index x and var2 is at index x+1, then var2 must be a member of the same entity as var1, or a descendent
 */
public class ConstraintSpec extends ArrayList<VisualizationDataElementConstraintPattern> {

  private List<List<String>> _dependencyOrder;

  public ConstraintSpec dependencyOrder(List<String>... orderedElementNames) {
    _dependencyOrder = Arrays.asList(orderedElementNames);
    return this;
  }

  public List<List<String>> getDependencyOrder() {
    return _dependencyOrder;
  }

  public ConstraintPattern pattern() {
    ConstraintPattern pattern = new ConstraintPattern(this);
    add(pattern);
    return pattern;
  }
}
