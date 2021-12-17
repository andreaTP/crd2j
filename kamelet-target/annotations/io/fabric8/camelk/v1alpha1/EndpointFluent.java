package io.fabric8.camelk.v1alpha1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface EndpointFluent<A extends io.fabric8.camelk.v1alpha1.EndpointFluent<A>> extends io.fabric8.kubernetes.api.builder.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildProperties instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.camelk.v1alpha1.EndpointProperties getProperties();
  public io.fabric8.camelk.v1alpha1.EndpointProperties buildProperties();
  public A withProperties(io.fabric8.camelk.v1alpha1.EndpointProperties properties);
  public java.lang.Boolean hasProperties();
  public io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<A> withNewProperties();
  public io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<A> withNewPropertiesLike(io.fabric8.camelk.v1alpha1.EndpointProperties item);
  public io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<A> editProperties();
  public io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<A> editOrNewProperties();
  public io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<A> editOrNewPropertiesLike(io.fabric8.camelk.v1alpha1.EndpointProperties item);
  
  /**
   * This method has been deprecated, please use method buildRef instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.kubernetes.api.model.ObjectReference getRef();
  public io.fabric8.kubernetes.api.model.ObjectReference buildRef();
  public A withRef(io.fabric8.kubernetes.api.model.ObjectReference ref);
  public java.lang.Boolean hasRef();
  public io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<A> withNewRef();
  public io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<A> withNewRefLike(io.fabric8.kubernetes.api.model.ObjectReference item);
  public io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<A> editRef();
  public io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<A> editOrNewRef();
  public io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<A> editOrNewRefLike(io.fabric8.kubernetes.api.model.ObjectReference item);
  public A addToTypes(java.lang.String key,io.fabric8.camelk.v1alpha1.EventTypeSpec value);
  public A addToTypes(java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> map);
  public A removeFromTypes(java.lang.String key);
  public A removeFromTypes(java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> map);
  public java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> getTypes();
  public <K,V>A withTypes(java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> types);
  public java.lang.Boolean hasTypes();
  public java.lang.String getUri();
  public A withUri(java.lang.String uri);
  public java.lang.Boolean hasUri();
  
  /**
   * Method is deprecated. use withUri instead.
   */
  @java.lang.Deprecated
  public A withNewUri(java.lang.String arg0);
  public interface PropertiesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.camelk.v1alpha1.EndpointPropertiesFluent<io.fabric8.camelk.v1alpha1.EndpointFluent.PropertiesNested<N>>{
    public N and();
    public N endProperties();
    
  }
  public interface RefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.ObjectReferenceFluent<io.fabric8.camelk.v1alpha1.EndpointFluent.RefNested<N>>{
    public N and();
    public N endRef();
    
  }
  
}