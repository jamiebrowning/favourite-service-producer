# favourite-service-producer
***
## Description

This is a scratch project to explore the use of [Spring Cloud Contracts](https://spring.io/projects/spring-cloud-contract).

This project represents a trivial Favourite service. There are 2 distinct roles and 2 distinct use cases for this project:

1. **Consumers** of the service 
2. **Producers** (Owners) of the service

Consumers will write contracts and generate stubs for testing. They will submit a pull request when they have defined their contract requirements but do not implement the functionality themselves.

Producers will implement the functionality of the service. They will review the PR and confirm that the service meets the requirement of the contract. 

It is important to understand these roles and the workflow paradigm of *consumer*-driven contracts.

> Spring Cloud Contract Verifier moves TDD to the level of software architecture.

## Install

I set up 2 IntelliJ Run Configurations (you can adapt to the tool of your choice)

### Consumer

You only need to generate the stubs. The Consumer is not defining the implementation of the service

```mvn clean install -DskipTests```

### Producer

Generate and run the tests. Test pass indicates acceptance of contract.

```mvn clean install```

## Usage

 The [Spring Cloud Contract Verifier Plugin](https://cloud.spring.io/spring-cloud-contract/reference/html/maven-project.html) for Maven does the heavy lifting. Depending on the build phase it
 
 1. Locates any contracts and generates the JSON stubs for WireMock
 2. Auto generates a Unit test for each contract
 3. Creates a *-stubs JAR that can be used by consumers for their testing.
 
By *convention* contracts should be placed in the `src/test/resource/contracts` directory.

Contracts can be writte in YAML or Groovy - why would you not use Groovy though?
