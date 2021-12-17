package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class KameletConditionBuilder extends io.fabric8.camelk.v1alpha1.KameletConditionFluentImpl<io.fabric8.camelk.v1alpha1.KameletConditionBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.KameletCondition,io.fabric8.camelk.v1alpha1.KameletConditionBuilder>{
  public KameletConditionBuilder() {
    this(false);
  }
  public KameletConditionBuilder(java.lang.Boolean validationEnabled) {
    this(new KameletCondition(), validationEnabled);
  }
  public KameletConditionBuilder(io.fabric8.camelk.v1alpha1.KameletConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public KameletConditionBuilder(io.fabric8.camelk.v1alpha1.KameletConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new KameletCondition(), validationEnabled);
  }
  public KameletConditionBuilder(io.fabric8.camelk.v1alpha1.KameletConditionFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletCondition instance) {
    this(fluent, instance, false);
  }
  public KameletConditionBuilder(io.fabric8.camelk.v1alpha1.KameletConditionFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
    fluent.withLastUpdateTime(instance.getLastUpdateTime()); 
    fluent.withMessage(instance.getMessage()); 
    fluent.withReason(instance.getReason()); 
    fluent.withStatus(instance.getStatus()); 
    fluent.withType(instance.getType()); 
    this.validationEnabled = validationEnabled; 
  }
  public KameletConditionBuilder(io.fabric8.camelk.v1alpha1.KameletCondition instance) {
    this(instance,false);
  }
  public KameletConditionBuilder(io.fabric8.camelk.v1alpha1.KameletCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime()); 
    this.withLastUpdateTime(instance.getLastUpdateTime()); 
    this.withMessage(instance.getMessage()); 
    this.withReason(instance.getReason()); 
    this.withStatus(instance.getStatus()); 
    this.withType(instance.getType()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.KameletConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.KameletCondition build() {
    KameletCondition buildable = new KameletCondition(fluent.getLastTransitionTime(),fluent.getLastUpdateTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletConditionBuilder that = (KameletConditionBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}