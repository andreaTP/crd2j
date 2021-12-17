package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class KameletPropertyBuilder extends io.fabric8.camelk.v1alpha1.KameletPropertyFluentImpl<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.KameletProperty,io.fabric8.camelk.v1alpha1.KameletPropertyBuilder>{
  public KameletPropertyBuilder() {
    this(false);
  }
  public KameletPropertyBuilder(java.lang.Boolean validationEnabled) {
    this(new KameletProperty(), validationEnabled);
  }
  public KameletPropertyBuilder(io.fabric8.camelk.v1alpha1.KameletPropertyFluent<?> fluent) {
    this(fluent, false);
  }
  public KameletPropertyBuilder(io.fabric8.camelk.v1alpha1.KameletPropertyFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new KameletProperty(), validationEnabled);
  }
  public KameletPropertyBuilder(io.fabric8.camelk.v1alpha1.KameletPropertyFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletProperty instance) {
    this(fluent, instance, false);
  }
  public KameletPropertyBuilder(io.fabric8.camelk.v1alpha1.KameletPropertyFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletProperty instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDefault(instance.getDefault()); 
    fluent.withName(instance.getName()); 
    this.validationEnabled = validationEnabled; 
  }
  public KameletPropertyBuilder(io.fabric8.camelk.v1alpha1.KameletProperty instance) {
    this(instance,false);
  }
  public KameletPropertyBuilder(io.fabric8.camelk.v1alpha1.KameletProperty instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withDefault(instance.getDefault()); 
    this.withName(instance.getName()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.KameletPropertyFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.KameletProperty build() {
    KameletProperty buildable = new KameletProperty(fluent.getDefault(),fluent.getName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletPropertyBuilder that = (KameletPropertyBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}