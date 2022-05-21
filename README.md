
# web automation framework for SuperHeroes and SuperVillain project

We have used Serenity BDD Cucumber framework for web automation framework. Serenity BDD produces rich HTML report 


## Tools

* Maven
* Cucumber-JVM
* JUnit
* Serenity BDD 
* Serenity HTML reports

## Requirements

In order to utilise this project you need to have the following installed locally:

* Maven
* Chrome browser(UI tests use Chrome by default, can be changed in config)
* Java 1.8


## Usage

To run the framework, navigate to `webautomation` directory and run:

`mvn clean verify`


## Reporting

Serenity Report is generated under `/target/site/serenity` directories after a successful run. index.html file will be generated under `/target/site/serenity` directory.

All UI acceptance tests result are logged in serenity HTML report along with screenshots