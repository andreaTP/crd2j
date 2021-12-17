package io.fabric8.camelk.v1alpha1;

import io.fabric8.camelk.v1.IntegrationSpec;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface KameletBindingSpecFluent<A extends io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.Fluent<A>{
  public io.fabric8.camelk.v1.IntegrationSpec getIntegration();
  public A withIntegration(io.fabric8.camelk.v1.IntegrationSpec integration);
  public java.lang.Boolean hasIntegration();
  
  /**
   * This method has been deprecated, please use method buildSink instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.camelk.v1alpha1.Endpoint getSink();
  public io.fabric8.camelk.v1alpha1.Endpoint buildSink();
  public A withSink(io.fabric8.camelk.v1alpha1.Endpoint sink);
  public java.lang.Boolean hasSink();
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<A> withNewSink();
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<A> withNewSinkLike(io.fabric8.camelk.v1alpha1.Endpoint item);
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<A> editSink();
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<A> editOrNewSink();
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<A> editOrNewSinkLike(io.fabric8.camelk.v1alpha1.Endpoint item);
  
  /**
   * This method has been deprecated, please use method buildSource instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.camelk.v1alpha1.Endpoint getSource();
  public io.fabric8.camelk.v1alpha1.Endpoint buildSource();
  public A withSource(io.fabric8.camelk.v1alpha1.Endpoint source);
  public java.lang.Boolean hasSource();
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<A> withNewSource();
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<A> withNewSourceLike(io.fabric8.camelk.v1alpha1.Endpoint item);
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<A> editSource();
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<A> editOrNewSource();
  public io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<A> editOrNewSourceLike(io.fabric8.camelk.v1alpha1.Endpoint item);
  public interface SinkNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.camelk.v1alpha1.EndpointFluent<io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SinkNested<N>>{
    public N and();
    public N endSink();
    
  }
  public interface SourceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.camelk.v1alpha1.EndpointFluent<io.fabric8.camelk.v1alpha1.KameletBindingSpecFluent.SourceNested<N>>{
    public N and();
    public N endSource();
    
  }
  
}