package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class KameletBindingListBuilder extends io.fabric8.camelk.v1alpha1.KameletBindingListFluentImpl<io.fabric8.camelk.v1alpha1.KameletBindingListBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.KameletBindingList,io.fabric8.camelk.v1alpha1.KameletBindingListBuilder>{
  public KameletBindingListBuilder() {
    this(false);
  }
  public KameletBindingListBuilder(java.lang.Boolean validationEnabled) {
    this(new KameletBindingList(), validationEnabled);
  }
  public KameletBindingListBuilder(io.fabric8.camelk.v1alpha1.KameletBindingListFluent<?> fluent) {
    this(fluent, false);
  }
  public KameletBindingListBuilder(io.fabric8.camelk.v1alpha1.KameletBindingListFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new KameletBindingList(), validationEnabled);
  }
  public KameletBindingListBuilder(io.fabric8.camelk.v1alpha1.KameletBindingListFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletBindingList instance) {
    this(fluent, instance, false);
  }
  public KameletBindingListBuilder(io.fabric8.camelk.v1alpha1.KameletBindingListFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletBindingList instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion()); 
    fluent.withItems(instance.getItems()); 
    fluent.withKind(instance.getKind()); 
    fluent.withMetadata(instance.getMetadata()); 
    this.validationEnabled = validationEnabled; 
  }
  public KameletBindingListBuilder(io.fabric8.camelk.v1alpha1.KameletBindingList instance) {
    this(instance,false);
  }
  public KameletBindingListBuilder(io.fabric8.camelk.v1alpha1.KameletBindingList instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion()); 
    this.withItems(instance.getItems()); 
    this.withKind(instance.getKind()); 
    this.withMetadata(instance.getMetadata()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.KameletBindingListFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.KameletBindingList build() {
    KameletBindingList buildable = new KameletBindingList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletBindingListBuilder that = (KameletBindingListBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}