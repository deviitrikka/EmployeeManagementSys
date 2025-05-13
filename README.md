# Employee Management System

This is a Spring Boot application for managing employees. It provides
functionalities to add, update, delete, and view employee details.

## Features

- Add new employees
- Update existing employee details
- Delete employees
- View employee list

## Prerequisites

- Java 17 or higher
- Maven 3.8 or higher
- Spring Boot 2.7 or higher

## Getting Started

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd employee-mng
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Access the application: Open your browser and navigate to
   `http://localhost:8080`.

## Project Structure

```
employee-mng/
├── .gitignore
├── .gitattributes
├── .mvn/
│   └── wrapper/
│       ├── maven-wrapper.jar
│       └── maven-wrapper.properties
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/employee_mng/
│   │   │       ├── Employee.java
│   │   │       ├── EmployeeMngApplication.java
│   │   │       ├── EmployeeService.java
│   │   │       ├── EmployeeServiceImplement.java
│   │   │       ├── EmpController.java
│   │   │       ├── entity/
│   │   │       │   └── EmployeeEntity.java
│   │   │       └── repository/
│   │   │           └── EmployeeRepository.java
│   │   └── resources/
│   │       ├── application.properties
│   └── test/
│       └── java/
│           └── com/example/employee_mng/
│               └── EmployeeMngApplicationTests.java
└── target/
```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.
