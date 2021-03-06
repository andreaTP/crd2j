package org.crd2j;

public class TestPreservedFields {

    @com.fasterxml.jackson.annotation.JsonAnyGetter()
    @com.fasterxml.jackson.annotation.JsonAnySetter()
    private java.util.Map<String, Object> properties = new java.util.HashMap<String, Object>();

    @com.fasterxml.jackson.annotation.JsonIgnore()
    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty()
    public void setProperties(java.util.Map<String, Object> properties) {
        this.properties = properties;
    }
}
