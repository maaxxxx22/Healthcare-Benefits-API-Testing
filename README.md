# Healthcare Benefits API Testing Framework

This project is a comprehensive Java-based API testing framework developed to automate and validate the functionality, performance, and security of a healthcare benefits management system. The framework leverages RestAssured, JUnit, and Mockito to ensure the APIs are robust and reliable.

## Table of Contents
- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Running the Tests](#running-the-tests)
- [Project Structure](#project-structure)
- [Features](#features)
- [Test Cases](#test-cases)
- [Reporting](#reporting)
- [Continuous Integration](#continuous-integration)
- [Contributing](#contributing)
- [License](#license)

## Project Overview
The Healthcare Benefits API Testing Framework is designed to test critical API endpoints, including user authentication, benefits management, and performance metrics. This ensures that the API is functioning as expected and meets industry standards for security and reliability.

## Technologies Used
- **Java**: Programming language for developing the test framework.
- **RestAssured**: API testing library for writing robust and efficient tests.
- **JUnit 5**: Framework for structuring and executing tests.
- **Mockito**: For mocking and isolating dependencies during unit tests.
- **Allure**: Generates detailed and visually appealing test reports.
- **Docker**: Containerized testing environment for consistent execution.

## Setup Instructions
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/maaxxxx22/Healthcare-Benefits-API-Testing.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd Healthcare-Benefits-API-Testing
   ```
3. **Install Dependencies**:
   - Ensure Maven is installed on your system. You can download Maven from [Apache Maven](https://maven.apache.org/).
   - Verify Maven installation:
     ```bash
     mvn -version
     ```
4. **Configure API Details**:
   - Update `Config.java` in `src/main/config` with your API base URL and authentication token.

## Running the Tests
- **Using Maven**:
  ```bash
  mvn test
  ```
- **Using Docker**:
  ```bash
  docker-compose up
  ```
- Test results will be generated in the `/reports` directory.

## Project Structure
```
Healthcare-Benefits-API-Testing/
│
├── src/
│   ├── main/
│   │   ├── config/
│   │   │   └── Config.java
│   │   ├── utils/ (future utility classes can go here)
│   │
│   ├── test/
│       └── java/
│           └── com.example.tests/
│               ├── AuthenticationTests.java
│               └── BenefitsTests.java
│
├── reports/ (generated test reports)
├── docker-compose.yml
├── pom.xml (Maven configuration)
└── README.md
```

## Features
- **Automated API Testing**: Validates API endpoints with comprehensive test cases.
- **Security Testing**: Ensures endpoints are secure and protected against unauthorized access.
- **Performance Testing**: Measures response times and checks for performance bottlenecks.
- **Mocking**: Uses Mockito to mock dependencies and isolate test cases.
- **Reporting**: Generates detailed HTML reports with Allure for easy analysis of test results.

## Test Cases
### 1. AuthenticationTests
- **testLogin**: Validates successful user login and ensures a token is returned.
- **testLogout**: Verifies that a user can log out successfully.

### 2. BenefitsTests
- **testViewBenefits**: Checks if the API returns the list of benefits with a valid token.
- **testUpdatePreferences**: Ensures user preferences can be updated and returns a success response.

## Reporting
- **Allure Reports**: To generate and view Allure reports, run:
  ```bash
  mvn allure:serve
  ```
- The report will open in a web browser, displaying test case results, execution time, and detailed logs.

## Continuous Integration
- This framework can be integrated with CI/CD tools like Jenkins or GitHub Actions for automated testing in your deployment pipeline.
- Example Jenkinsfile for integration:
  ```groovy
  pipeline {
      agent any
      stages {
          stage('Checkout') {
              steps {
                  git 'https://github.com/maaxxxx22/Healthcare-Benefits-API-Testing.git'
              }
          }
          stage('Build & Test') {
              steps {
                  sh 'mvn clean test'
              }
          }
          stage('Generate Report') {
              steps {
                  sh 'mvn allure:report'
              }
          }
      }
  }
  ```

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure that your code adheres to the project's coding standards.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
