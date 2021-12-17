package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public class KameletFluentImpl<A extends io.fabric8.camelk.v1alpha1.KameletFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.camelk.v1alpha1.KameletFluent<A>{
  public KameletFluentImpl() {
  }
  public KameletFluentImpl(io.fabric8.camelk.v1alpha1.Kamelet instance) {
    this.withApiVersion(instance.getApiVersion()); 
    this.withKind(instance.getKind()); 
    this.withMetadata(instance.getMetadata()); 
    this.withSpec(instance.getSpec()); 
    this.withStatus(instance.getStatus()); 
  }
  private java.lang.String apiVersion;
  private java.lang.String kind;
  private io.fabric8.kubernetes.api.model.ObjectMetaBuilder metadata;
  private io.fabric8.camelk.v1alpha1.KameletSpecBuilder spec;
  private io.fabric8.camelk.v1alpha1.KameletStatusBuilder status;
  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0) {
    return (A)withApiVersion(new String(arg0));
  }
  public java.lang.String getKind() {
    return this.kind;
  }
  public A withKind(java.lang.String kind) {
    this.kind=kind; return (A) this;
  }
  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0) {
    return (A)withKind(new String(arg0));
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.kubernetes.api.model.ObjectMeta getMetadata() {
    return this.metadata!=null?this.metadata.build():null;
  }
  public io.fabric8.kubernetes.api.model.ObjectMeta buildMetadata() {
    return this.metadata!=null?this.metadata.build():null;
  }
  public A withMetadata(io.fabric8.kubernetes.api.model.ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new io.fabric8.kubernetes.api.model.ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} return (A) this;
  }
  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<A> withNewMetadata() {
    return new io.fabric8.camelk.v1alpha1.KameletFluentImpl.MetadataNestedImpl();
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<A> withNewMetadataLike(io.fabric8.kubernetes.api.model.ObjectMeta item) {
    return new io.fabric8.camelk.v1alpha1.KameletFluentImpl.MetadataNestedImpl(item);
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new io.fabric8.kubernetes.api.model.ObjectMetaBuilder().build());
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<A> editOrNewMetadataLike(io.fabric8.kubernetes.api.model.ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.camelk.v1alpha1.KameletSpec getSpec() {
    return this.spec!=null?this.spec.build():null;
  }
  public io.fabric8.camelk.v1alpha1.KameletSpec buildSpec() {
    return this.spec!=null?this.spec.build():null;
  }
  public A withSpec(io.fabric8.camelk.v1alpha1.KameletSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new io.fabric8.camelk.v1alpha1.KameletSpecBuilder(spec); _visitables.get("spec").add(this.spec);} return (A) this;
  }
  public java.lang.Boolean hasSpec() {
    return this.spec != null;
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<A> withNewSpec() {
    return new io.fabric8.camelk.v1alpha1.KameletFluentImpl.SpecNestedImpl();
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<A> withNewSpecLike(io.fabric8.camelk.v1alpha1.KameletSpec item) {
    return new io.fabric8.camelk.v1alpha1.KameletFluentImpl.SpecNestedImpl(item);
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new io.fabric8.camelk.v1alpha1.KameletSpecBuilder().build());
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<A> editOrNewSpecLike(io.fabric8.camelk.v1alpha1.KameletSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.camelk.v1alpha1.KameletStatus getStatus() {
    return this.status!=null?this.status.build():null;
  }
  public io.fabric8.camelk.v1alpha1.KameletStatus buildStatus() {
    return this.status!=null?this.status.build():null;
  }
  public A withStatus(io.fabric8.camelk.v1alpha1.KameletStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new io.fabric8.camelk.v1alpha1.KameletStatusBuilder(status); _visitables.get("status").add(this.status);} return (A) this;
  }
  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<A> withNewStatus() {
    return new io.fabric8.camelk.v1alpha1.KameletFluentImpl.StatusNestedImpl();
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<A> withNewStatusLike(io.fabric8.camelk.v1alpha1.KameletStatus item) {
    return new io.fabric8.camelk.v1alpha1.KameletFluentImpl.StatusNestedImpl(item);
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new io.fabric8.camelk.v1alpha1.KameletStatusBuilder().build());
  }
  public io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<A> editOrNewStatusLike(io.fabric8.camelk.v1alpha1.KameletStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KameletFluentImpl that = (KameletFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  spec,  status,  super.hashCode());
  }
  public class MetadataNestedImpl<N> extends io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl<io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<N>> implements io.fabric8.camelk.v1alpha1.KameletFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
    MetadataNestedImpl(io.fabric8.kubernetes.api.model.ObjectMeta item) {
      this.builder = new io.fabric8.kubernetes.api.model.ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new io.fabric8.kubernetes.api.model.ObjectMetaBuilder(this);
    }
    io.fabric8.kubernetes.api.model.ObjectMetaBuilder builder;
    public N and() {
      return (N) KameletFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  public class SpecNestedImpl<N> extends io.fabric8.camelk.v1alpha1.KameletSpecFluentImpl<io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<N>> implements io.fabric8.camelk.v1alpha1.KameletFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
    SpecNestedImpl(io.fabric8.camelk.v1alpha1.KameletSpec item) {
      this.builder = new io.fabric8.camelk.v1alpha1.KameletSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new io.fabric8.camelk.v1alpha1.KameletSpecBuilder(this);
    }
    io.fabric8.camelk.v1alpha1.KameletSpecBuilder builder;
    public N and() {
      return (N) KameletFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  public class StatusNestedImpl<N> extends io.fabric8.camelk.v1alpha1.KameletStatusFluentImpl<io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<N>> implements io.fabric8.camelk.v1alpha1.KameletFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
    StatusNestedImpl(io.fabric8.camelk.v1alpha1.KameletStatus item) {
      this.builder = new io.fabric8.camelk.v1alpha1.KameletStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new io.fabric8.camelk.v1alpha1.KameletStatusBuilder(this);
    }
    io.fabric8.camelk.v1alpha1.KameletStatusBuilder builder;
    public N and() {
      return (N) KameletFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}