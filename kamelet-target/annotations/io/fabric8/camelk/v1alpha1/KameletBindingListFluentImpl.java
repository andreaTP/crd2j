package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ListMeta;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public class KameletBindingListFluentImpl<A extends io.fabric8.camelk.v1alpha1.KameletBindingListFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.camelk.v1alpha1.KameletBindingListFluent<A>{
  public KameletBindingListFluentImpl() {
  }
  public KameletBindingListFluentImpl(io.fabric8.camelk.v1alpha1.KameletBindingList instance) {
    this.withApiVersion(instance.getApiVersion()); 
    this.withItems(instance.getItems()); 
    this.withKind(instance.getKind()); 
    this.withMetadata(instance.getMetadata()); 
  }
  private java.lang.String apiVersion;
  private java.util.List<io.fabric8.camelk.v1alpha1.KameletBindingBuilder> items;
  private java.lang.String kind;
  private io.fabric8.kubernetes.api.model.ListMeta metadata;
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
  public A addToItems(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletBinding item) {
    if (this.items == null) {this.items = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletBindingBuilder>();}
    io.fabric8.camelk.v1alpha1.KameletBindingBuilder builder = new io.fabric8.camelk.v1alpha1.KameletBindingBuilder(item);_visitables.get("items").add(index >= 0 ? index : _visitables.get("items").size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
  }
  public A setToItems(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletBinding item) {
    if (this.items == null) {this.items = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletBindingBuilder>();}
    io.fabric8.camelk.v1alpha1.KameletBindingBuilder builder = new io.fabric8.camelk.v1alpha1.KameletBindingBuilder(item);
    if (index < 0 || index >= _visitables.get("items").size()) { _visitables.get("items").add(builder); } else { _visitables.get("items").set(index, builder);}
    if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
     return (A)this;
  }
  public A addToItems(io.fabric8.camelk.v1alpha1.KameletBinding... items) {
    if (this.items == null) {this.items = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletBindingBuilder>();}
    for (io.fabric8.camelk.v1alpha1.KameletBinding item : items) {io.fabric8.camelk.v1alpha1.KameletBindingBuilder builder = new io.fabric8.camelk.v1alpha1.KameletBindingBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A addAllToItems(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletBinding> items) {
    if (this.items == null) {this.items = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletBindingBuilder>();}
    for (io.fabric8.camelk.v1alpha1.KameletBinding item : items) {io.fabric8.camelk.v1alpha1.KameletBindingBuilder builder = new io.fabric8.camelk.v1alpha1.KameletBindingBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A removeFromItems(io.fabric8.camelk.v1alpha1.KameletBinding... items) {
    for (io.fabric8.camelk.v1alpha1.KameletBinding item : items) {io.fabric8.camelk.v1alpha1.KameletBindingBuilder builder = new io.fabric8.camelk.v1alpha1.KameletBindingBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeAllFromItems(java.util.Collection<io.fabric8.camelk.v1alpha1.KameletBinding> items) {
    for (io.fabric8.camelk.v1alpha1.KameletBinding item : items) {io.fabric8.camelk.v1alpha1.KameletBindingBuilder builder = new io.fabric8.camelk.v1alpha1.KameletBindingBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromItems(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBindingBuilder> predicate) {
    if (items == null) return (A) this;
    final Iterator<io.fabric8.camelk.v1alpha1.KameletBindingBuilder> each = items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      io.fabric8.camelk.v1alpha1.KameletBindingBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletBinding> getItems() {
    return build(items);
  }
  public java.util.List<io.fabric8.camelk.v1alpha1.KameletBinding> buildItems() {
    return build(items);
  }
  public io.fabric8.camelk.v1alpha1.KameletBinding buildItem(java.lang.Integer index) {
    return this.items.get(index).build();
  }
  public io.fabric8.camelk.v1alpha1.KameletBinding buildFirstItem() {
    return this.items.get(0).build();
  }
  public io.fabric8.camelk.v1alpha1.KameletBinding buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  public io.fabric8.camelk.v1alpha1.KameletBinding buildMatchingItem(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBindingBuilder> predicate) {
    for (io.fabric8.camelk.v1alpha1.KameletBindingBuilder item: items) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBindingBuilder> predicate) {
    for (io.fabric8.camelk.v1alpha1.KameletBindingBuilder item: items) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withItems(java.util.List<io.fabric8.camelk.v1alpha1.KameletBinding> items) {
    if (this.items != null) { _visitables.get("items").removeAll(this.items);}
    if (items != null) {this.items = new java.util.ArrayList<io.fabric8.camelk.v1alpha1.KameletBindingBuilder>(); for (io.fabric8.camelk.v1alpha1.KameletBinding item : items){this.addToItems(item);}} else { this.items = null;} return (A) this;
  }
  public A withItems(io.fabric8.camelk.v1alpha1.KameletBinding... items) {
    if (this.items != null) {this.items.clear();}
    if (items != null) {for (io.fabric8.camelk.v1alpha1.KameletBinding item :items){ this.addToItems(item);}} return (A) this;
  }
  public java.lang.Boolean hasItems() {
    return items != null && !items.isEmpty();
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingListFluent.ItemsNested<A> addNewItem() {
    return new io.fabric8.camelk.v1alpha1.KameletBindingListFluentImpl.ItemsNestedImpl();
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingListFluent.ItemsNested<A> addNewItemLike(io.fabric8.camelk.v1alpha1.KameletBinding item) {
    return new io.fabric8.camelk.v1alpha1.KameletBindingListFluentImpl.ItemsNestedImpl(-1, item);
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingListFluent.ItemsNested<A> setNewItemLike(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletBinding item) {
    return new io.fabric8.camelk.v1alpha1.KameletBindingListFluentImpl.ItemsNestedImpl(index, item);
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingListFluent.ItemsNested<A> editItem(java.lang.Integer index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingListFluent.ItemsNested<A> editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingListFluent.ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }
  public io.fabric8.camelk.v1alpha1.KameletBindingListFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.fabric8.camelk.v1alpha1.KameletBindingBuilder> predicate) {
    int index = -1;
    for (int i=0;i<items.size();i++) { 
    if (predicate.test(items.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
    return setNewItemLike(index, buildItem(index));
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
  public io.fabric8.kubernetes.api.model.ListMeta getMetadata() {
    return this.metadata;
  }
  public A withMetadata(io.fabric8.kubernetes.api.model.ListMeta metadata) {
    this.metadata=metadata; return (A) this;
  }
  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }
  public A withNewMetadata(java.lang.String _continue,java.lang.Long remainingItemCount,java.lang.String resourceVersion,java.lang.String selfLink) {
    return (A)withMetadata(new ListMeta(_continue, remainingItemCount, resourceVersion, selfLink));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KameletBindingListFluentImpl that = (KameletBindingListFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (items != null ? !items.equals(that.items) :that.items != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  items,  kind,  metadata,  super.hashCode());
  }
  public class ItemsNestedImpl<N> extends io.fabric8.camelk.v1alpha1.KameletBindingFluentImpl<io.fabric8.camelk.v1alpha1.KameletBindingListFluent.ItemsNested<N>> implements io.fabric8.camelk.v1alpha1.KameletBindingListFluent.ItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
    ItemsNestedImpl(java.lang.Integer index,io.fabric8.camelk.v1alpha1.KameletBinding item) {
      this.index = index;
      this.builder = new io.fabric8.camelk.v1alpha1.KameletBindingBuilder(this, item);
    }
    ItemsNestedImpl() {
      this.index = -1;
      this.builder = new io.fabric8.camelk.v1alpha1.KameletBindingBuilder(this);
    }
    io.fabric8.camelk.v1alpha1.KameletBindingBuilder builder;
    java.lang.Integer index;
    public N and() {
      return (N) KameletBindingListFluentImpl.this.setToItems(index,builder.build());
    }
    public N endItem() {
      return and();
    }
    
  }
  
}