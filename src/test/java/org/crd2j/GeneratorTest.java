package org.crd2j;

import com.github.javaparser.ast.CompilationUnit;
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps;
import org.crd2j.ast.JArray;
import org.crd2j.ast.JCRObject;
import org.crd2j.ast.JObject;
import org.crd2j.ast.JPrimitive;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratorTest {

    @Test
    void testCR() {
        // Arrange
        var cu = new CompilationUnit();
        var cro = new JCRObject("t", "g", "v");

        // Act
        var res = cro.generateJava(cu);

        // Assert
        assertThat(res).containsOnly("t");
        assertThat(cu.getClassByName("t").isPresent()).isTrue();
    }

    @Test
    void testPrimitive() {
        // Arrange
        var primitive = new JPrimitive("test");

        // Act
        var res = primitive.generateJava(new CompilationUnit());

        // Assert
        assertThat(primitive.getType()).isEqualTo("test");
        assertThat(res).isEmpty();
    }

    @Test
    void testArrayOfPrimitives() {
        // Arrange
        var array = new JArray(new JPrimitive("primitive"));

        // Act
        var res = array.generateJava(new CompilationUnit());

        // Assert
        assertThat(array.getType()).isEqualTo("java.util.List<primitive>");
        assertThat(res).isEmpty();
    }

    @Test
    void testEmptyObject() {
        // Arrange
        var obj = new JObject("t", null, false);

        // Act
        var res = obj.generateJava(new CompilationUnit());

        // Assert
        assertThat(obj.getType()).isEqualTo("T");
        assertThat(res).containsOnly("T");
    }

    @Test
    void testObjectOfPrimitives() {
        // Arrange
        var cu = new CompilationUnit();
        var props = new HashMap<String, JSONSchemaProps>();
        var newBool = new JSONSchemaProps();
        newBool.setType("boolean");
        props.put("o1", newBool);
        var obj = new JObject("t", props, false);

        // Act
        var res = obj.generateJava(cu);

        // Assert
        assertThat(obj.getType()).isEqualTo("T");
        assertThat(res).containsOnly("T");

        var clz = cu.getClassByName("T");
        assertThat(clz).isPresent();
        assertThat(clz.get().getFields().size()).isEqualTo(1);
        assertThat(clz.get().getFieldByName("o1")).isPresent();
    }

    @Test
    void testArrayOfObjects() {
        // Arrange
        var array = new JArray(new JObject("t", null, false));

        // Act
        var res = array.generateJava(new CompilationUnit());

        // Assert
        assertThat(array.getType()).isEqualTo("java.util.List<T>");
        assertThat(res).containsOnly("T");
    }

    @Test
    void testObjectOfObjects() {
        // Arrange
        var cu = new CompilationUnit();
        var props = new HashMap<String, JSONSchemaProps>();
        var newObj = new JSONSchemaProps();
        newObj.setType("object");
        props.put("o1", newObj);
        var obj = new JObject("t", props, false);

        // Act
        var res = obj.generateJava(cu);

        // Assert
        assertThat(res).containsExactlyInAnyOrder("T", "O1");

        var clzT = cu.getClassByName("T");
        assertThat(clzT).isPresent();
        var clzO1 = cu.getClassByName("O1");
        assertThat(clzO1).isPresent();
        assertThat(clzT.get().getFields().size()).isEqualTo(1);
        assertThat(clzT.get().getFieldByName("o1")).isPresent();
    }

//    @Test
//    void testObjectWithPreservedFields() {
//        // Arrange
//        var cu = new CompilationUnit();
//        var obj = new JObject("t", null, true);
//
//        // Act
//        var res = obj.generateJava(cu);
//
//        // Assert
//        assertThat(res).containsExactly("T");
//
//        var clzT = cu.getClassByName("T");
//        assertThat(clzT).isPresent();
//        assertThat(clzT.get().getExtendedTypes().size()).isEqualTo(1);
//        assertThat(clzT.get().getExtendedTypes().get(0).getName().asString()).isEqualTo("ObjectNode");
//    }

}
