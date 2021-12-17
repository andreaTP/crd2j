package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ListMeta;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface KameletListFluent<A extends io.fabric8.camelk.v1alpha1.KameletListFluent<A>> extends io.fabric8.kubernetes.api.builder.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0);
  public A addToItems(java.lang.Integer index,io.fabric8.camelk.v1alpha1.Kamelet item);
  public A setToItems(java.lang.Integer index,io.fabric8.camelk.v1alpha1.Kamelet item);
  public A addToItems(io.fabric8.camelk.v1alpha1.Kamelet... items);
  public A addAllToItems(java.util.Collection<io.fabric8.camelk.v1alpha1.Kamelet> items);
  public A removeFromItems(io.fabric8.camelk.v1alpha1.Kamelet... items);
  public A removeAllFromItems(java.util.Collection<io.fabric8.camelk.v1alpha1.Kamelet> items);
  public A removeMatchingFromItems(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.fabric8.camelk.v1alpha1.Kamelet> getItems();
  public java.util.List<io.fabric8.camelk.v1alpha1.Kamelet> buildItems();
  public io.fabric8.camelk.v1alpha1.Kamelet buildItem(java.lang.Integer index);
  public io.fabric8.camelk.v1alpha1.Kamelet buildFirstItem();
  public io.fabric8.camelk.v1alpha1.Kamelet buildLastItem();
  public io.fabric8.camelk.v1alpha1.Kamelet buildMatchingItem(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBuilder> predicate);
  public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBuilder> predicate);
  public A withItems(java.util.List<io.fabric8.camelk.v1alpha1.Kamelet> items);
  public A withItems(io.fabric8.camelk.v1alpha1.Kamelet... items);
  public java.lang.Boolean hasItems();
  public io.fabric8.camelk.v1alpha1.KameletListFluent.ItemsNested<A> addNewItem();
  public io.fabric8.camelk.v1alpha1.KameletListFluent.ItemsNested<A> addNewItemLike(io.fabric8.camelk.v1alpha1.Kamelet item);
  public io.fabric8.camelk.v1alpha1.KameletListFluent.ItemsNested<A> setNewItemLike(java.lang.Integer index,io.fabric8.camelk.v1alpha1.Kamelet item);
  public io.fabric8.camelk.v1alpha1.KameletListFluent.ItemsNested<A> editItem(java.lang.Integer index);
  public io.fabric8.camelk.v1alpha1.KameletListFluent.ItemsNested<A> editFirstItem();
  public io.fabric8.camelk.v1alpha1.KameletListFluent.ItemsNested<A> editLastItem();
  public io.fabric8.camelk.v1alpha1.KameletListFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBuilder> predicate);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0);
  public io.fabric8.kubernetes.api.model.ListMeta getMetadata();
  public A withMetadata(io.fabric8.kubernetes.api.model.ListMeta metadata);
  public java.lang.Boolean hasMetadata();
  public A withNewMetadata(java.lang.String _continue,java.lang.Long remainingItemCount,java.lang.String resourceVersion,java.lang.String selfLink);
  public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.camelk.v1alpha1.KameletFluent<io.fabric8.camelk.v1alpha1.KameletListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  
}