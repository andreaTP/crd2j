package io.fabric8.camelk.v1alpha1;

import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class KameletPropertyFluentImpl<A extends io.fabric8.camelk.v1alpha1.KameletPropertyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.camelk.v1alpha1.KameletPropertyFluent<A>{
  public KameletPropertyFluentImpl() {
  }
  public KameletPropertyFluentImpl(io.fabric8.camelk.v1alpha1.KameletProperty instance) {
    this.withDefault(instance.getDefault()); 
    this.withName(instance.getName()); 
  }
  private java.lang.String _default;
  private java.lang.String name;
  public java.lang.String getDefault() {
    return this._default;
  }
  public A withDefault(java.lang.String _default) {
    this._default=_default; return (A) this;
  }
  public java.lang.Boolean hasDefault() {
    return this._default != null;
  }
  
  /**
   * Method is deprecated. use withDefault instead.
   */
  @java.lang.Deprecated
  public A withNewDefault(java.lang.String arg0) {
    return (A)withDefault(new String(arg0));
  }
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public java.lang.Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0) {
    return (A)withName(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KameletPropertyFluentImpl that = (KameletPropertyFluentImpl) o;
    if (_default != null ? !_default.equals(that._default) :that._default != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(_default,  name,  super.hashCode());
  }
  
}