package org.crd2j;

// TODO: automate this by re-using compiled code (maven plugins tests maybe?)
// Manually checking that the encoding for unknown fields actually works as expected
// Example generated code for preserve-properties
class TestPreservedFields {
    @com.fasterxml.jackson.annotation.JsonIgnore()
    @com.fasterxml.jackson.annotation.JsonAnyGetter()
    @com.fasterxml.jackson.annotation.JsonAnySetter()
    private java.util.Map<String, Object> properties = new java.util.HashMap<String, Object>();

    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(java.util.Map<String, Object> properties) {
        this.properties = properties;
    }
}
