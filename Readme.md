
This is a POC for generating Java fabric8 CR java code from CRD definitions.

Generate the example code with something like:
```bash
mvn clean compile exec:java -Dexec.args="$PWD/src/test/resources/crontab-crd.yml $PWD/.tmp"
mvn clean compile exec:java -Dexec.args="$PWD/src/test/resources/keycloak-crd.yml $PWD/.tmp"
```

And check that the generated code compiles with:
```bash
mvn clean compile
```


TODO: handle x-kubernetes-preserve-fields -> Importante!!!
TODO: better namings / find a better name for the library and the repo
TODO: add a CI
