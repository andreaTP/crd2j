package org.camel.apache.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"$schema","externalDocs","id","properties","required","title","type"})
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
public class DefinitionSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("$schema")
    private String $schema;

    public String get$schema() {
        return $schema;
    }

    public void set$schema(String $schema) {
        this.$schema = $schema;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("externalDocs")
    private ExternalDocsSpec externalDocs;

    public ExternalDocsSpec getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(ExternalDocsSpec externalDocs) {
        this.externalDocs = externalDocs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private PropertiesSpec properties;

    public PropertiesSpec getProperties() {
        return properties;
    }

    public void setProperties(PropertiesSpec properties) {
        this.properties = properties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("required")
    private java.util.List<String> required;

    public java.util.List<String> getRequired() {
        return required;
    }

    public void setRequired(java.util.List<String> required) {
        this.required = required;
    }
}
