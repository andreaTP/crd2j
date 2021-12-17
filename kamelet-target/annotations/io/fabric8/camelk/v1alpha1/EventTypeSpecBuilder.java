package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class EventTypeSpecBuilder extends io.fabric8.camelk.v1alpha1.EventTypeSpecFluentImpl<io.fabric8.camelk.v1alpha1.EventTypeSpecBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.EventTypeSpec,io.fabric8.camelk.v1alpha1.EventTypeSpecBuilder>{
  public EventTypeSpecBuilder() {
    this(false);
  }
  public EventTypeSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new EventTypeSpec(), validationEnabled);
  }
  public EventTypeSpecBuilder(io.fabric8.camelk.v1alpha1.EventTypeSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public EventTypeSpecBuilder(io.fabric8.camelk.v1alpha1.EventTypeSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new EventTypeSpec(), validationEnabled);
  }
  public EventTypeSpecBuilder(io.fabric8.camelk.v1alpha1.EventTypeSpecFluent<?> fluent,io.fabric8.camelk.v1alpha1.EventTypeSpec instance) {
    this(fluent, instance, false);
  }
  public EventTypeSpecBuilder(io.fabric8.camelk.v1alpha1.EventTypeSpecFluent<?> fluent,io.fabric8.camelk.v1alpha1.EventTypeSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMediaType(instance.getMediaType()); 
    fluent.withSchema(instance.getSchema()); 
    this.validationEnabled = validationEnabled; 
  }
  public EventTypeSpecBuilder(io.fabric8.camelk.v1alpha1.EventTypeSpec instance) {
    this(instance,false);
  }
  public EventTypeSpecBuilder(io.fabric8.camelk.v1alpha1.EventTypeSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withMediaType(instance.getMediaType()); 
    this.withSchema(instance.getSchema()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.EventTypeSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.EventTypeSpec build() {
    EventTypeSpec buildable = new EventTypeSpec(fluent.getMediaType(),fluent.getSchema());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    EventTypeSpecBuilder that = (EventTypeSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}