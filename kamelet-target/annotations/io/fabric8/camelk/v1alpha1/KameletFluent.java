package io.fabric8.camelk.v1alpha1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
public interface KameletFluent<A extends io.fabric8.camelk.v1alpha1.KameletFluent<A>> extends io.fabric8.kubernetes.api.builder.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.kubernetes.api.model.ObjectMeta getMetadata();
  public io.fabric8.kubernetes.api.model.ObjectMeta buildMetadata();
  public A withMetadata(io.fabric8.kubernetes.api.model.ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<A> withNewMetadata();
  public io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<A> withNewMetadataLike(io.fabric8.kubernetes.api.model.ObjectMeta item);
  public io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<A> editMetadata();
  public io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<A> editOrNewMetadata();
  public io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<A> editOrNewMetadataLike(io.fabric8.kubernetes.api.model.ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.camelk.v1alpha1.KameletSpec getSpec();
  public io.fabric8.camelk.v1alpha1.KameletSpec buildSpec();
  public A withSpec(io.fabric8.camelk.v1alpha1.KameletSpec spec);
  public java.lang.Boolean hasSpec();
  public io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<A> withNewSpec();
  public io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<A> withNewSpecLike(io.fabric8.camelk.v1alpha1.KameletSpec item);
  public io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<A> editSpec();
  public io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<A> editOrNewSpec();
  public io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<A> editOrNewSpecLike(io.fabric8.camelk.v1alpha1.KameletSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.camelk.v1alpha1.KameletStatus getStatus();
  public io.fabric8.camelk.v1alpha1.KameletStatus buildStatus();
  public A withStatus(io.fabric8.camelk.v1alpha1.KameletStatus status);
  public java.lang.Boolean hasStatus();
  public io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<A> withNewStatus();
  public io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<A> withNewStatusLike(io.fabric8.camelk.v1alpha1.KameletStatus item);
  public io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<A> editStatus();
  public io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<A> editOrNewStatus();
  public io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<A> editOrNewStatusLike(io.fabric8.camelk.v1alpha1.KameletStatus item);
  public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.kubernetes.api.model.ObjectMetaFluent<io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.camelk.v1alpha1.KameletSpecFluent<io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.camelk.v1alpha1.KameletStatusFluent<io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}