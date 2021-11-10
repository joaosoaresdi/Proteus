# Proteus
DSL for a fault injection system

The system is divided into 3 components, the client, server and generated code for each component

# Code Generation

To facilitate the generation of code we first need to deploy the xtext code generator as a command line utility. To achieve this follow this [guide](https://goto40.github.io/self-dsl/xtext_deploy_command_line/#generate-a-command-line-version-of-the-code-generator)

An exported version of this command line utility can be found in the examples
to run

```
java -jar compiler.jar test.agen
```
