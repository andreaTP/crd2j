package io.fabric8.camelk.v1alpha1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.camelk.v1.SourceSpec;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.JsonNode;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Integer;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
public interface KameletSpecFluent<A extends io.fabric8.camelk.v1alpha1.KameletSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildAuthorization instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.camelk.v1alpha1.AuthorizationSpec getAuthorization();
  public io.fabric8.camelk.v1alpha1.AuthorizationSpec buildAuthorization();
  public A withAuthorization(io.fabric8.camelk.v1alpha1.AuthorizationSpec authorization);
  public java.lang.Boolean hasAuthorization();
  public io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<A> withNewAuthorization();
  public io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<A> withNewAuthorizationLike(io.fabric8.camelk.v1alpha1.AuthorizationSpec item);
  public io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<A> editAuthorization();
  public io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<A> editOrNewAuthorization();
  public io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<A> editOrNewAuthorizationLike(io.fabric8.camelk.v1alpha1.AuthorizationSpec item);
  public io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps getDefinition();
  public A withDefinition(io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps definition);
  public java.lang.Boolean hasDefinition();
  public A addToDependencies(java.lang.Integer index,java.lang.String item);
  public A setToDependencies(java.lang.Integer index,java.lang.String item);
  public A addToDependencies(java.lang.String... items);
  public A addAllToDependencies(java.util.Collection<java.lang.String> items);
  public A removeFromDependencies(java.lang.String... items);
  public A removeAllFromDependencies(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getDependencies();
  public java.lang.String getDependency(java.lang.Integer index);
  public java.lang.String getFirstDependency();
  public java.lang.String getLastDependency();
  public java.lang.String getMatchingDependency(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingDependency(java.util.function.Predicate<java.lang.String> predicate);
  public A withDependencies(java.util.List<java.lang.String> dependencies);
  public A withDependencies(java.lang.String... dependencies);
  public java.lang.Boolean hasDependencies();
  public A addNewDependency(java.lang.String arg0);
  public com.fasterxml.jackson.databind.JsonNode getFlow();
  public A withFlow(com.fasterxml.jackson.databind.JsonNode flow);
  public java.lang.Boolean hasFlow();
  public A addToSources(java.lang.Integer index,io.fabric8.camelk.v1.SourceSpec item);
  public A setToSources(java.lang.Integer index,io.fabric8.camelk.v1.SourceSpec item);
  public A addToSources(io.fabric8.camelk.v1.SourceSpec... items);
  public A addAllToSources(java.util.Collection<io.fabric8.camelk.v1.SourceSpec> items);
  public A removeFromSources(io.fabric8.camelk.v1.SourceSpec... items);
  public A removeAllFromSources(java.util.Collection<io.fabric8.camelk.v1.SourceSpec> items);
  public java.util.List<io.fabric8.camelk.v1.SourceSpec> getSources();
  public io.fabric8.camelk.v1.SourceSpec getSource(java.lang.Integer index);
  public io.fabric8.camelk.v1.SourceSpec getFirstSource();
  public io.fabric8.camelk.v1.SourceSpec getLastSource();
  public io.fabric8.camelk.v1.SourceSpec getMatchingSource(java.util.function.Predicate<io.fabric8.camelk.v1.SourceSpec> predicate);
  public java.lang.Boolean hasMatchingSource(java.util.function.Predicate<io.fabric8.camelk.v1.SourceSpec> predicate);
  public A withSources(java.util.List<io.fabric8.camelk.v1.SourceSpec> sources);
  public A withSources(io.fabric8.camelk.v1.SourceSpec... sources);
  public java.lang.Boolean hasSources();
  public A addToTypes(java.lang.String key,io.fabric8.camelk.v1alpha1.EventTypeSpec value);
  public A addToTypes(java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> map);
  public A removeFromTypes(java.lang.String key);
  public A removeFromTypes(java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> map);
  public java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> getTypes();
  public <K,V>A withTypes(java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> types);
  public java.lang.Boolean hasTypes();
  public interface AuthorizationNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.camelk.v1alpha1.AuthorizationSpecFluent<io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<N>>{
    public N and();
    public N endAuthorization();
    
  }
  
}