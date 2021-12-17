
package io.fabric8.camelk.v1alpha1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.camelk.v1.SourceSpec;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "authorization",
    "definition",
    "dependencies",
    "flow",
    "sources",
    "types"
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
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
public class KameletSpec implements KubernetesResource
{

    @JsonProperty("authorization")
    private AuthorizationSpec authorization;
    @JsonProperty("definition")
    private JSONSchemaProps definition;
    @JsonProperty("dependencies")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<java.lang.String> dependencies = new ArrayList<java.lang.String>();
    @JsonProperty("flow")
    private JsonNode flow;
    @JsonProperty("sources")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<SourceSpec> sources = new ArrayList<SourceSpec>();
    @JsonProperty("types")
    private Map<String, EventTypeSpec> types;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public KameletSpec() {
    }

    /**
     * 
     * @param authorization
     * @param types
     * @param sources
     * @param definition
     * @param flow
     * @param dependencies
     */
    public KameletSpec(AuthorizationSpec authorization, JSONSchemaProps definition, List<java.lang.String> dependencies, JsonNode flow, List<SourceSpec> sources, Map<String, EventTypeSpec> types) {
        super();
        this.authorization = authorization;
        this.definition = definition;
        this.dependencies = dependencies;
        this.flow = flow;
        this.sources = sources;
        this.types = types;
    }

    @JsonProperty("authorization")
    public AuthorizationSpec getAuthorization() {
        return authorization;
    }

    @JsonProperty("authorization")
    public void setAuthorization(AuthorizationSpec authorization) {
        this.authorization = authorization;
    }

    @JsonProperty("definition")
    public JSONSchemaProps getDefinition() {
        return definition;
    }

    @JsonProperty("definition")
    public void setDefinition(JSONSchemaProps definition) {
        this.definition = definition;
    }

    @JsonProperty("dependencies")
    public List<java.lang.String> getDependencies() {
        return dependencies;
    }

    @JsonProperty("dependencies")
    public void setDependencies(List<java.lang.String> dependencies) {
        this.dependencies = dependencies;
    }

    @JsonProperty("flow")
    public JsonNode getFlow() {
        return flow;
    }

    @JsonProperty("flow")
    public void setFlow(JsonNode flow) {
        this.flow = flow;
    }

    @JsonProperty("sources")
    public List<SourceSpec> getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(List<SourceSpec> sources) {
        this.sources = sources;
    }

    @JsonProperty("types")
    public Map<String, EventTypeSpec> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(Map<String, EventTypeSpec> types) {
        this.types = types;
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
