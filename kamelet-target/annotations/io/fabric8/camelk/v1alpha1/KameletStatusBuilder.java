package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class KameletStatusBuilder extends io.fabric8.camelk.v1alpha1.KameletStatusFluentImpl<io.fabric8.camelk.v1alpha1.KameletStatusBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.KameletStatus,io.fabric8.camelk.v1alpha1.KameletStatusBuilder>{
  public KameletStatusBuilder() {
    this(false);
  }
  public KameletStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new KameletStatus(), validationEnabled);
  }
  public KameletStatusBuilder(io.fabric8.camelk.v1alpha1.KameletStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public KameletStatusBuilder(io.fabric8.camelk.v1alpha1.KameletStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new KameletStatus(), validationEnabled);
  }
  public KameletStatusBuilder(io.fabric8.camelk.v1alpha1.KameletStatusFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletStatus instance) {
    this(fluent, instance, false);
  }
  public KameletStatusBuilder(io.fabric8.camelk.v1alpha1.KameletStatusFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions()); 
    fluent.withPhase(instance.getPhase()); 
    fluent.withProperties(instance.getProperties()); 
    this.validationEnabled = validationEnabled; 
  }
  public KameletStatusBuilder(io.fabric8.camelk.v1alpha1.KameletStatus instance) {
    this(instance,false);
  }
  public KameletStatusBuilder(io.fabric8.camelk.v1alpha1.KameletStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions()); 
    this.withPhase(instance.getPhase()); 
    this.withProperties(instance.getProperties()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.KameletStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.KameletStatus build() {
    KameletStatus buildable = new KameletStatus(fluent.getConditions(),fluent.getPhase(),fluent.getProperties());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletStatusBuilder that = (KameletStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}