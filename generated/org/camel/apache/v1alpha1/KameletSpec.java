package org.camel.apache.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authorization","definition","dependencies","flow","sources","template","types"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@lombok.Setter()
@lombok.experimental.Accessors(prefix = {
    "_",
    ""
})
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class KameletSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("authorization")
    private AuthorizationSpec authorization;

    public AuthorizationSpec getAuthorization() {
        return authorization;
    }

    public void setAuthorization(AuthorizationSpec authorization) {
        this.authorization = authorization;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("template")
    private TemplateSpec template;

    public TemplateSpec getTemplate() {
        return template;
    }

    public void setTemplate(TemplateSpec template) {
        this.template = template;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("types")
    private TypesSpec types;

    public TypesSpec getTypes() {
        return types;
    }

    public void setTypes(TypesSpec types) {
        this.types = types;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private java.util.List<SourcesSpec> sources;

    public java.util.List<SourcesSpec> getSources() {
        return sources;
    }

    public void setSources(java.util.List<SourcesSpec> sources) {
        this.sources = sources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    private DefinitionSpec definition;

    public DefinitionSpec getDefinition() {
        return definition;
    }

    public void setDefinition(DefinitionSpec definition) {
        this.definition = definition;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("flow")
    private FlowSpec flow;

    public FlowSpec getFlow() {
        return flow;
    }

    public void setFlow(FlowSpec flow) {
        this.flow = flow;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    private java.util.List<String> dependencies;

    public java.util.List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(java.util.List<String> dependencies) {
        this.dependencies = dependencies;
    }
}
