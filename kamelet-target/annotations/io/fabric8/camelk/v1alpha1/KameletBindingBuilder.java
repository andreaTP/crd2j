package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class KameletBindingBuilder extends io.fabric8.camelk.v1alpha1.KameletBindingFluentImpl<io.fabric8.camelk.v1alpha1.KameletBindingBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.KameletBinding,io.fabric8.camelk.v1alpha1.KameletBindingBuilder>{
  public KameletBindingBuilder() {
    this(false);
  }
  public KameletBindingBuilder(java.lang.Boolean validationEnabled) {
    this(new KameletBinding(), validationEnabled);
  }
  public KameletBindingBuilder(io.fabric8.camelk.v1alpha1.KameletBindingFluent<?> fluent) {
    this(fluent, false);
  }
  public KameletBindingBuilder(io.fabric8.camelk.v1alpha1.KameletBindingFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new KameletBinding(), validationEnabled);
  }
  public KameletBindingBuilder(io.fabric8.camelk.v1alpha1.KameletBindingFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletBinding instance) {
    this(fluent, instance, false);
  }
  public KameletBindingBuilder(io.fabric8.camelk.v1alpha1.KameletBindingFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletBinding instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion()); 
    fluent.withKind(instance.getKind()); 
    fluent.withMetadata(instance.getMetadata()); 
    fluent.withSpec(instance.getSpec()); 
    fluent.withStatus(instance.getStatus()); 
    this.validationEnabled = validationEnabled; 
  }
  public KameletBindingBuilder(io.fabric8.camelk.v1alpha1.KameletBinding instance) {
    this(instance,false);
  }
  public KameletBindingBuilder(io.fabric8.camelk.v1alpha1.KameletBinding instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion()); 
    this.withKind(instance.getKind()); 
    this.withMetadata(instance.getMetadata()); 
    this.withSpec(instance.getSpec()); 
    this.withStatus(instance.getStatus()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.KameletBindingFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.KameletBinding build() {
    KameletBinding buildable = new KameletBinding(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletBindingBuilder that = (KameletBindingBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}