
This is a POC for generating Java fabric8 CR java code from CRD definitions.

At the moment it has been hammered on the current Keycloak CRD. 

Execute with:
```bash
mvn clean compile exec:java
```

And check that the generated code compiles with:
```bash
mvn clean compile
```


TODO: handle x-kubernetes-preserve-fields -> Importante!!!
TODO: better namings / find a better name for the library and the repo
TODO: add a CI
