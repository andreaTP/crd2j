package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class EndpointPropertiesBuilder extends io.fabric8.camelk.v1alpha1.EndpointPropertiesFluentImpl<io.fabric8.camelk.v1alpha1.EndpointPropertiesBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.EndpointProperties,io.fabric8.camelk.v1alpha1.EndpointPropertiesBuilder>{
  public EndpointPropertiesBuilder() {
    this(false);
  }
  public EndpointPropertiesBuilder(java.lang.Boolean validationEnabled) {
    this(new EndpointProperties(), validationEnabled);
  }
  public EndpointPropertiesBuilder(io.fabric8.camelk.v1alpha1.EndpointPropertiesFluent<?> fluent) {
    this(fluent, false);
  }
  public EndpointPropertiesBuilder(io.fabric8.camelk.v1alpha1.EndpointPropertiesFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new EndpointProperties(), validationEnabled);
  }
  public EndpointPropertiesBuilder(io.fabric8.camelk.v1alpha1.EndpointPropertiesFluent<?> fluent,io.fabric8.camelk.v1alpha1.EndpointProperties instance) {
    this(fluent, instance, false);
  }
  public EndpointPropertiesBuilder(io.fabric8.camelk.v1alpha1.EndpointPropertiesFluent<?> fluent,io.fabric8.camelk.v1alpha1.EndpointProperties instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    this.validationEnabled = validationEnabled; 
  }
  public EndpointPropertiesBuilder(io.fabric8.camelk.v1alpha1.EndpointProperties instance) {
    this(instance,false);
  }
  public EndpointPropertiesBuilder(io.fabric8.camelk.v1alpha1.EndpointProperties instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.EndpointPropertiesFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.EndpointProperties build() {
    EndpointProperties buildable = new EndpointProperties();
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    EndpointPropertiesBuilder that = (EndpointPropertiesBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}