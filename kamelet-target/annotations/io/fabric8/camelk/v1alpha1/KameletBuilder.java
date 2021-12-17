package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class KameletBuilder extends io.fabric8.camelk.v1alpha1.KameletFluentImpl<io.fabric8.camelk.v1alpha1.KameletBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.Kamelet,io.fabric8.camelk.v1alpha1.KameletBuilder>{
  public KameletBuilder() {
    this(false);
  }
  public KameletBuilder(java.lang.Boolean validationEnabled) {
    this(new Kamelet(), validationEnabled);
  }
  public KameletBuilder(io.fabric8.camelk.v1alpha1.KameletFluent<?> fluent) {
    this(fluent, false);
  }
  public KameletBuilder(io.fabric8.camelk.v1alpha1.KameletFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new Kamelet(), validationEnabled);
  }
  public KameletBuilder(io.fabric8.camelk.v1alpha1.KameletFluent<?> fluent,io.fabric8.camelk.v1alpha1.Kamelet instance) {
    this(fluent, instance, false);
  }
  public KameletBuilder(io.fabric8.camelk.v1alpha1.KameletFluent<?> fluent,io.fabric8.camelk.v1alpha1.Kamelet instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion()); 
    fluent.withKind(instance.getKind()); 
    fluent.withMetadata(instance.getMetadata()); 
    fluent.withSpec(instance.getSpec()); 
    fluent.withStatus(instance.getStatus()); 
    this.validationEnabled = validationEnabled; 
  }
  public KameletBuilder(io.fabric8.camelk.v1alpha1.Kamelet instance) {
    this(instance,false);
  }
  public KameletBuilder(io.fabric8.camelk.v1alpha1.Kamelet instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion()); 
    this.withKind(instance.getKind()); 
    this.withMetadata(instance.getMetadata()); 
    this.withSpec(instance.getSpec()); 
    this.withStatus(instance.getStatus()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.KameletFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.Kamelet build() {
    Kamelet buildable = new Kamelet(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletBuilder that = (KameletBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}