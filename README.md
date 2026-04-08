## GitHub Repository
[View Project](https://github.com/yourusername/your-repo)# Selenium Java Automation Framework

## Overview
This project is a basic test automation framework built using:

- Java
- Selenium WebDriver
- JUnit 5
- Maven

The framework follows the Page Object Model (POM) design pattern and supports reusable test setup, configuration management, and structured test cases.

---

## Key Features
- Page Object Model (POM) design pattern
- Reusable BaseTest and BasePage classes
- External configuration using properties file
- Positive and negative test scenarios
- Explicit waits for improved test stability
- Automatic screenshot capture after test execution

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

---

## Future Improvements
- Add logging framework (e.g., SLF4J)
- Implement reporting (e.g., Allure or Extent Reports)
- Add cross-browser testing support
- Integrate with CI/CD pipeline
- Rebuild framework using Playwright