# favourite-service-producer

This is a scratch project to explore the use of [Spring Cloud Contracts](https://spring.io/projects/spring-cloud-contract).

This project represents a trivial Favourite service. There are 2 distinct roles and 2 distinct use cases for this project:

| Role | Usage |
| :- | :- |
| Consumers of the service | Will write conracts and generate stubs for testing. Will submit PR for requested changes in implementation |
| Producers (Owners) of the service | Will implement the functionality demanded by the contract. Will fix on PR and then release |

It is important to understand these roles and the expected workflow as this is the cruicial paradigm of *consumer* driven contracts

## Install

I set up 2 IntelliJ Run Configurations (you can adapt to the tool of your choice)

| Configuration | Command | Usage|
| :- | :- | :- |
| Consumer | `mvn clean install -DskipTests` | Only generate the stubs. Consumer is not defining implementation |
| Producer | `mvn clean install` | Generate and run the tests. Test pass indicates acceptance of contract |

## Usage

 The [Spring Cloud Contract Verifier Plugin](https://cloud.spring.io/spring-cloud-contract/reference/html/maven-project.html) for Maven does the heavy lifting. Depending on the build phase it
 
 1. Locates any contracts and generates the JSON stubs for WireMock
 2. Auto generates a Unit test for each contract
 3. Creates a *-stubs JAR that can be used by consumers for their testing.
 
By *convention* contracts should be placed in the `src/test/resource/contracts` directory.

Contracts can be writte in YAML or Groovy - why would you not use Groovy though?
