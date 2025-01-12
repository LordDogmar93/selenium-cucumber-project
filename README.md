# Selenium Cucumber Project

This project is a base setup for using Selenium with Cucumber in Java, managed by Maven. It provides a structured approach to writing and executing automated tests for web applications.

## Project Structure

```
selenium-cucumber-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── App.java
│   │   └── resources
│   ├── test
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── RunCucumberTest.java
│   │   │           └── stepdefinitions
│   │   │               └── StepDefinitions.java
│   │   └── resources
│   │       └── features
│   │           └── example.feature
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Prerequisites**
   - Ensure you have Java JDK installed (version 8 or higher).
   - Install Maven on your machine.

2. **Clone the Repository**
   - Clone this repository to your local machine using:
     ```
     git clone <repository-url>
     ```

3. **Navigate to the Project Directory**
   - Change to the project directory:
     ```
     cd selenium-cucumber-project
     ```

4. **Build the Project**
   - Use Maven to build the project:
     ```
     mvn clean install
     ```

5. **Run the Tests**
   - Execute the Cucumber tests using:
     ```
     mvn test
     ```

## Usage Guidelines

- Modify the `example.feature` file to add your test scenarios.
- Implement the step definitions in `StepDefinitions.java` to match your feature file steps.
- Use `App.java` as the entry point for any additional application logic you want to include.

## Dependencies

This project uses the following dependencies:
- Selenium WebDriver
- Cucumber
- JUnit

Refer to the `pom.xml` file for the complete list of dependencies and their versions.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.