# Selenium + REST Assured Automation Framework

## 📌 Overview
This project is a hybrid Java automation framework that combines **UI testing** using Selenium and **API testing** using REST Assured.  
It is designed with a scalable architecture, reusable components, and integrated with **Docker** and **GitHub Actions** for consistent CI/CD execution.

---

##  Tech Stack

- Java 17
- Maven
- Selenium WebDriver
- REST Assured
- JUnit 5
- Allure Reports
- Docker
- GitHub Actions
- Jackson (for POJO deserialization)

---

##  Framework Structure


    src/test/java

       ├── base # UI base setup (WebDriver initialization)

       ├── pages # Page Object Model classes

       ├── tests # UI test cases

       ├── utils # UI utilities (screenshots, helpers)


       ├── api/base # API base configuration (base URI)

       ├── api/tests # API test cases

       ├── api/utilities # API helper methods

       ├── api/models # POJO classes for API responses


       ├── integration/tests # Integration-style tests (API + data-driven validation)


---

##  UI Testing (Selenium)

- Page Object Model (POM) design pattern
- Centralized WebDriver setup via `BaseTest`
- Automated UI test scenarios (e.g. login tests)
- Screenshot capture for failures

---

##  API Testing (REST Assured)

- GET and POST endpoint validation
- Status code and response body assertions
- Reusable API configuration via `ApiBase`
- Clean request/response handling

### Example
java

    given()
    .when()
    .get("/users")
    .then()
    .statusCode(200);


---

##  Integration Testing

Integration-style tests simulate real-world workflows by:

- Extracting data from API responses

- Reusing that data in test logic

- Demonstrating data-driven testing patterns

---

## POJO Modeling (Advanced API)
API responses mapped into Java objects using Jackson
Improves readability and scalability
Handles partial responses with:
@JsonIgnoreProperties(ignoreUnknown = true)

---

## Docker Support

The framework is containerized for consistent execution across environments.

Build Image
docker build -t selenium-tests .
Run Tests
docker run selenium-tests

---

## CI/CD with GitHub Actions
Automated test execution on push
Runs inside a consistent environment
Ensures reliability across machines

---

## Allure Reporting
Test results stored in allure-results
Can be used to generate detailed test reports

---

## Running Tests Locally
Run all tests
mvn test
Run specific test
mvn -Dtest=ApiTest test

---

## Key Features
Hybrid UI + API automation
Scalable test architecture
Data-driven integration testing
POJO-based API validation
Dockerized execution
CI/CD pipeline integration

---

## Future Improvements
Config-driven environments (dev/qa/prod)
API request builder abstraction
Enhanced logging and reporting
UI + API full end-to-end integration flows

---

## Author

Built as part of a hands-on journey into automation engineering, DevOps, and scalable test frameworks.


---

