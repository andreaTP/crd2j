# CRD2J

CRD (yaml/json) -> Fabric8 CR (java)

Given a CRD definition this project aims to generate idiomatic Java sources relying on the Fabric8 Kubernetes-Client library CR definitions.

## Building blocks

This project is built on top of 2 great libraries:

 - [Fabric8 Kubernetes-Client](https://github.com/fabric8io/kubernetes-client)
 - [Javaparser](https://github.com/javaparser/javaparser)

## Run the generator

You can generate sources with a command like:
```bash
mvn clean compile exec:java -Dexec.args="<source-crd> <destination-folder>"
```

for example:
```bash
mvn clean compile exec:java -Dexec.args="$PWD/src/test/resources/keycloak-crd.yml $PWD/.tmp"
```

---

### Build

```bash
mvn clean compile
```

### Test

This project uses 3 different approaches to testing:

 - unit tests
 - approval(or golden) tests for quicker feedback cycle when looking at how the generated code should look like
 - compiler tests to ensure that the generated sources will compile

```bash
mvn clean test
```

### Features

 - `x-kubernetes-int-or-string` is encoded using the `io.fabric8.kubernetes.api.model.IntOrString` type
 - `x-kubernetes-preserve-unknown-fields` is mapped using additional properties into objects

### Next

 - command line application (binaries?)
 - Maven plugin
