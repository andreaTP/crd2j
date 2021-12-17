package io.fabric8.camelk.v1alpha1;

import io.fabric8.camelk.v1.IntegrationSpec;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public class KameletBindingSpecFluentImpl<A extends io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent<A>{
  public KameletBindingSpecFluentImpl() {
  }
  public KameletBindingSpecFluentImpl(io.fabric8.camelk.v1alpha1.KameletBindingSpec instance) {
    this.withIntegration(instance.getIntegration()); 
    this.withSink(instance.getSink()); 
    this.withSource(instance.getSource()); 
  }
  private io.fabric8.camelk.v1.IntegrationSpec integration;
  private io.fabric8.camelk.v1alpha1.EndpointBuilder sink;
  private io.fabric8.camelk.v1alpha1.EndpointBuilder source;
  public io.fabric8.camelk.v1.IntegrationSpec getIntegration() {
    return this.integration;
  }
  public A withIntegration(io.fabric8.camelk.v1.IntegrationSpec integration) {
    this.integration=integration; return (A) this;
  }
  public java.lang.Boolean hasIntegration() {
    return this.integration != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSink instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.camelk.v1alpha1.Endpoint getSink() {
    return this.sink!=null?this.sink.build():null;
  }
  public io.fabric8.camelk.v1alpha1.Endpoint buildSink() {
    return this.sink!=null?this.sink.build():null;
  }
  public A withSink(io.fabric8.camelk.v1alpha1.Endpoint sink) {
    _visitables.get("sink").remove(this.sink);
    if (sink!=null){ this.sink= new io.fabric8.camelk.v1alpha1.EndpointBuilder(sink); _visitables.get("sink").add(this.sink);} return (A) this;
  }
  public java.lang.Boolean hasSink() {
    return this.sink != null;
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<A> withNewSink() {
    return new io.fabric8.camelk.v1alpha1.KameletBindingSpecFluentImpl.SinkNestedImpl();
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<A> withNewSinkLike(io.fabric8.camelk.v1alpha1.Endpoint item) {
    return new io.fabric8.camelk.v1alpha1.KameletBindingSpecFluentImpl.SinkNestedImpl(item);
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<A> editSink() {
    return withNewSinkLike(getSink());
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<A> editOrNewSink() {
    return withNewSinkLike(getSink() != null ? getSink(): new io.fabric8.camelk.v1alpha1.EndpointBuilder().build());
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<A> editOrNewSinkLike(io.fabric8.camelk.v1alpha1.Endpoint item) {
    return withNewSinkLike(getSink() != null ? getSink(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSource instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.camelk.v1alpha1.Endpoint getSource() {
    return this.source!=null?this.source.build():null;
  }
  public io.fabric8.camelk.v1alpha1.Endpoint buildSource() {
    return this.source!=null?this.source.build():null;
  }
  public A withSource(io.fabric8.camelk.v1alpha1.Endpoint source) {
    _visitables.get("source").remove(this.source);
    if (source!=null){ this.source= new io.fabric8.camelk.v1alpha1.EndpointBuilder(source); _visitables.get("source").add(this.source);} return (A) this;
  }
  public java.lang.Boolean hasSource() {
    return this.source != null;
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<A> withNewSource() {
    return new io.fabric8.camelk.v1alpha1.KameletBindingSpecFluentImpl.SourceNestedImpl();
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<A> withNewSourceLike(io.fabric8.camelk.v1alpha1.Endpoint item) {
    return new io.fabric8.camelk.v1alpha1.KameletBindingSpecFluentImpl.SourceNestedImpl(item);
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<A> editSource() {
    return withNewSourceLike(getSource());
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<A> editOrNewSource() {
    return withNewSourceLike(getSource() != null ? getSource(): new io.fabric8.camelk.v1alpha1.EndpointBuilder().build());
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<A> editOrNewSourceLike(io.fabric8.camelk.v1alpha1.Endpoint item) {
    return withNewSourceLike(getSource() != null ? getSource(): item);
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KameletBindingSpecFluentImpl that = (KameletBindingSpecFluentImpl) o;
    if (integration != null ? !integration.equals(that.integration) :that.integration != null) return false;
    if (sink != null ? !sink.equals(that.sink) :that.sink != null) return false;
    if (source != null ? !source.equals(that.source) :that.source != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(integration,  sink,  source,  super.hashCode());
  }
  public class SinkNestedImpl<N> extends io.fabric8.camelk.v1alpha1.EndpointFluentImpl<io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<N>> implements io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
    SinkNestedImpl(io.fabric8.camelk.v1alpha1.Endpoint item) {
      this.builder = new io.fabric8.camelk.v1alpha1.EndpointBuilder(this, item);
    }
    SinkNestedImpl() {
      this.builder = new io.fabric8.camelk.v1alpha1.EndpointBuilder(this);
    }
    io.fabric8.camelk.v1alpha1.EndpointBuilder builder;
    public N and() {
      return (N) KameletBindingSpecFluentImpl.this.withSink(builder.build());
    }
    public N endSink() {
      return and();
    }
    
  }
  public class SourceNestedImpl<N> extends io.fabric8.camelk.v1alpha1.EndpointFluentImpl<io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<N>> implements io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
    SourceNestedImpl(io.fabric8.camelk.v1alpha1.Endpoint item) {
      this.builder = new io.fabric8.camelk.v1alpha1.EndpointBuilder(this, item);
    }
    SourceNestedImpl() {
      this.builder = new io.fabric8.camelk.v1alpha1.EndpointBuilder(this);
    }
    io.fabric8.camelk.v1alpha1.EndpointBuilder builder;
    public N and() {
      return (N) KameletBindingSpecFluentImpl.this.withSource(builder.build());
    }
    public N endSource() {
      return and();
    }
    
  }
  
}