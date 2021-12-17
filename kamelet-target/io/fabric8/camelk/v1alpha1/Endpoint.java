
package io.fabric8.camelk.v1alpha1;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "properties",
    "ref",
    "types",
    "uri"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
public class Endpoint implements KubernetesResource
{

    @JsonProperty("properties")
    private EndpointProperties properties;
    @JsonProperty("ref")
    private io.fabric8.kubernetes.api.model.ObjectReference ref;
    @JsonProperty("types")
    private Map<String, EventTypeSpec> types;
    @JsonProperty("uri")
    private String uri;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Endpoint() {
    }

    /**
     * 
     * @param ref
     * @param types
     * @param uri
     * @param properties
     */
    public Endpoint(EndpointProperties properties, io.fabric8.kubernetes.api.model.ObjectReference ref, Map<String, EventTypeSpec> types, String uri) {
        super();
        this.properties = properties;
        this.ref = ref;
        this.types = types;
        this.uri = uri;
    }

    @JsonProperty("properties")
    public EndpointProperties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(EndpointProperties properties) {
        this.properties = properties;
    }

    @JsonProperty("ref")
    public io.fabric8.kubernetes.api.model.ObjectReference getRef() {
        return ref;
    }

    @JsonProperty("ref")
    public void setRef(io.fabric8.kubernetes.api.model.ObjectReference ref) {
        this.ref = ref;
    }

    @JsonProperty("types")
    public Map<String, EventTypeSpec> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(Map<String, EventTypeSpec> types) {
        this.types = types;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
