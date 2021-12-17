package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
public interface KameletStatusFluent<A extends io.fabric8.camelk.v1alpha1.KameletStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.Fluent<A>{
  public A addToConditions(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletCondition item);
  public A setToConditions(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletCondition item);
  public A addToConditions(io.fabric8.camelk.v1alpha1.KameletCondition... items);
  public A addAllToConditions(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletCondition> items);
  public A removeFromConditions(io.fabric8.camelk.v1alpha1.KameletCondition... items);
  public A removeAllFromConditions(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletCondition> items);
  public A removeMatchingFromConditions(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletCondition> getConditions();
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletCondition> buildConditions();
  public io.fabric8.camelk.v1alpha1.KameletCondition buildCondition(java.lang.Integer index);
  public io.fabric8.camelk.v1alpha1.KameletCondition buildFirstCondition();
  public io.fabric8.camelk.v1alpha1.KameletCondition buildLastCondition();
  public io.fabric8.camelk.v1alpha1.KameletCondition buildMatchingCondition(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletConditionBuilder> predicate);
  public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletConditionBuilder> predicate);
  public A withConditions(java.util.List<io.fabric8.camelk.v1alpha1.KameletCondition> conditions);
  public A withConditions(io.fabric8.camelk.v1alpha1.KameletCondition... conditions);
  public java.lang.Boolean hasConditions();
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> addNewCondition();
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> addNewConditionLike(io.fabric8.camelk.v1alpha1.KameletCondition item);
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletCondition item);
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index);
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> editFirstCondition();
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> editLastCondition();
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletConditionBuilder> predicate);
  public java.lang.String getPhase();
  public A withPhase(java.lang.String phase);
  public java.lang.Boolean hasPhase();
  
  /**
   * Method is deprecated. use withPhase instead.
   */
  @java.lang.Deprecated
  public A withNewPhase(java.lang.String arg0);
  public A addToProperties(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletProperty item);
  public A setToProperties(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletProperty item);
  public A addToProperties(io.fabric8.camelk.v1alpha1.KameletProperty... items);
  public A addAllToProperties(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletProperty> items);
  public A removeFromProperties(io.fabric8.camelk.v1alpha1.KameletProperty... items);
  public A removeAllFromProperties(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletProperty> items);
  public A removeMatchingFromProperties(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildProperties instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletProperty> getProperties();
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletProperty> buildProperties();
  public io.fabric8.camelk.v1alpha1.KameletProperty buildProperty(java.lang.Integer index);
  public io.fabric8.camelk.v1alpha1.KameletProperty buildFirstProperty();
  public io.fabric8.camelk.v1alpha1.KameletProperty buildLastProperty();
  public io.fabric8.camelk.v1alpha1.KameletProperty buildMatchingProperty(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder> predicate);
  public java.lang.Boolean hasMatchingProperty(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder> predicate);
  public A withProperties(java.util.List<io.fabric8.camelk.v1alpha1.KameletProperty> properties);
  public A withProperties(io.fabric8.camelk.v1alpha1.KameletProperty... properties);
  public java.lang.Boolean hasProperties();
  public A addNewProperty(java.lang.String _default,java.lang.String name);
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> addNewProperty();
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> addNewPropertyLike(io.fabric8.camelk.v1alpha1.KameletProperty item);
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> setNewPropertyLike(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletProperty item);
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> editProperty(java.lang.Integer index);
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> editFirstProperty();
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> editLastProperty();
  public io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<A> editMatchingProperty(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletPropertyBuilder> predicate);
  public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.camelk.v1alpha1.KameletConditionFluent<io.fabric8.camelk.v1alpha1.KameletStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  public interface PropertiesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.camelk.v1alpha1.KameletPropertyFluent<io.fabric8.camelk.v1alpha1.KameletStatusFluent.PropertiesNested<N>>{
    public N and();
    public N endProperty();
    
  }
  
}