package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class EndpointBuilder extends io.fabric8.camelk.v1alpha1.EndpointFluentImpl<io.fabric8.camelk.v1alpha1.EndpointBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.Endpoint,io.fabric8.camelk.v1alpha1.EndpointBuilder>{
  public EndpointBuilder() {
    this(false);
  }
  public EndpointBuilder(java.lang.Boolean validationEnabled) {
    this(new Endpoint(), validationEnabled);
  }
  public EndpointBuilder(io.fabric8.camelk.v1alpha1.EndpointFluent<?> fluent) {
    this(fluent, false);
  }
  public EndpointBuilder(io.fabric8.camelk.v1alpha1.EndpointFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new Endpoint(), validationEnabled);
  }
  public EndpointBuilder(io.fabric8.camelk.v1alpha1.EndpointFluent<?> fluent,io.fabric8.camelk.v1alpha1.Endpoint instance) {
    this(fluent, instance, false);
  }
  public EndpointBuilder(io.fabric8.camelk.v1alpha1.EndpointFluent<?> fluent,io.fabric8.camelk.v1alpha1.Endpoint instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withProperties(instance.getProperties()); 
    fluent.withRef(instance.getRef()); 
    fluent.withTypes(instance.getTypes()); 
    fluent.withUri(instance.getUri()); 
    this.validationEnabled = validationEnabled; 
  }
  public EndpointBuilder(io.fabric8.camelk.v1alpha1.Endpoint instance) {
    this(instance,false);
  }
  public EndpointBuilder(io.fabric8.camelk.v1alpha1.Endpoint instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withProperties(instance.getProperties()); 
    this.withRef(instance.getRef()); 
    this.withTypes(instance.getTypes()); 
    this.withUri(instance.getUri()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.EndpointFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.Endpoint build() {
    Endpoint buildable = new Endpoint(fluent.getProperties(),fluent.getRef(),fluent.getTypes(),fluent.getUri());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    EndpointBuilder that = (EndpointBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}