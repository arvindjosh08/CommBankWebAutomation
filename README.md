
# web automation framework for SuperHeroes and SuperVillain project

We have used Serenity BDD Cucumber framework for web automation framework. Serenity BDD produces rich HTML report 


## Tools

* Maven
* Cucumber-JVM
* JUnit
* Serenity BDD

## Requirements

In order to utilise this project you need to have the following installed locally:

* Maven
* Chrome browser version 101(UI tests use Chrome by default, can be changed in serenity.conf file located in src/test/resources folder)
* Java 1.8 and above


## Usage

To run the framework, navigate to `CommBankWebAutomation` directory and run:

`mvn clean verify`


## Reporting

Serenity Report is generated under `/target/site/serenity/index.html` directory after a successful run.

All UI acceptance tests result are logged in serenity HTML report along with screenshots