package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public class KameletBindingStatusFluentImpl<A extends io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent<A>{
  public KameletBindingStatusFluentImpl() {
  }
  public KameletBindingStatusFluentImpl(io.fabric8.camelk.v1alpha1.KameletBindingStatus instance) {
    this.withConditions(instance.getConditions()); 
    this.withPhase(instance.getPhase()); 
  }
  private java.util.List<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder> conditions;
  private java.lang.String phase;
  public A addToConditions(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletBindingCondition item) {
    if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder>();}
    io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder builder = new io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletBindingCondition item) {
    if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder>();}
    io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder builder = new io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.fabric8.camelk.v1alpha1.KameletBindingCondition... items) {
    if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder>();}
    for (io.fabric8.camelk.v1alpha1.KameletBindingCondition item : items) {io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder builder = new io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletBindingCondition> items) {
    if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder>();}
    for (io.fabric8.camelk.v1alpha1.KameletBindingCondition item : items) {io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder builder = new io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.fabric8.camelk.v1alpha1.KameletBindingCondition... items) {
    for (io.fabric8.camelk.v1alpha1.KameletBindingCondition item : items) {io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder builder = new io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletBindingCondition> items) {
    for (io.fabric8.camelk.v1alpha1.KameletBindingCondition item : items) {io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder builder = new io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder builder = each.next();
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
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletBindingCondition> getConditions() {
    return build(conditions);
  }
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletBindingCondition> buildConditions() {
    return build(conditions);
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingCondition buildCondition(java.lang.Integer index) {
    return this.conditions.get(index).build();
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingCondition buildMatchingCondition(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder> predicate) {
    for (io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder> predicate) {
    for (io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(java.util.List<io.fabric8.camelk.v1alpha1.KameletBindingCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder>(); for (io.fabric8.camelk.v1alpha1.KameletBindingCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.fabric8.camelk.v1alpha1.KameletBindingCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (io.fabric8.camelk.v1alpha1.KameletBindingCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public java.lang.Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> addNewCondition() {
    return new io.fabric8.camelk.v1alpha1.KameletBindingStatusFluentImpl.ConditionsNestedImpl();
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> addNewConditionLike(io.fabric8.camelk.v1alpha1.KameletBindingCondition item) {
    return new io.fabric8.camelk.v1alpha1.KameletBindingStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletBindingCondition item) {
    return new io.fabric8.camelk.v1alpha1.KameletBindingStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder> predicate) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KameletBindingStatusFluentImpl that = (KameletBindingStatusFluentImpl) o;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(conditions,  phase,  super.hashCode());
  }
  public class ConditionsNestedImpl<N> extends io.fabric8.camelk.v1alpha1.KameletBindingConditionFluentImpl<io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<N>> implements io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
    ConditionsNestedImpl(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletBindingCondition item) {
      this.index = index;
      this.builder = new io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder(this);
    }
    io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder builder;
    java.lang.Integer index;
    public N and() {
      return (N) KameletBindingStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  
}