package org.veupathdb.service.eda.common.model;

public enum VariableSource {
  ID,
  NATIVE,
  INHERITED,
  DERIVED_BY_REDUCTION,
  DERIVED_BY_TRANSFORM;

  public boolean isNativeOrId() {
    return equals(ID) || equals(NATIVE);
  }
  public boolean isResident() {
    return !equals(INHERITED);
  }
  public boolean isDerived() {
    return equals(DERIVED_BY_REDUCTION) || equals(DERIVED_BY_TRANSFORM);
  }
  public boolean isInherited() {
    return equals(INHERITED);
  }
}
