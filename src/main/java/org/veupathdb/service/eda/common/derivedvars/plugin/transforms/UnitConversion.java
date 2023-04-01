package org.veupathdb.service.eda.common.derivedvars.plugin.transforms;

import org.gusdb.fgputil.validation.ValidationException;
import org.veupathdb.service.eda.common.derivedvars.plugin.Transform;
import org.veupathdb.service.eda.common.model.VariableDef;
import org.veupathdb.service.eda.generated.model.APIVariableDataShape;
import org.veupathdb.service.eda.generated.model.APIVariableType;
import org.veupathdb.service.eda.generated.model.UnitConversionConfig;
import org.veupathdb.service.eda.generated.model.VariableSpec;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class UnitConversion extends Transform<UnitConversionConfig> {

  private VariableSpec _inputVariable;
  private String _inputColumn;
  private Unit _inputUnit;
  private Unit _outputUnit;

  @Override
  protected Class<UnitConversionConfig> getConfigClass() {
    return UnitConversionConfig.class;
  }

  @Override
  protected void acceptConfig(UnitConversionConfig config) throws ValidationException {
    _inputVariable = config.getInputVariable();
    _inputColumn = VariableDef.toDotNotation(_inputVariable);
    _outputUnit = Unit.findUnit(config.getOutputUnits()).orElseThrow(() ->
        new ValidationException("Output unit '" + config.getOutputUnits() + "' is not a valid unit"));
  }

  @Override
  protected void performSupplementalDependedVariableValidation() throws ValidationException {
    String varUnit = _metadata.getVariable(_inputVariable).orElseThrow().getUnits().orElseThrow(() ->
        new ValidationException("Input variable must have convertible units to convert to a different units."));
    _inputUnit = Unit.findUnit(varUnit).orElseThrow(() ->
        new ValidationException("Variable '" + _inputColumn + "' has a unit '" + varUnit + "' that is not convertible to other units."));
    if (!_inputUnit.isCompatibleWith(_outputUnit))
      throw new ValidationException("Output unit " + _outputUnit + " is not compatible with input variable's unit " + _inputUnit);
  }

  @Override
  public String getFunctionName() {
    return "unitConversion";
  }

  @Override
  public List<VariableSpec> getRequiredInputVars() {
    return List.of(_inputVariable);
  }

  @Override
  public APIVariableType getVariableType() {
    return _metadata.getVariable(_inputVariable).orElseThrow().getType();
  }

  @Override
  public APIVariableDataShape getVariableDataShape() {
    return _metadata.getVariable(_inputVariable).orElseThrow().getDataShape();
  }

  @Override
  public String getValue(Map<String, String> row) {
    return String.valueOf(_inputUnit.convertTo(_outputUnit, Double.parseDouble(row.get(_inputColumn))));
  }

  private enum UnitType {
    LENGTH,
    MASS,
    VOLUME,
    TEMPERATURE,
    TIME_LARGE,
    TIME_SMALL,
    MASS_PROPORTION,
    MASS_BY_VOLUME,
    BIOLOGICAL_EFFECT_BY_VOLUME
  }

  private enum Unit {

    // length units
    MILLIMETER (List.of("mm"),   UnitType.LENGTH, n -> n * 0.001, n -> n * 1000),
    CENTIMETER (List.of("cm"),   UnitType.LENGTH, n -> n * 0.01, n -> n * 100),
    FEET       (List.of("feet"), UnitType.LENGTH, n -> n * 0.3048, n -> n * 3.280839895),
    METER      (List.of("m"),    UnitType.LENGTH, Function.identity(), Function.identity()),
    KILOMETER  (List.of("km"),   UnitType.LENGTH, n -> n * 1000, n -> n * 0.001),

    // mass units
    MICROGRAM (List.of("ug"), UnitType.MASS, n -> n * 0.000001, n -> n * 1000000),
    MILLIGRAM (List.of("mg"), UnitType.MASS, n -> n * 0.001, n -> n * 1000),
    GRAM      (List.of("g"),  UnitType.MASS, Function.identity(), Function.identity()),
    KILOGRAM  (List.of("kg"), UnitType.MASS, n -> n * 1000, n -> n * 0.001),

    // volume units
    MILLILITER (List.of("mL","ml"), UnitType.VOLUME, n -> n * 0.001, n -> n * 1000),
    LITER      (List.of("L"),       UnitType.VOLUME, Function.identity(), Function.identity()),

    // temperature units
    DEG_CELSIUS    (List.of("C"), UnitType.TEMPERATURE, Function.identity(), Function.identity()),
    DEG_FAHRENHEIT (List.of("F"), UnitType.TEMPERATURE, n -> (n - 32) * 5 / 9, n -> (n * 9 / 5) + 32),

    // large time units
    MONTH (List.of("months"),         UnitType.TIME_LARGE, n -> n / 12, n -> n * 12),
    YEAR  (List.of("years", "Years"), UnitType.TIME_LARGE, Function.identity(), Function.identity()),

    // small time units
    MILLISECOND (List.of("ms"),            UnitType.TIME_SMALL, n -> n / 60000, n -> n * 60000),
    SECOND      (List.of("sec"),           UnitType.TIME_SMALL, n -> n / 60, n -> n * 60),
    MINUTE      (List.of("min","minutes"), UnitType.TIME_SMALL, Function.identity(), Function.identity()),
    HOUR        (List.of("hours"),         UnitType.TIME_SMALL, n -> n * 60, n -> n / 60),
    DAY         (List.of("days"),          UnitType.TIME_SMALL, n -> n * 60 * 24, n -> n / 60 / 24),
    WEEK        (List.of("weeks"),         UnitType.TIME_SMALL, n -> n * 60 * 24 * 7, n -> n / 60 / 24 / 7),

    // mass proportion units
    MICROGRAM_PER_GRAM (List.of("ug/g"), UnitType.MASS_PROPORTION, n -> n * 0.001, n -> n * 1000),
    MILLIGRAM_PER_GRAM (List.of("mg/g"), UnitType.MASS_PROPORTION, Function.identity(), Function.identity());
/*
    TO BE CALCULATED: holding off until this plugin is approved

    // mass by volume units
    MICROGRAM_PER_LITER      (List.of("ug/L"),  UnitType.MASS_BY_VOLUME, , ),
    MICROGRAM_PER_DECILITER  (List.of("ug/dL"), UnitType.MASS_BY_VOLUME, , ),
    MICROGRAM_PER_MILLILITER (List.of("ug/mL"), UnitType.MASS_BY_VOLUME, , ),
    MILLIGRAM_PER_LITER      (List.of("mg/L"),  UnitType.MASS_BY_VOLUME, Function.identity(), Function.identity()),
    MILLIGRAM_PER_DECILITER  (List.of("mg/dL"), UnitType.MASS_BY_VOLUME, , ),
    GRAM_PER_DECILITER       (List.of("g/dL"),  UnitType.MASS_BY_VOLUME, , ),

    // effect by volume units
    IU_PER_LITER      (List.of("IU/L","U/L"),   UnitType.BIOLOGICAL_EFFECT_BY_VOLUME, , ),
    IU_PER_MILLILITER (List.of("IU/mL","U/mL"), UnitType.BIOLOGICAL_EFFECT_BY_VOLUME, Function.identity(), Function.identity()),
    IU_PER_MICROLITER (List.of("IU/uL"),        UnitType.BIOLOGICAL_EFFECT_BY_VOLUME, , ),
*/

    private final List<String> _values;
    private final UnitType _type;
    private final Function<Double, Double> _toBaseline;
    private final Function<Double, Double> _fromBaseline;

    Unit(List<String> values, UnitType type, Function<Double, Double> toBaseline, Function<Double, Double> fromBaseline) {
      _values = values;
      _type = type;
      _fromBaseline = fromBaseline;
      _toBaseline = toBaseline;
    }

    public static Optional<Unit> findUnit(String unitValue) {
      for (Unit unit : values()) {
        for (String value : unit._values) {
          if (value.equals(unitValue)) return Optional.of(unit);
        }
      }
      return Optional.empty();
    }

    public boolean isCompatibleWith(Unit unit) {
      return _type == unit._type;
    }

    public double convertTo(Unit outputUnit, double value) {
      // convert to baseline, then from baseline to output unit
      return outputUnit._fromBaseline.apply(_toBaseline.apply(value));
    }
  }
}
