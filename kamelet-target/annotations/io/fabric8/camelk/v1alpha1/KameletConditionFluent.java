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
public interface KameletConditionFluent<A extends io.fabric8.camelk.v1alpha1.KameletConditionFluent<A>> extends io.fabric8.kubernetes.api.builder.Fluent<A>{
  public java.lang.String getLastTransitionTime();
  public A withLastTransitionTime(java.lang.String lastTransitionTime);
  public java.lang.Boolean hasLastTransitionTime();
  
  /**
   * Method is deprecated. use withLastTransitionTime instead.
   */
  @java.lang.Deprecated
  public A withNewLastTransitionTime(java.lang.String arg0);
  public java.lang.String getLastUpdateTime();
  public A withLastUpdateTime(java.lang.String lastUpdateTime);
  public java.lang.Boolean hasLastUpdateTime();
  
  /**
   * Method is deprecated. use withLastUpdateTime instead.
   */
  @java.lang.Deprecated
  public A withNewLastUpdateTime(java.lang.String arg0);
  public java.lang.String getMessage();
  public A withMessage(java.lang.String message);
  public java.lang.Boolean hasMessage();
  
  /**
   * Method is deprecated. use withMessage instead.
   */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String arg0);
  public java.lang.String getReason();
  public A withReason(java.lang.String reason);
  public java.lang.Boolean hasReason();
  
  /**
   * Method is deprecated. use withReason instead.
   */
  @java.lang.Deprecated
  public A withNewReason(java.lang.String arg0);
  public java.lang.String getStatus();
  public A withStatus(java.lang.String status);
  public java.lang.Boolean hasStatus();
  
  /**
   * Method is deprecated. use withStatus instead.
   */
  @java.lang.Deprecated
  public A withNewStatus(java.lang.String arg0);
  public java.lang.String getType();
  public A withType(java.lang.String type);
  public java.lang.Boolean hasType();
  
  /**
   * Method is deprecated. use withType instead.
   */
  @java.lang.Deprecated
  public A withNewType(java.lang.String arg0);
  
}