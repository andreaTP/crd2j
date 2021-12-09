package org.crd2j;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class ApprovalTest {

    KubernetesClient client = new DefaultKubernetesClient();
    CRGeneratorRunner runner = new CRGeneratorRunner();

    @Test
    void testCrontabCrd() {
        // Arrange
        var crd = client
                .apiextensions()
                .v1()
                .customResourceDefinitions()
                .load(this
                        .getClass()
                        .getClassLoader()
                        .getResource("crontab-crd.yml"))
                .get();

        // Act
        var writables = runner.generate(crd, Optional.empty());

        // Assert
        assertThat(writables.size()).isEqualTo(1);

        var writable = writables.get(0);

        Approvals.verifyAll("CrontabJavaCr", List.of(
            writable.getJavaClass("CronTab"),
            writable.getJavaClass("Spec"),
            writable.getJavaClass("Status"))
        );
    }

    @Test
    void testKeycloakCrd() {
        // Arrange
        var crd = client
                .apiextensions()
                .v1()
                .customResourceDefinitions()
                .load(this
                        .getClass()
                        .getClassLoader()
                        .getResource("keycloak-crd.yml"))
                .get();

        // Act
        var writables = runner.generate(crd, Optional.empty());

        // Assert
        assertThat(writables.size()).isEqualTo(1);

        var writable = writables.get(0);

        Approvals.verifyAll("KeycloakJavaCr", List.of(
                writable.getJavaClass("Keycloak"),
                writable.getJavaClass("Spec"),
                writable.getJavaClass("Status"))
        );
    }

    @Test
    void testAkkaMicroservicesCrd() {
        // Arrange
        var crd = client
                .apiextensions()
                .v1()
                .customResourceDefinitions()
                .load(this
                        .getClass()
                        .getClassLoader()
                        .getResource("akka-microservices-crd.yml"))
                .get();

        // Act
        var writables = runner.generate(crd, Optional.empty());

        // Assert
        assertThat(writables.size()).isEqualTo(1);

        var writable = writables.get(0);

        Approvals.verifyAll("AkkaMicroservicesJavaCr", List.of(
                writable.getJavaClass("AkkaMicroservice"),
                writable.getJavaClass("Spec"),
                writable.getJavaClass("Status"))
        );
    }
}
