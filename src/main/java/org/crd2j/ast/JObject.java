package org.crd2j.ast;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JObject implements JSONSchema2Pojo {

    private String type = null;
    private Map<String, JSONSchema2Pojo> fields = new HashMap<>();

    public JObject(String type, Map<String, JSONSchemaProps> fields) {
        this.type = type.substring(0, 1).toUpperCase() + type.substring(1);

        if (fields == null) {
            // no fields ???
        } else {
            for (var field : fields.entrySet()) {
                this.fields.put(
                        field.getKey(),
                        JSONSchema2Pojo.fromJsonSchema(field.getKey(), field.getValue()));
            }
        }
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public List<String> generateJava(CompilationUnit cu) {
        var clz = cu.getClassByName(this.type).orElse(cu.addClass(this.type));

        var buffer = new ArrayList<String>(this.fields.size() + 1);
        for (var k : this.fields.keySet()) {
            var prop = this.fields.get(k);
            buffer.addAll(prop.generateJava(cu));

            if (!clz.getFieldByName(k).isPresent()) {
                var objField = clz.addField(prop.getType(), k, Modifier.Keyword.PRIVATE);
                objField.createGetter();
                objField.createSetter();
            } else {
                // Warning ???
            }
        }
        buffer.add(this.type);

        return buffer;
    }
}

