package io.fabric8.camelk.v1alpha1;

import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class KameletBindingConditionFluentImpl<A extends io.fabric8.camelk.v1alpha1.KameletBindingConditionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.camelk.v1alpha1.KameletBindingConditionFluent<A>{
  public KameletBindingConditionFluentImpl() {
  }
  public KameletBindingConditionFluentImpl(io.fabric8.camelk.v1alpha1.KameletBindingCondition instance) {
    this.withLastTransitionTime(instance.getLastTransitionTime()); 
    this.withLastUpdateTime(instance.getLastUpdateTime()); 
    this.withMessage(instance.getMessage()); 
    this.withReason(instance.getReason()); 
    this.withStatus(instance.getStatus()); 
    this.withType(instance.getType()); 
  }
  private java.lang.String lastTransitionTime;
  private java.lang.String lastUpdateTime;
  private java.lang.String message;
  private java.lang.String reason;
  private java.lang.String status;
  private java.lang.String type;
  public java.lang.String getLastTransitionTime() {
    return this.lastTransitionTime;
  }
  public A withLastTransitionTime(java.lang.String lastTransitionTime) {
    this.lastTransitionTime=lastTransitionTime; return (A) this;
  }
  public java.lang.Boolean hasLastTransitionTime() {
    return this.lastTransitionTime != null;
  }
  
  /**
   * Method is deprecated. use withLastTransitionTime instead.
   */
  @java.lang.Deprecated
  public A withNewLastTransitionTime(java.lang.String arg0) {
    return (A)withLastTransitionTime(new String(arg0));
  }
  public java.lang.String getLastUpdateTime() {
    return this.lastUpdateTime;
  }
  public A withLastUpdateTime(java.lang.String lastUpdateTime) {
    this.lastUpdateTime=lastUpdateTime; return (A) this;
  }
  public java.lang.Boolean hasLastUpdateTime() {
    return this.lastUpdateTime != null;
  }
  
  /**
   * Method is deprecated. use withLastUpdateTime instead.
   */
  @java.lang.Deprecated
  public A withNewLastUpdateTime(java.lang.String arg0) {
    return (A)withLastUpdateTime(new String(arg0));
  }
  public java.lang.String getMessage() {
    return this.message;
  }
  public A withMessage(java.lang.String message) {
    this.message=message; return (A) this;
  }
  public java.lang.Boolean hasMessage() {
    return this.message != null;
  }
  
  /**
   * Method is deprecated. use withMessage instead.
   */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String arg0) {
    return (A)withMessage(new String(arg0));
  }
  public java.lang.String getReason() {
    return this.reason;
  }
  public A withReason(java.lang.String reason) {
    this.reason=reason; return (A) this;
  }
  public java.lang.Boolean hasReason() {
    return this.reason != null;
  }
  
  /**
   * Method is deprecated. use withReason instead.
   */
  @java.lang.Deprecated
  public A withNewReason(java.lang.String arg0) {
    return (A)withReason(new String(arg0));
  }
  public java.lang.String getStatus() {
    return this.status;
  }
  public A withStatus(java.lang.String status) {
    this.status=status; return (A) this;
  }
  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }
  
  /**
   * Method is deprecated. use withStatus instead.
   */
  @java.lang.Deprecated
  public A withNewStatus(java.lang.String arg0) {
    return (A)withStatus(new String(arg0));
  }
  public java.lang.String getType() {
    return this.type;
  }
  public A withType(java.lang.String type) {
    this.type=type; return (A) this;
  }
  public java.lang.Boolean hasType() {
    return this.type != null;
  }
  
  /**
   * Method is deprecated. use withType instead.
   */
  @java.lang.Deprecated
  public A withNewType(java.lang.String arg0) {
    return (A)withType(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KameletBindingConditionFluentImpl that = (KameletBindingConditionFluentImpl) o;
    if (lastTransitionTime != null ? !lastTransitionTime.equals(that.lastTransitionTime) :that.lastTransitionTime != null) return false;
    if (lastUpdateTime != null ? !lastUpdateTime.equals(that.lastUpdateTime) :that.lastUpdateTime != null) return false;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(lastTransitionTime,  lastUpdateTime,  message,  reason,  status,  type,  super.hashCode());
  }
  
}