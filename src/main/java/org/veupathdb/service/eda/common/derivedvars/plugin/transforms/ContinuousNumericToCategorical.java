package org.veupathdb.service.eda.common.derivedvars.plugin.transforms;

import jakarta.ws.rs.BadRequestException;
import org.gusdb.fgputil.validation.ValidationException;
import org.veupathdb.service.eda.common.derivedvars.plugin.Transform;
import org.veupathdb.service.eda.common.model.VariableDef;
import org.veupathdb.service.eda.generated.model.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ContinuousNumericToCategorical extends Transform<ContinuousNumericRecodingConfig> {

  private static class RuleApplier {

    private final double _minInclusive;
    private final double _maxExclusive;
    private final String _outputValue;

    public RuleApplier(ContinuousNumericRule rule) {
      _minInclusive = rule.getMinInclusive() == null ? Double.MIN_VALUE : Double.parseDouble(rule.getMinInclusive().toString());
      _maxExclusive= rule.getMaxExclusive() == null ? Double.MAX_VALUE : Double.parseDouble(rule.getMaxExclusive().toString());
      _outputValue = rule.getOutputValue();
    }

    public boolean matches(double d) {
      return d >= _minInclusive && d < _maxExclusive;
    }

    public String getOutputValue() {
      return _outputValue;
    }
  }

  private VariableSpec _inputVar;
  private String _inputColumn;
  private boolean _imputeZero;
  private List<RuleApplier> _codingRules;
  private String _unmappedValue;

  @Override
  protected Class<ContinuousNumericRecodingConfig> getConfigClass() {
    return ContinuousNumericRecodingConfig.class;
  }

  @Override
  protected void acceptConfig(ContinuousNumericRecodingConfig config) throws ValidationException {
    _inputVar = config.getInputVariable();
    _inputColumn = VariableDef.toDotNotation(_inputVar);
    _imputeZero = Optional.ofNullable(config.getImputeZero()).orElse(false);
    _codingRules = config.getRules().stream().map(RuleApplier::new).toList();
    _unmappedValue = Optional.ofNullable(config.getUnmappedValue()).orElse("");
  }

  @Override
  protected void performSupplementalDependedVariableValidation() throws ValidationException {
    checkVariable("Input", _inputVar, List.of(APIVariableType.INTEGER, APIVariableType.NUMBER), List.of(APIVariableDataShape.CONTINUOUS));
  }

  @Override
  public String getFunctionName() {
    return "continuousToCategorical";
  }

  @Override
  public List<VariableSpec> getRequiredInputVars() {
    return List.of(_inputVar);
  }

  @Override
  public APIVariableType getVariableType() {
    return APIVariableType.STRING;
  }

  @Override
  public APIVariableDataShape getVariableDataShape() {
    return APIVariableDataShape.CATEGORICAL;
  }

  @Override
  public Optional<List<String>> getVocabulary() {
    return Optional.of(_codingRules.stream().map(RuleApplier::getOutputValue).toList());
  }

  @Override
  public String getValue(Map<String, String> row) {
    // decide if value should be mapped or converted to zero
    String value = row.get(_inputColumn);
    double d = 0;
    if (value.isEmpty()) {
      if (!_imputeZero) return "";
    }
    else {
      d = Double.parseDouble(value);
    }

    // apply mapping rules
    for (RuleApplier rule : _codingRules) {
      if (rule.matches(d))
        // return output value for the first match
        return rule.getOutputValue();
    }
    return _unmappedValue;
  }
}
