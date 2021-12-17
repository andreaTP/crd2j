package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class KameletListBuilder extends io.fabric8.camelk.v1alpha1.KameletListFluentImpl<io.fabric8.camelk.v1alpha1.KameletListBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.KameletList,io.fabric8.camelk.v1alpha1.KameletListBuilder>{
  public KameletListBuilder() {
    this(false);
  }
  public KameletListBuilder(java.lang.Boolean validationEnabled) {
    this(new KameletList(), validationEnabled);
  }
  public KameletListBuilder(io.fabric8.camelk.v1alpha1.KameletListFluent<?> fluent) {
    this(fluent, false);
  }
  public KameletListBuilder(io.fabric8.camelk.v1alpha1.KameletListFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new KameletList(), validationEnabled);
  }
  public KameletListBuilder(io.fabric8.camelk.v1alpha1.KameletListFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletList instance) {
    this(fluent, instance, false);
  }
  public KameletListBuilder(io.fabric8.camelk.v1alpha1.KameletListFluent<?> fluent,io.fabric8.camelk.v1alpha1.KameletList instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion()); 
    fluent.withItems(instance.getItems()); 
    fluent.withKind(instance.getKind()); 
    fluent.withMetadata(instance.getMetadata()); 
    this.validationEnabled = validationEnabled; 
  }
  public KameletListBuilder(io.fabric8.camelk.v1alpha1.KameletList instance) {
    this(instance,false);
  }
  public KameletListBuilder(io.fabric8.camelk.v1alpha1.KameletList instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion()); 
    this.withItems(instance.getItems()); 
    this.withKind(instance.getKind()); 
    this.withMetadata(instance.getMetadata()); 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.KameletListFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.KameletList build() {
    KameletList buildable = new KameletList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    KameletListBuilder that = (KameletListBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}