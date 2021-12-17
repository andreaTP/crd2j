package io.fabric8.camelk.v1alpha1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface EventTypeSpecFluent<A extends io.fabric8.camelk.v1alpha1.EventTypeSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.Fluent<A>{
  public java.lang.String getMediaType();
  public A withMediaType(java.lang.String mediaType);
  public java.lang.Boolean hasMediaType();
  
  /**
   * Method is deprecated. use withMediaType instead.
   */
  @java.lang.Deprecated
  public A withNewMediaType(java.lang.String arg0);
  public io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps getSchema();
  public A withSchema(io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps schema);
  public java.lang.Boolean hasSchema();
  
}