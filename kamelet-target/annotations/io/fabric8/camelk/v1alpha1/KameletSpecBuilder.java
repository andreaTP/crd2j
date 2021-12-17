package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class KameletSpecBuilder extends io.fabric8.camelk.v1alpha1.KameletSpecFluentImpl<io.fabric8.camelk.v1alpha1.KameletSpecBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.KameletSpec,io.fabric8.camelk.v1alpha1.KameletSpecBuilder>{
  public KameletSpecBuilder() {
    this(false);
  }
  public KameletSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new KameletSpec(), validationEnabled);
  }
  public KameletSpecBuilder(io.fabric8.camelk.v1alpha1.KameletSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public KameletSpecBuilder(io.fabric8.camelk.v1alpha1.KameletSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new KameletSpec(), validationEnabled);
  }
  public KameletSpecBuilder(io.fabric8.camelk.v1alpha1.KameletSpecFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletSpec instance) {
    this(fluent, instance, false);
  }
  public KameletSpecBuilder(io.fabric8.camelk.v1alpha1.KameletSpecFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAuthorization(instance.getAuthorization()); 
    fluent.withDefinition(instance.getDefinition()); 
    fluent.withDependencies(instance.getDependencies()); 
    fluent.withFlow(instance.getFlow()); 
    fluent.withSources(instance.getSources()); 
    fluent.withTypes(instance.getTypes()); 
    this.validationEnabled = validationEnabled; 
  }
  public KameletSpecBuilder(io.fabric8.camelk.v1alpha1.KameletSpec instance) {
    this(instance,false);
  }
  public KameletSpecBuilder(io.fabric8.camelk.v1alpha1.KameletSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withAuthorization(instance.getAuthorization()); 
    this.withDefinition(instance.getDefinition()); 
    this.withDependencies(instance.getDependencies()); 
    this.withFlow(instance.getFlow()); 
    this.withSources(instance.getSources()); 
    this.withTypes(instance.getTypes()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.KameletSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.KameletSpec build() {
    KameletSpec buildable = new KameletSpec(fluent.getAuthorization(),fluent.getDefinition(),fluent.getDependencies(),fluent.getFlow(),fluent.getSources(),fluent.getTypes());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletSpecBuilder that = (KameletSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}