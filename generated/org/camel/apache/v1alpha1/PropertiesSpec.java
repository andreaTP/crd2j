package org.camel.apache.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"default","enum","exclusiveMaximum","exclusiveMinimum","format","id","maxItems","maxLength","maxProperties","maximum","minItems","minLength","minProperties","minimum","multipleOf","nullable","pattern","title","type","uniqueItems","x-descriptors"})
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
public class PropertiesSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("multipleOf")
    private String multipleOf;

    public String getMultipleOf() {
        return multipleOf;
    }

    public void setMultipleOf(String multipleOf) {
        this.multipleOf = multipleOf;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maxItems")
    private Long maxItems;

    public Long getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(Long maxItems) {
        this.maxItems = maxItems;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nullable")
    private Boolean nullable;

    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("minLength")
    private Long minLength;

    public Long getMinLength() {
        return minLength;
    }

    public void setMinLength(Long minLength) {
        this.minLength = minLength;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
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

    @com.fasterxml.jackson.annotation.JsonProperty("_enum")
    private java.util.List<EnumSpec> _enum;

    public java.util.List<EnumSpec> get_enum() {
        return _enum;
    }

    public void set_enum(java.util.List<EnumSpec> _enum) {
        this._enum = _enum;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("minProperties")
    private Long minProperties;

    public Long getMinProperties() {
        return minProperties;
    }

    public void setMinProperties(Long minProperties) {
        this.minProperties = minProperties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exclusiveMaximum")
    private Boolean exclusiveMaximum;

    public Boolean getExclusiveMaximum() {
        return exclusiveMaximum;
    }

    public void setExclusiveMaximum(Boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("minItems")
    private Long minItems;

    public Long getMinItems() {
        return minItems;
    }

    public void setMinItems(Long minItems) {
        this.minItems = minItems;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("_default")
    private DefaultSpec _default;

    public DefaultSpec get_default() {
        return _default;
    }

    public void set_default(DefaultSpec _default) {
        this._default = _default;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("xDescriptors")
    private java.util.List<String> xDescriptors;

    public java.util.List<String> getXDescriptors() {
        return xDescriptors;
    }

    public void setXDescriptors(java.util.List<String> xDescriptors) {
        this.xDescriptors = xDescriptors;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("uniqueItems")
    private Boolean uniqueItems;

    public Boolean getUniqueItems() {
        return uniqueItems;
    }

    public void setUniqueItems(Boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maximum")
    private String maximum;

    public String getMaximum() {
        return maximum;
    }

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maxProperties")
    private Long maxProperties;

    public Long getMaxProperties() {
        return maxProperties;
    }

    public void setMaxProperties(Long maxProperties) {
        this.maxProperties = maxProperties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exclusiveMinimum")
    private Boolean exclusiveMinimum;

    public Boolean getExclusiveMinimum() {
        return exclusiveMinimum;
    }

    public void setExclusiveMinimum(Boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("minimum")
    private String minimum;

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
    private Long maxLength;

    public Long getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
    }
}
