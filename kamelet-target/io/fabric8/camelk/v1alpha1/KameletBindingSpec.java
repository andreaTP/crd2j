
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
import io.fabric8.camelk.v1.IntegrationSpec;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
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
    "integration",
    "sink",
    "source"
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
public class KameletBindingSpec implements KubernetesResource
{

    @JsonProperty("integration")
    private IntegrationSpec integration;
    @JsonProperty("sink")
    private Endpoint sink;
    @JsonProperty("source")
    private Endpoint source;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public KameletBindingSpec() {
    }

    /**
     * 
     * @param sink
     * @param integration
     * @param source
     */
    public KameletBindingSpec(IntegrationSpec integration, Endpoint sink, Endpoint source) {
        super();
        this.integration = integration;
        this.sink = sink;
        this.source = source;
    }

    @JsonProperty("integration")
    public IntegrationSpec getIntegration() {
        return integration;
    }

    @JsonProperty("integration")
    public void setIntegration(IntegrationSpec integration) {
        this.integration = integration;
    }

    @JsonProperty("sink")
    public Endpoint getSink() {
        return sink;
    }

    @JsonProperty("sink")
    public void setSink(Endpoint sink) {
        this.sink = sink;
    }

    @JsonProperty("source")
    public Endpoint getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Endpoint source) {
        this.source = source;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
