package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
public class KameletStatusFluentImpl<A extends io.fabric8.camelk.v1alpha1.KameletStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.camelk.v1alpha1.KameletStatusFluent<A>{
  public KameletStatusFluentImpl() {
  }
  public KameletStatusFluentImpl(io.fabric8.camelk.v1alpha1.KameletStatus instance) {
    this.withConditions(instance.getConditions()); 
    this.withPhase(instance.getPhase()); 
    this.withProperties(instance.getProperties()); 
  }
  private java.util.List<io.fabric8.camelk.v1alpha1.KameletConditionBuilder> conditions;
  private java.lang.String phase;
  private java.util.List<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder> properties;
  public A addToConditions(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletCondition item) {
    if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletConditionBuilder>();}
    io.fabric8.camelk.v1alpha1.KameletConditionBuilder builder = new io.fabric8.camelk.v1alpha1.KameletConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletCondition item) {
    if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletConditionBuilder>();}
    io.fabric8.camelk.v1alpha1.KameletConditionBuilder builder = new io.fabric8.camelk.v1alpha1.KameletConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.fabric8.camelk.v1alpha1.KameletCondition... items) {
    if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletConditionBuilder>();}
    for (io.fabric8.camelk.v1alpha1.KameletCondition item : items) {io.fabric8.camelk.v1alpha1.KameletConditionBuilder builder = new io.fabric8.camelk.v1alpha1.KameletConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletCondition> items) {
    if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletConditionBuilder>();}
    for (io.fabric8.camelk.v1alpha1.KameletCondition item : items) {io.fabric8.camelk.v1alpha1.KameletConditionBuilder builder = new io.fabric8.camelk.v1alpha1.KameletConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.fabric8.camelk.v1alpha1.KameletCondition... items) {
    for (io.fabric8.camelk.v1alpha1.KameletCondition item : items) {io.fabric8.camelk.v1alpha1.KameletConditionBuilder builder = new io.fabric8.camelk.v1alpha1.KameletConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletCondition> items) {
    for (io.fabric8.camelk.v1alpha1.KameletCondition item : items) {io.fabric8.camelk.v1alpha1.KameletConditionBuilder builder = new io.fabric8.camelk.v1alpha1.KameletConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<io.fabric8.camelk.v1alpha1.KameletConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      io.fabric8.camelk.v1alpha1.KameletConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletCondition> getConditions() {
    return build(conditions);
  }
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletCondition> buildConditions() {
    return build(conditions);
  }
  public io.fabric8.camelk.v1alpha1.KameletCondition buildCondition(java.lang.Integer index) {
    return this.conditions.get(index).build();
  }
  public io.fabric8.camelk.v1alpha1.KameletCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public io.fabric8.camelk.v1alpha1.KameletCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public io.fabric8.camelk.v1alpha1.KameletCondition buildMatchingCondition(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletConditionBuilder> predicate) {
    for (io.fabric8.camelk.v1alpha1.KameletConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletConditionBuilder> predicate) {
    for (io.fabric8.camelk.v1alpha1.KameletConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(java.util.List<io.fabric8.camelk.v1alpha1.KameletCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletConditionBuilder>(); for (io.fabric8.camelk.v1alpha1.KameletCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.fabric8.camelk.v1alpha1.KameletCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (io.fabric8.camelk.v1alpha1.KameletCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public java.lang.Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> addNewCondition() {
    return new io.fabric8.camelk.v1alpha1.KameletStatusFluentImpl.ConditionsNestedImpl();
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> addNewConditionLike(io.fabric8.camelk.v1alpha1.KameletCondition item) {
    return new io.fabric8.camelk.v1alpha1.KameletStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletCondition item) {
    return new io.fabric8.camelk.v1alpha1.KameletStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public java.lang.String getPhase() {
    return this.phase;
  }
  public A withPhase(java.lang.String phase) {
    this.phase=phase; return (A) this;
  }
  public java.lang.Boolean hasPhase() {
    return this.phase != null;
  }
  
  /**
   * Method is deprecated. use withPhase instead.
   */
  @java.lang.Deprecated
  public A withNewPhase(java.lang.String arg0) {
    return (A)withPhase(new String(arg0));
  }
  public A addToProperties(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletProperty item) {
    if (this.properties == null) {this.properties = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder>();}
    io.fabric8.camelk.v1alpha1.KameletPropertyBuilder builder = new io.fabric8.camelk.v1alpha1.KameletPropertyBuilder(item);_visitables.get("properties").add(index >= 0 ? index : _visitables.get("properties").size(), builder);this.properties.add(index >= 0 ? index : properties.size(), builder); return (A)this;
  }
  public A setToProperties(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletProperty item) {
    if (this.properties == null) {this.properties = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder>();}
    io.fabric8.camelk.v1alpha1.KameletPropertyBuilder builder = new io.fabric8.camelk.v1alpha1.KameletPropertyBuilder(item);
    if (index < 0 || index >= _visitables.get("properties").size()) { _visitables.get("properties").add(builder); } else { _visitables.get("properties").set(index, builder);}
    if (index < 0 || index >= properties.size()) { properties.add(builder); } else { properties.set(index, builder);}
     return (A)this;
  }
  public A addToProperties(io.fabric8.camelk.v1alpha1.KameletProperty... items) {
    if (this.properties == null) {this.properties = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder>();}
    for (io.fabric8.camelk.v1alpha1.KameletProperty item : items) {io.fabric8.camelk.v1alpha1.KameletPropertyBuilder builder = new io.fabric8.camelk.v1alpha1.KameletPropertyBuilder(item);_visitables.get("properties").add(builder);this.properties.add(builder);} return (A)this;
  }
  public A addAllToProperties(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletProperty> items) {
    if (this.properties == null) {this.properties = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder>();}
    for (io.fabric8.camelk.v1alpha1.KameletProperty item : items) {io.fabric8.camelk.v1alpha1.KameletPropertyBuilder builder = new io.fabric8.camelk.v1alpha1.KameletPropertyBuilder(item);_visitables.get("properties").add(builder);this.properties.add(builder);} return (A)this;
  }
  public A removeFromProperties(io.fabric8.camelk.v1alpha1.KameletProperty... items) {
    for (io.fabric8.camelk.v1alpha1.KameletProperty item : items) {io.fabric8.camelk.v1alpha1.KameletPropertyBuilder builder = new io.fabric8.camelk.v1alpha1.KameletPropertyBuilder(item);_visitables.get("properties").remove(builder);if (this.properties != null) {this.properties.remove(builder);}} return (A)this;
  }
  public A removeAllFromProperties(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletProperty> items) {
    for (io.fabric8.camelk.v1alpha1.KameletProperty item : items) {io.fabric8.camelk.v1alpha1.KameletPropertyBuilder builder = new io.fabric8.camelk.v1alpha1.KameletPropertyBuilder(item);_visitables.get("properties").remove(builder);if (this.properties != null) {this.properties.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromProperties(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder> predicate) {
    if (properties == null) return (A) this;
    final Iterator<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder> each = properties.iterator();
    final List visitables = _visitables.get("properties");
    while (each.hasNext()) {
      io.fabric8.camelk.v1alpha1.KameletPropertyBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildProperties instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletProperty> getProperties() {
    return build(properties);
  }
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletProperty> buildProperties() {
    return build(properties);
  }
  public io.fabric8.camelk.v1alpha1.KameletProperty buildProperty(java.lang.Integer index) {
    return this.properties.get(index).build();
  }
  public io.fabric8.camelk.v1alpha1.KameletProperty buildFirstProperty() {
    return this.properties.get(0).build();
  }
  public io.fabric8.camelk.v1alpha1.KameletProperty buildLastProperty() {
    return this.properties.get(properties.size() - 1).build();
  }
  public io.fabric8.camelk.v1alpha1.KameletProperty buildMatchingProperty(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder> predicate) {
    for (io.fabric8.camelk.v1alpha1.KameletPropertyBuilder item: properties) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public java.lang.Boolean hasMatchingProperty(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder> predicate) {
    for (io.fabric8.camelk.v1alpha1.KameletPropertyBuilder item: properties) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withProperties(java.util.List<io.fabric8.camelk.v1alpha1.KameletProperty> properties) {
    if (this.properties != null) { _visitables.get("properties").removeAll(this.properties);}
    if (properties != null) {this.properties = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder>(); for (io.fabric8.camelk.v1alpha1.KameletProperty item : properties){this.addToProperties(item);}} else { this.properties = null;} return (A) this;
  }
  public A withProperties(io.fabric8.camelk.v1alpha1.KameletProperty... properties) {
    if (this.properties != null) {this.properties.clear();}
    if (properties != null) {for (io.fabric8.camelk.v1alpha1.KameletProperty item :properties){ this.addToProperties(item);}} return (A) this;
  }
  public java.lang.Boolean hasProperties() {
    return properties != null && !properties.isEmpty();
  }
  public A addNewProperty(java.lang.String _default,java.lang.String name) {
    return (A)addToProperties(new KameletProperty(_default, name));
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> addNewProperty() {
    return new io.fabric8.camelk.v1alpha1.KameletStatusFluentImpl.PropertiesNestedImpl();
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> addNewPropertyLike(io.fabric8.camelk.v1alpha1.KameletProperty item) {
    return new io.fabric8.camelk.v1alpha1.KameletStatusFluentImpl.PropertiesNestedImpl(-1, item);
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> setNewPropertyLike(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletProperty item) {
    return new io.fabric8.camelk.v1alpha1.KameletStatusFluentImpl.PropertiesNestedImpl(index, item);
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> editProperty(java.lang.Integer index) {
    if (properties.size() <= index) throw new RuntimeException("Can't edit properties. Index exceeds size.");
    return setNewPropertyLike(index, buildProperty(index));
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> editFirstProperty() {
    if (properties.size() == 0) throw new RuntimeException("Can't edit first properties. The list is empty.");
    return setNewPropertyLike(0, buildProperty(0));
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> editLastProperty() {
    int index = properties.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last properties. The list is empty.");
    return setNewPropertyLike(index, buildProperty(index));
  }
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> editMatchingProperty(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder> predicate) {
    int index = -1;
    for (int i=0;i<properties.size();i++) { 
    if (predicate.test(properties.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching properties. No match found.");
    return setNewPropertyLike(index, buildProperty(index));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KameletStatusFluentImpl that = (KameletStatusFluentImpl) o;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
    if (properties != null ? !properties.equals(that.properties) :that.properties != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(conditions,  phase,  properties,  super.hashCode());
  }
  public class ConditionsNestedImpl<N> extends io.fabric8.camelk.v1alpha1.KameletConditionFluentImpl<io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<N>> implements io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
    ConditionsNestedImpl(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletCondition item) {
      this.index = index;
      this.builder = new io.fabric8.camelk.v1alpha1.KameletConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new io.fabric8.camelk.v1alpha1.KameletConditionBuilder(this);
    }
    io.fabric8.camelk.v1alpha1.KameletConditionBuilder builder;
    java.lang.Integer index;
    public N and() {
      return (N) KameletStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  public class PropertiesNestedImpl<N> extends io.fabric8.camelk.v1alpha1.KameletPropertyFluentImpl<io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<N>> implements io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
    PropertiesNestedImpl(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletProperty item) {
      this.index = index;
      this.builder = new io.fabric8.camelk.v1alpha1.KameletPropertyBuilder(this, item);
    }
    PropertiesNestedImpl() {
      this.index = -1;
      this.builder = new io.fabric8.camelk.v1alpha1.KameletPropertyBuilder(this);
    }
    io.fabric8.camelk.v1alpha1.KameletPropertyBuilder builder;
    java.lang.Integer index;
    public N and() {
      return (N) KameletStatusFluentImpl.this.setToProperties(index,builder.build());
    }
    public N endProperty() {
      return and();
    }
    
  }
  
}