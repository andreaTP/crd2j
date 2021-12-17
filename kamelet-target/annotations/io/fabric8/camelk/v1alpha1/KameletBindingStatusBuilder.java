package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class KameletBindingStatusBuilder extends io.fabric8.camelk.v1alpha1.KameletBindingStatusFluentImpl<io.fabric8.camelk.v1alpha1.KameletBindingStatusBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.KameletBindingStatus,io.fabric8.camelk.v1alpha1.KameletBindingStatusBuilder>{
  public KameletBindingStatusBuilder() {
    this(false);
  }
  public KameletBindingStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new KameletBindingStatus(), validationEnabled);
  }
  public KameletBindingStatusBuilder(io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public KameletBindingStatusBuilder(io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new KameletBindingStatus(), validationEnabled);
  }
  public KameletBindingStatusBuilder(io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletBindingStatus instance) {
    this(fluent, instance, false);
  }
  public KameletBindingStatusBuilder(io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletBindingStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions()); 
    fluent.withPhase(instance.getPhase()); 
    this.validationEnabled = validationEnabled; 
  }
  public KameletBindingStatusBuilder(io.fabric8.camelk.v1alpha1.KameletBindingStatus instance) {
    this(instance,false);
  }
  public KameletBindingStatusBuilder(io.fabric8.camelk.v1alpha1.KameletBindingStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions()); 
    this.withPhase(instance.getPhase()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.KameletBindingStatus build() {
    KameletBindingStatus buildable = new KameletBindingStatus(fluent.getConditions(),fluent.getPhase());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletBindingStatusBuilder that = (KameletBindingStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}