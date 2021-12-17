package io.fabric8.camelk.v1alpha1;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class AuthorizationSpecBuilder extends io.fabric8.camelk.v1alpha1.AuthorizationSpecFluentImpl<io.fabric8.camelk.v1alpha1.AuthorizationSpecBuilder> implements io.fabric8.kubernetes.api.builder.VisitableBuilder<io.fabric8.camelk.v1alpha1.AuthorizationSpec,io.fabric8.camelk.v1alpha1.AuthorizationSpecBuilder>{
  public AuthorizationSpecBuilder() {
    this(false);
  }
  public AuthorizationSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new AuthorizationSpec(), validationEnabled);
  }
  public AuthorizationSpecBuilder(io.fabric8.camelk.v1alpha1.AuthorizationSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public AuthorizationSpecBuilder(io.fabric8.camelk.v1alpha1.AuthorizationSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new AuthorizationSpec(), validationEnabled);
  }
  public AuthorizationSpecBuilder(io.fabric8.camelk.v1alpha1.AuthorizationSpecFluent<?> fluent,io.fabric8.camelk.v1alpha1.AuthorizationSpec instance) {
    this(fluent, instance, false);
  }
  public AuthorizationSpecBuilder(io.fabric8.camelk.v1alpha1.AuthorizationSpecFluent<?> fluent,io.fabric8.camelk.v1alpha1.AuthorizationSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    this.validationEnabled = validationEnabled; 
  }
  public AuthorizationSpecBuilder(io.fabric8.camelk.v1alpha1.AuthorizationSpec instance) {
    this(instance,false);
  }
  public AuthorizationSpecBuilder(io.fabric8.camelk.v1alpha1.AuthorizationSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.validationEnabled = validationEnabled; 
  }
  io.fabric8.camelk.v1alpha1.AuthorizationSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.fabric8.camelk.v1alpha1.AuthorizationSpec build() {
    AuthorizationSpec buildable = new AuthorizationSpec();
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    AuthorizationSpecBuilder that = (AuthorizationSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}