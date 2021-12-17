package io.fabric8.camelk.v1alpha1;

import io.fabric8.camelk.v1.SourceSpec;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.JsonNode;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
public class KameletSpecFluentImpl<A extends io.fabric8.camelk.v1alpha1.KameletSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.camelk.v1alpha1.KameletSpecFluent<A>{
  public KameletSpecFluentImpl() {
  }
  public KameletSpecFluentImpl(io.fabric8.camelk.v1alpha1.KameletSpec instance) {
    this.withAuthorization(instance.getAuthorization()); 
    this.withDefinition(instance.getDefinition()); 
    this.withDependencies(instance.getDependencies()); 
    this.withFlow(instance.getFlow()); 
    this.withSources(instance.getSources()); 
    this.withTypes(instance.getTypes()); 
  }
  private io.fabric8.camelk.v1alpha1.AuthorizationSpecBuilder authorization;
  private io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps definition;
  private java.util.List<java.lang.String> dependencies;
  private com.fasterxml.jackson.databind.JsonNode flow;
  private java.util.List<io.fabric8.camelk.v1.SourceSpec> sources;
  private java.util.Map<java.lang.String,io.fabric8.camelk.v1alpha1.EventTypeSpec> types;
  
  /**
   * This method has been deprecated, please use method buildAuthorization instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.fabric8.camelk.v1alpha1.AuthorizationSpec getAuthorization() {
    return this.authorization!=null?this.authorization.build():null;
  }
  public io.fabric8.camelk.v1alpha1.AuthorizationSpec buildAuthorization() {
    return this.authorization!=null?this.authorization.build():null;
  }
  public A withAuthorization(io.fabric8.camelk.v1alpha1.AuthorizationSpec authorization) {
    _visitables.get("authorization").remove(this.authorization);
    if (authorization!=null){ this.authorization= new io.fabric8.camelk.v1alpha1.AuthorizationSpecBuilder(authorization); _visitables.get("authorization").add(this.authorization);} return (A) this;
  }
  public java.lang.Boolean hasAuthorization() {
    return this.authorization != null;
  }
  public io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<A> withNewAuthorization() {
    return new io.fabric8.camelk.v1alpha1.KameletSpecFluentImpl.AuthorizationNestedImpl();
  }
  public io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<A> withNewAuthorizationLike(io.fabric8.camelk.v1alpha1.AuthorizationSpec item) {
    return new io.fabric8.camelk.v1alpha1.KameletSpecFluentImpl.AuthorizationNestedImpl(item);
  }
  public io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<A> editAuthorization() {
    return withNewAuthorizationLike(getAuthorization());
  }
  public io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<A> editOrNewAuthorization() {
    return withNewAuthorizationLike(getAuthorization() != null ? getAuthorization(): new io.fabric8.camelk.v1alpha1.AuthorizationSpecBuilder().build());
  }
  public io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<A> editOrNewAuthorizationLike(io.fabric8.camelk.v1alpha1.AuthorizationSpec item) {
    return withNewAuthorizationLike(getAuthorization() != null ? getAuthorization(): item);
  }
  public io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps getDefinition() {
    return this.definition;
  }
  public A withDefinition(io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps definition) {
    this.definition=definition; return (A) this;
  }
  public java.lang.Boolean hasDefinition() {
    return this.definition != null;
  }
  public A addToDependencies(java.lang.Integer index,java.lang.String item) {
    if (this.dependencies == null) {this.dependencies = new java.util.ArrayList<java.lang.String>();}
    this.dependencies.add(index, item);
    return (A)this;
  }
  public A setToDependencies(java.lang.Integer index,java.lang.String item) {
    if (this.dependencies == null) {this.dependencies = new java.util.ArrayList<java.lang.String>();}
    this.dependencies.set(index, item); return (A)this;
  }
  public A addToDependencies(java.lang.String... items) {
    if (this.dependencies == null) {this.dependencies = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.dependencies.add(item);} return (A)this;
  }
  public A addAllToDependencies(java.util.Collection<java.lang.String> items) {
    if (this.dependencies == null) {this.dependencies = new java.util.ArrayList<java.lang.String>();}
    for (java.lang.String item : items) {this.dependencies.add(item);} return (A)this;
  }
  public A removeFromDependencies(java.lang.String... items) {
    for (java.lang.String item : items) {if (this.dependencies!= null){ this.dependencies.remove(item);}} return (A)this;
  }
  public A removeAllFromDependencies(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {if (this.dependencies!= null){ this.dependencies.remove(item);}} return (A)this;
  }
  public java.util.List<java.lang.String> getDependencies() {
    return this.dependencies;
  }
  public java.lang.String getDependency(java.lang.Integer index) {
    return this.dependencies.get(index);
  }
  public java.lang.String getFirstDependency() {
    return this.dependencies.get(0);
  }
  public java.lang.String getLastDependency() {
    return this.dependencies.get(dependencies.size() - 1);
  }
  public java.lang.String getMatchingDependency(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: dependencies) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingDependency(java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item: dependencies) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withDependencies(java.util.List<java.lang.String> dependencies) {
    if (dependencies != null) {this.dependencies = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : dependencies){this.addToDependencies(item);}} else { this.dependencies = null;} return (A) this;
  }
  public A withDependencies(java.lang.String... dependencies) {
    if (this.dependencies != null) {this.dependencies.clear();}
    if (dependencies != null) {for (java.lang.String item :dependencies){ this.addToDependencies(item);}} return (A) this;
  }
  public java.lang.Boolean hasDependencies() {
    return dependencies != null && !dependencies.isEmpty();
  }
  public A addNewDependency(java.lang.String arg0) {
    return (A)addToDependencies(new String(arg0));
  }
  public com.fasterxml.jackson.databind.JsonNode getFlow() {
    return this.flow;
  }
  public A withFlow(com.fasterxml.jackson.databind.JsonNode flow) {
    this.flow=flow; return (A) this;
  }
  public java.lang.Boolean hasFlow() {
    return this.flow != null;
  }
  public A addToSources(java.lang.Integer index,io.fabric8.camelk.v1.SourceSpec item) {
    if (this.sources == null) {this.sources = new java.util.ArrayList<io.fabric8.camelk.v1.SourceSpec>();}
    this.sources.add(index, item);
    return (A)this;
  }
  public A setToSources(java.lang.Integer index,io.fabric8.camelk.v1.SourceSpec item) {
    if (this.sources == null) {this.sources = new java.util.ArrayList<io.fabric8.camelk.v1.SourceSpec>();}
    this.sources.set(index, item); return (A)this;
  }
  public A addToSources(io.fabric8.camelk.v1.SourceSpec... items) {
    if (this.sources == null) {this.sources = new java.util.ArrayList<io.fabric8.camelk.v1.SourceSpec>();}
    for (io.fabric8.camelk.v1.SourceSpec item : items) {this.sources.add(item);} return (A)this;
  }
  public A addAllToSources(java.util.Collection<io.fabric8.camelk.v1.SourceSpec> items) {
    if (this.sources == null) {this.sources = new java.util.ArrayList<io.fabric8.camelk.v1.SourceSpec>();}
    for (io.fabric8.camelk.v1.SourceSpec item : items) {this.sources.add(item);} return (A)this;
  }
  public A removeFromSources(io.fabric8.camelk.v1.SourceSpec... items) {
    for (io.fabric8.camelk.v1.SourceSpec item : items) {if (this.sources!= null){ this.sources.remove(item);}} return (A)this;
  }
  public A removeAllFromSources(java.util.Collection<io.fabric8.camelk.v1.SourceSpec> items) {
    for (io.fabric8.camelk.v1.SourceSpec item : items) {if (this.sources!= null){ this.sources.remove(item);}} return (A)this;
  }
  public java.util.List<io.fabric8.camelk.v1.SourceSpec> getSources() {
    return this.sources;
  }
  public io.fabric8.camelk.v1.SourceSpec getSource(java.lang.Integer index) {
    return this.sources.get(index);
  }
  public io.fabric8.camelk.v1.SourceSpec getFirstSource() {
    return this.sources.get(0);
  }
  public io.fabric8.camelk.v1.SourceSpec getLastSource() {
    return this.sources.get(sources.size() - 1);
  }
  public io.fabric8.camelk.v1.SourceSpec getMatchingSource(java.util.function.Predicate<io.fabric8.camelk.v1.SourceSpec> predicate) {
    for (io.fabric8.camelk.v1.SourceSpec item: sources) { if(predicate.test(item)){ return item;} } return null;
  }
  public java.lang.Boolean hasMatchingSource(java.util.function.Predicate<io.fabric8.camelk.v1.SourceSpec> predicate) {
    for (io.fabric8.camelk.v1.SourceSpec item: sources) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withSources(java.util.List<io.fabric8.camelk.v1.SourceSpec> sources) {
    if (sources != null) {this.sources = new java.util.ArrayList<io.fabric8.camelk.v1.SourceSpec>(); for (io.fabric8.camelk.v1.SourceSpec item : sources){this.addToSources(item);}} else { this.sources = null;} return (A) this;
  }
  public A withSources(io.fabric8.camelk.v1.SourceSpec... sources) {
    if (this.sources != null) {this.sources.clear();}
    if (sources != null) {for (io.fabric8.camelk.v1.SourceSpec item :sources){ this.addToSources(item);}} return (A) this;
  }
  public java.lang.Boolean hasSources() {
    return sources != null && !sources.isEmpty();
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
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KameletSpecFluentImpl that = (KameletSpecFluentImpl) o;
    if (authorization != null ? !authorization.equals(that.authorization) :that.authorization != null) return false;
    if (definition != null ? !definition.equals(that.definition) :that.definition != null) return false;
    if (dependencies != null ? !dependencies.equals(that.dependencies) :that.dependencies != null) return false;
    if (flow != null ? !flow.equals(that.flow) :that.flow != null) return false;
    if (sources != null ? !sources.equals(that.sources) :that.sources != null) return false;
    if (types != null ? !types.equals(that.types) :that.types != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(authorization,  definition,  dependencies,  flow,  sources,  types,  super.hashCode());
  }
  public class AuthorizationNestedImpl<N> extends io.fabric8.camelk.v1alpha1.AuthorizationSpecFluentImpl<io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<N>> implements io.fabric8.camelk.v1alpha1.KameletSpecFluent.AuthorizationNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
    AuthorizationNestedImpl(io.fabric8.camelk.v1alpha1.AuthorizationSpec item) {
      this.builder = new io.fabric8.camelk.v1alpha1.AuthorizationSpecBuilder(this, item);
    }
    AuthorizationNestedImpl() {
      this.builder = new io.fabric8.camelk.v1alpha1.AuthorizationSpecBuilder(this);
    }
    io.fabric8.camelk.v1alpha1.AuthorizationSpecBuilder builder;
    public N and() {
      return (N) KameletSpecFluentImpl.this.withAuthorization(builder.build());
    }
    public N endAuthorization() {
      return and();
    }
    
  }
  
}