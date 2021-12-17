package org.crd2j;

import static com.google.testing.compile.Compiler.javac;
import static org.assertj.core.api.Assertions.assertThat;

import com.google.testing.compile.Compilation;
import com.google.testing.compile.JavaFileObjects;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import javax.tools.JavaFileObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;

public class CompilationTest {

    private static TemporaryFolder tmpFolder = TemporaryFolder.builder().assureDeletion().build();

    CRGeneratorRunner runner = new CRGeneratorRunner();

    List<JavaFileObject> getSources(File basePath) throws IOException {
        var sources = new ArrayList<JavaFileObject>();
        for (var f : Files.list(basePath.toPath()).toList()) {
            if (f.toFile().isDirectory()) {
                sources.addAll(getSources(f.toFile()));
            } else {
                sources.add(JavaFileObjects.forResource(f.toUri().toURL()));
            }
        }

        return sources;
    }

    @BeforeAll
    public static void beforeAll() throws IOException {
        tmpFolder.create();
    }

    @Test
    void testCrontabCRDCompiles() throws Exception {
        // Arrange
        var crd =
                Path.of(this.getClass().getClassLoader().getResource("crontab-crd.yml").toURI())
                        .toFile();
        var dest = tmpFolder.newFolder("crontab");

        // Act
        runner.run(crd, dest);
        var compilation = javac().compile(getSources(dest));

        // Assert
        assertThat(compilation.errors()).isEmpty();
//        assertThat(compilation.sourceFiles().size()).isEqualTo(3);
        assertThat(compilation.status()).isEqualTo(Compilation.Status.SUCCESS);
    }

    @Test
    void testAkkaMicroserviceCRDCompiles() throws Exception {
        // Arrange
        var crd =
                Path.of(this.getClass().getClassLoader().getResource("keycloak-crd.yml").toURI())
                        .toFile();
        var dest = tmpFolder.newFolder("keycloak");

        // Act
        runner.run(crd, dest);
        var compilation = javac().compile(getSources(dest));

        // Assert
        assertThat(compilation.errors()).isEmpty();
//        assertThat(compilation.sourceFiles().size()).isEqualTo(35);
        assertThat(compilation.status()).isEqualTo(Compilation.Status.SUCCESS);
    }

    @Test
    void testAkkaMicroservicesCRDCompiles() throws Exception {
        // Arrange
        var crd =
                Path.of(
                                this.getClass()
                                        .getClassLoader()
                                        .getResource("akka-microservices-crd.yml")
                                        .toURI())
                        .toFile();
        var dest = tmpFolder.newFolder("akka-microservices");

        // Act
        runner.run(crd, dest);
        var compilation = javac().compile(getSources(dest));

        // Assert
        assertThat(compilation.errors()).isEmpty();
//        assertThat(compilation.sourceFiles().size()).isEqualTo(27);
        assertThat(compilation.status()).isEqualTo(Compilation.Status.SUCCESS);
    }

    @Test
    void testStrimziCRDCompiles() throws Exception {
        // Arrange
        var crd =
                Path.of(
                                this.getClass()
                                        .getClassLoader()
                                        .getResource("strimzi-kafka-crd.yml")
                                        .toURI())
                        .toFile();
        var dest = tmpFolder.newFolder("strimzi-kafka");

        // Act
        runner.run(crd, dest);
        var compilation = javac().compile(getSources(dest));

        // Assert
        assertThat(compilation.errors()).isEmpty();
//        assertThat(compilation.sourceFiles().size()).isEqualTo(109);
        assertThat(compilation.status()).isEqualTo(Compilation.Status.SUCCESS);
    }

    @Test
    void testSparkCRDCompiles() throws Exception {
        // Arrange
        var crd =
                Path.of(this.getClass().getClassLoader().getResource("spark-crd.yml").toURI())
                        .toFile();
        var dest = tmpFolder.newFolder("spark");

        // Act
        runner.run(crd, dest);
        var compilation = javac().compile(getSources(dest));

        // Assert
        assertThat(compilation.errors()).isEmpty();
//        assertThat(compilation.sourceFiles().size()).isEqualTo(100);
        assertThat(compilation.status()).isEqualTo(Compilation.Status.SUCCESS);
    }

    @Test
    void testCrunchyCRDCompiles() throws Exception {
        // Arrange
        var crd =
                Path.of(
                                this.getClass()
                                        .getClassLoader()
                                        .getResource("crunchy-postgres-crd.yml")
                                        .toURI())
                        .toFile();
        var dest = tmpFolder.newFolder("crunchy");

        // Act
        runner.run(crd, dest);
        var compilation = javac().compile(getSources(dest));

        // Assert
        assertThat(compilation.errors()).isEmpty();
//        assertThat(compilation.sourceFiles().size()).isEqualTo(73);
        assertThat(compilation.status()).isEqualTo(Compilation.Status.SUCCESS);
    }

    @Test
    void testKameletCRDCompiles() throws Exception {
        // Arrange
        var crd =
                Path.of(this.getClass().getClassLoader().getResource("kamelet-crd.yml").toURI())
                        .toFile();
        var dest = tmpFolder.newFolder("kamelet");

        // Act
        runner.run(crd, dest);
        var compilation = javac().compile(getSources(dest));

        // Assert
        assertThat(compilation.errors()).isEmpty();
//        assertThat(compilation.sourceFiles().size()).isEqualTo(14);
        assertThat(compilation.status()).isEqualTo(Compilation.Status.SUCCESS);
    }

    @AfterAll
    public static void afterAll() {
        tmpFolder.delete();
    }
}
