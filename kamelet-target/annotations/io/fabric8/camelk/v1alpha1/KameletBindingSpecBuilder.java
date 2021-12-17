package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class KameletBindingSpecBuilder extends io.fabric8.camelk.v1alpha1.KameletBindingSpecFluentImpl<io.fabric8.camelk.v1alpha1.KameletBindingSpecBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.KameletBindingSpec,io.fabric8.camelk.v1alpha1.KameletBindingSpecBuilder>{
  public KameletBindingSpecBuilder() {
    this(false);
  }
  public KameletBindingSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new KameletBindingSpec(), validationEnabled);
  }
  public KameletBindingSpecBuilder(io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public KameletBindingSpecBuilder(io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new KameletBindingSpec(), validationEnabled);
  }
  public KameletBindingSpecBuilder(io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletBindingSpec instance) {
    this(fluent, instance, false);
  }
  public KameletBindingSpecBuilder(io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletBindingSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withIntegration(instance.getIntegration()); 
    fluent.withSink(instance.getSink()); 
    fluent.withSource(instance.getSource()); 
    this.validationEnabled = validationEnabled; 
  }
  public KameletBindingSpecBuilder(io.fabric8.camelk.v1alpha1.KameletBindingSpec instance) {
    this(instance,false);
  }
  public KameletBindingSpecBuilder(io.fabric8.camelk.v1alpha1.KameletBindingSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withIntegration(instance.getIntegration()); 
    this.withSink(instance.getSink()); 
    this.withSource(instance.getSource()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.KameletBindingSpec build() {
    KameletBindingSpec buildable = new KameletBindingSpec(fluent.getIntegration(),fluent.getSink(),fluent.getSource());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletBindingSpecBuilder that = (KameletBindingSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}