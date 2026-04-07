# Selenium Java Automation Framework

## Overview
This project is a basic test automation framework built using:

- Java
- Selenium WebDriver
- JUnit 5
- Maven

The framework follows the Page Object Model (POM) design pattern and supports reusable test setup, configuration management, and structured test cases.

---

## Features
- Base test setup with WebDriver initialization and teardown
- Page Object Model for UI interactions
- External configuration using properties file
- Positive and negative test scenarios
- Maven dependency management

---

## Project Structure
src/test/java
base -> Base test setup
pages -> Page objects
tests -> Test classes
utils -> Utility classes

src/test/resources
config.properties


---

## Test Cases
- Valid login test
- Invalid login test

---

## How to Run
1. Clone the repository
2. Open in IntelliJ
3. Run:

mvn test



---

## Notes
This project demonstrates core automation framework design concepts such as:
- Inheritance
- Encapsulation
- Abstraction
- Reusability