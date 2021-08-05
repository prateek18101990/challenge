# AutomationPractice
## Tech Challenge to automate basic shopping flow using selenium/cucumber
### Login to AutomationPractice and add 2 items to cart and complete the checkout and payment steps


## Tools and technologies used:

1. Language: Java 
2. Testing framework: JUnit
3. BDD framework: Cucumber jvm
4. Automation tool: Selenium webdriver
5. Build tool: maven
7. Browser: Chrome


## Features of the framework
1. BDD framework using Cucumber-jvm. Feature files can be written easily using Given,When,Then etc.
2. The browser to use for the test execution is a configurable property in /Properties folder.
3. Screenshots are captured for the execution and can be found in /target/Screenshots folder.
4. Test Data is captured from config.properties file in /Properties folder.


**package: resources** : It has exe of chromedriver. This is required while creating the webdriver session.

## Setting up the project

Unzip the file in local system and run :

**$ mvn clean**


## Execution of tests  
There is 1 feature file "Shopping.feature" to login to AutomationPractice and add 2 items and proceed to checkout. The SignIn is done through a registered user only for display purpose. We can add code for Create Account as well.

## Run the test using Maven Build
The Maven build agent can trigger the tests by launching the Maven on IDE and double clicking the "test" in lifecycle:


## Run the test using Terminal
Command line can also be used to run the tests:

**$ mvn test**