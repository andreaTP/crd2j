package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import java.lang.String;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public class EndpointFluentImpl<A extends io.fabric8.camelk.v1alpha1.EndpointFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.camelk.v1alpha1.EndpointFluent<A>{
  public EndpointFluentImpl() {
  }
  public EndpointFluentImpl(io.fabric8.camelk.v1alpha1.Endpoint instance) {
    this.withProperties(instance.getProperties()); 
    this.withRef(instance.getRef()); 
    this.withTypes(instance.getTypes()); 
    this.withUri(instance.getUri()); 
  }
  private io.fabric8.camelk.v1alpha1.EndpointPropertiesBuilder properties;
  private io.fabric8.kubernetes.api.model.ObjectReferenceBuilder ref;
  private java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> types;
  private java.lang.String uri;
  
  /**
   * This method has been deprecated, please use method buildProperties instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.camelk.v1alpha1.EndpointProperties getProperties() {
    return this.properties!=null?this.properties.build():null;
  }
  public io.fabric8.camelk.v1alpha1.EndpointProperties buildProperties() {
    return this.properties!=null?this.properties.build():null;
  }
  public A withProperties(io.fabric8.camelk.v1alpha1.EndpointProperties properties) {
    _visitables.get("properties").remove(this.properties);
    if (properties!=null){ this.properties= new io.fabric8.camelk.v1alpha1.EndpointPropertiesBuilder(properties); _visitables.get("properties").add(this.properties);} return (A) this;
  }
  public java.lang.Boolean hasProperties() {
    return this.properties != null;
  }
  public io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<A> withNewProperties() {
    return new io.fabric8.camelk.v1alpha1.EndpointFluentImpl.PropertiesNestedImpl();
  }
  public io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<A> withNewPropertiesLike(io.fabric8.camelk.v1alpha1.EndpointProperties item) {
    return new io.fabric8.camelk.v1alpha1.EndpointFluentImpl.PropertiesNestedImpl(item);
  }
  public io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<A> editProperties() {
    return withNewPropertiesLike(getProperties());
  }
  public io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<A> editOrNewProperties() {
    return withNewPropertiesLike(getProperties() != null ? getProperties(): new io.fabric8.camelk.v1alpha1.EndpointPropertiesBuilder().build());
  }
  public io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<A> editOrNewPropertiesLike(io.fabric8.camelk.v1alpha1.EndpointProperties item) {
    return withNewPropertiesLike(getProperties() != null ? getProperties(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildRef instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.kubernetes.api.model.ObjectReference getRef() {
    return this.ref!=null?this.ref.build():null;
  }
  public io.fabric8.kubernetes.api.model.ObjectReference buildRef() {
    return this.ref!=null?this.ref.build():null;
  }
  public A withRef(io.fabric8.kubernetes.api.model.ObjectReference ref) {
    _visitables.get("ref").remove(this.ref);
    if (ref!=null){ this.ref= new io.fabric8.kubernetes.api.model.ObjectReferenceBuilder(ref); _visitables.get("ref").add(this.ref);} return (A) this;
  }
  public java.lang.Boolean hasRef() {
    return this.ref != null;
  }
  public io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<A> withNewRef() {
    return new io.fabric8.camelk.v1alpha1.EndpointFluentImpl.RefNestedImpl();
  }
  public io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<A> withNewRefLike(io.fabric8.kubernetes.api.model.ObjectReference item) {
    return new io.fabric8.camelk.v1alpha1.EndpointFluentImpl.RefNestedImpl(item);
  }
  public io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<A> editRef() {
    return withNewRefLike(getRef());
  }
  public io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<A> editOrNewRef() {
    return withNewRefLike(getRef() != null ? getRef(): new io.fabric8.kubernetes.api.model.ObjectReferenceBuilder().build());
  }
  public io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<A> editOrNewRefLike(io.fabric8.kubernetes.api.model.ObjectReference item) {
    return withNewRefLike(getRef() != null ? getRef(): item);
  }
  public A addToTypes(java.lang.String key,io.fabric8.camelk.v1alpha1.EventTypeSpec value) {
    if(this.types == null && key != null && value != null) { this.types = new java.util.LinkedHashMap<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec>(); }
    if(key != null && value != null) {this.types.put(key, value);} return (A)this;
  }
  public A addToTypes(java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> map) {
    if(this.types == null && map != null) { this.types = new java.util.LinkedHashMap<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec>(); }
    if(map != null) { this.types.putAll(map);} return (A)this;
  }
  public A removeFromTypes(java.lang.String key) {
    if(this.types == null) { return (A) this; }
    if(key != null && this.types != null) {this.types.remove(key);} return (A)this;
  }
  public A removeFromTypes(java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> map) {
    if(this.types == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.types != null){this.types.remove(key);}}} return (A)this;
  }
  public java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> getTypes() {
    return this.types;
  }
  public <K,V>A withTypes(java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> types) {
    if (types == null) { this.types =  null;} else {this.types = new java.util.LinkedHashMap<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec>(types);} return (A) this;
  }
  public java.lang.Boolean hasTypes() {
    return this.types != null;
  }
  public java.lang.String getUri() {
    return this.uri;
  }
  public A withUri(java.lang.String uri) {
    this.uri=uri; return (A) this;
  }
  public java.lang.Boolean hasUri() {
    return this.uri != null;
  }
  
  /**
   * Method is deprecated. use withUri instead.
   */
  @java.lang.Deprecated
  public A withNewUri(java.lang.String arg0) {
    return (A)withUri(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointFluentImpl that = (EndpointFluentImpl) o;
    if (properties != null ? !properties.equals(that.properties) :that.properties != null) return false;
    if (ref != null ? !ref.equals(that.ref) :that.ref != null) return false;
    if (types != null ? !types.equals(that.types) :that.types != null) return false;
    if (uri != null ? !uri.equals(that.uri) :that.uri != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(properties,  ref,  types,  uri,  super.hashCode());
  }
  public class PropertiesNestedImpl<N> extends io.fabric8.camelk.v1alpha1.EndpointPropertiesFluentImpl<io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<N>> implements io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
    PropertiesNestedImpl(io.fabric8.camelk.v1alpha1.EndpointProperties item) {
      this.builder = new io.fabric8.camelk.v1alpha1.EndpointPropertiesBuilder(this, item);
    }
    PropertiesNestedImpl() {
      this.builder = new io.fabric8.camelk.v1alpha1.EndpointPropertiesBuilder(this);
    }
    io.fabric8.camelk.v1alpha1.EndpointPropertiesBuilder builder;
    public N and() {
      return (N) EndpointFluentImpl.this.withProperties(builder.build());
    }
    public N endProperties() {
      return and();
    }
    
  }
  public class RefNestedImpl<N> extends io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl<io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<N>> implements io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
    RefNestedImpl(io.fabric8.kubernetes.api.model.ObjectReference item) {
      this.builder = new io.fabric8.kubernetes.api.model.ObjectReferenceBuilder(this, item);
    }
    RefNestedImpl() {
      this.builder = new io.fabric8.kubernetes.api.model.ObjectReferenceBuilder(this);
    }
    io.fabric8.kubernetes.api.model.ObjectReferenceBuilder builder;
    public N and() {
      return (N) EndpointFluentImpl.this.withRef(builder.build());
    }
    public N endRef() {
      return and();
    }
    
  }
  
}