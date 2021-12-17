package io.fabric8.camelk.v1alpha1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface KameletPropertyFluent<A extends io.fabric8.camelk.v1alpha1.KameletPropertyFluent<A>> extends io.fabric8.kubernetes.api.builder.Fluent<A>{
  public java.lang.String getDefault();
  public A withDefault(java.lang.String _default);
  public java.lang.Boolean hasDefault();
  
  /**
   * Method is deprecated. use withDefault instead.
   */
  @java.lang.Deprecated
  public A withNewDefault(java.lang.String arg0);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0);
  
}