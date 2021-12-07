package org.crd2j;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        var source = new File(args[0]);
        var dest = new File(args[1]);

        var runner = new CRGeneratorRunner();
        runner.run(source, dest);
    }

}
