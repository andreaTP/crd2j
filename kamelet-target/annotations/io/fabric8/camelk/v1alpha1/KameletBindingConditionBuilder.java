package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class KameletBindingConditionBuilder extends io.fabric8.camelk.v1alpha1.KameletBindingConditionFluentImpl<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.KameletBindingCondition,io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder>{
  public KameletBindingConditionBuilder() {
    this(false);
  }
  public KameletBindingConditionBuilder(java.lang.Boolean validationEnabled) {
    this(new KameletBindingCondition(), validationEnabled);
  }
  public KameletBindingConditionBuilder(io.fabric8.camelk.v1alpha1.KameletBindingConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public KameletBindingConditionBuilder(io.fabric8.camelk.v1alpha1.KameletBindingConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new KameletBindingCondition(), validationEnabled);
  }
  public KameletBindingConditionBuilder(io.fabric8.camelk.v1alpha1.KameletBindingConditionFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletBindingCondition instance) {
    this(fluent, instance, false);
  }
  public KameletBindingConditionBuilder(io.fabric8.camelk.v1alpha1.KameletBindingConditionFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletBindingCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
    fluent.withLastUpdateTime(instance.getLastUpdateTime()); 
    fluent.withMessage(instance.getMessage()); 
    fluent.withReason(instance.getReason()); 
    fluent.withStatus(instance.getStatus()); 
    fluent.withType(instance.getType()); 
    this.validationEnabled = validationEnabled; 
  }
  public KameletBindingConditionBuilder(io.fabric8.camelk.v1alpha1.KameletBindingCondition instance) {
    this(instance,false);
  }
  public KameletBindingConditionBuilder(io.fabric8.camelk.v1alpha1.KameletBindingCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime()); 
    this.withLastUpdateTime(instance.getLastUpdateTime()); 
    this.withMessage(instance.getMessage()); 
    this.withReason(instance.getReason()); 
    this.withStatus(instance.getStatus()); 
    this.withType(instance.getType()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.KameletBindingConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.KameletBindingCondition build() {
    KameletBindingCondition buildable = new KameletBindingCondition(fluent.getLastTransitionTime(),fluent.getLastUpdateTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletBindingConditionBuilder that = (KameletBindingConditionBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}