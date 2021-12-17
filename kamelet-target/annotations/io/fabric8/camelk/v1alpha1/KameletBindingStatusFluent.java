package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface KameletBindingStatusFluent<A extends io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.Fluent<A>{
  public A addToConditions(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletBindingCondition item);
  public A setToConditions(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletBindingCondition item);
  public A addToConditions(io.fabric8.camelk.v1alpha1.KameletBindingCondition... items);
  public A addAllToConditions(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletBindingCondition> items);
  public A removeFromConditions(io.fabric8.camelk.v1alpha1.KameletBindingCondition... items);
  public A removeAllFromConditions(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletBindingCondition> items);
  public A removeMatchingFromConditions(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletBindingCondition> getConditions();
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletBindingCondition> buildConditions();
  public io.fabric8.camelk.v1alpha1.KameletBindingCondition buildCondition(java.lang.Integer index);
  public io.fabric8.camelk.v1alpha1.KameletBindingCondition buildFirstCondition();
  public io.fabric8.camelk.v1alpha1.KameletBindingCondition buildLastCondition();
  public io.fabric8.camelk.v1alpha1.KameletBindingCondition buildMatchingCondition(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder> predicate);
  public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder> predicate);
  public A withConditions(java.util.List<io.fabric8.camelk.v1alpha1.KameletBindingCondition> conditions);
  public A withConditions(io.fabric8.camelk.v1alpha1.KameletBindingCondition... conditions);
  public java.lang.Boolean hasConditions();
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> addNewCondition();
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> addNewConditionLike(io.fabric8.camelk.v1alpha1.KameletBindingCondition item);
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletBindingCondition item);
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index);
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> editFirstCondition();
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> editLastCondition();
  public io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBindingConditionBuilder> predicate);
  public java.lang.String getPhase();
  public A withPhase(java.lang.String phase);
  public java.lang.Boolean hasPhase();
  
  /**
   * Method is deprecated. use withPhase instead.
   */
  @java.lang.Deprecated
  public A withNewPhase(java.lang.String arg0);
  public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.camelk.v1alpha1.KameletBindingConditionFluent<io.fabric8.camelk.v1alpha1.KameletBindingStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}