package io.fabric8.camelk.v1alpha1;

import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class EventTypeSpecFluentImpl<A extends io.fabric8.camelk.v1alpha1.EventTypeSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.camelk.v1alpha1.EventTypeSpecFluent<A>{
  public EventTypeSpecFluentImpl() {
  }
  public EventTypeSpecFluentImpl(io.fabric8.camelk.v1alpha1.EventTypeSpec instance) {
    this.withMediaType(instance.getMediaType()); 
    this.withSchema(instance.getSchema()); 
  }
  private java.lang.String mediaType;
  private io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps schema;
  public java.lang.String getMediaType() {
    return this.mediaType;
  }
  public A withMediaType(java.lang.String mediaType) {
    this.mediaType=mediaType; return (A) this;
  }
  public java.lang.Boolean hasMediaType() {
    return this.mediaType != null;
  }
  
  /**
   * Method is deprecated. use withMediaType instead.
   */
  @java.lang.Deprecated
  public A withNewMediaType(java.lang.String arg0) {
    return (A)withMediaType(new String(arg0));
  }
  public io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps getSchema() {
    return this.schema;
  }
  public A withSchema(io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps schema) {
    this.schema=schema; return (A) this;
  }
  public java.lang.Boolean hasSchema() {
    return this.schema != null;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EventTypeSpecFluentImpl that = (EventTypeSpecFluentImpl) o;
    if (mediaType != null ? !mediaType.equals(that.mediaType) :that.mediaType != null) return false;
    if (schema != null ? !schema.equals(that.schema) :that.schema != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(mediaType,  schema,  super.hashCode());
  }
  
}