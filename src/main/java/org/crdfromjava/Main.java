package org.crdfromjava;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        var source = new File("./keycloak_crd.yaml");
        // var source = new File("./crontab-crd.yml");
        // var dest = new File("./src/main/java");
        var dest = new File(".tmp");

        var runner = new CRGeneratorRunner();
        runner.run(source, dest);
    }

}
