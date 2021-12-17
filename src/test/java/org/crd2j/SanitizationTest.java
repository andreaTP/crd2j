package org.crd2j;

import static org.assertj.core.api.Assertions.assertThat;

import org.crd2j.ast.JSONSchema2Pojo;
import org.junit.jupiter.api.Test;

public class SanitizationTest {

    @Test
    void shouldRemoveDashes() {
        // Arrange
        var str = "property-name";

        // Act
        var res = JSONSchema2Pojo.sanitizeString(str);

        // Assert
        assertThat(JSONSchema2Pojo.sanitizeString(str)).isEqualTo("propertyName");
    }

    @Test
    void shouldRemoveTrailingDashes() {
        // Arrange
        var str = "property-name-";

        // Act
        var res = JSONSchema2Pojo.sanitizeString(str);

        // Assert
        assertThat(JSONSchema2Pojo.sanitizeString(str)).isEqualTo("propertyName");
    }
}
