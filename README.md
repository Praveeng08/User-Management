
# JPADemo – User Management System

This is a Spring Boot application demonstrating basic **User Management** using **Spring Data JPA**, **Spring Web**, and **MySQL** (or other supported databases).

## Features

- RESTful APIs for user operations (CRUD)
- Integration with Spring Data JPA for database persistence
- Maven project structure for easy build and dependency management
- Java 21 compatibility

## Technologies Used

- Java 21
- Spring Boot 3.4.5
- Spring Data JPA
- Spring Web
- Maven

## Getting Started

### Prerequisites

- Java 21+
- Maven 3.8+
- MySQL or compatible RDBMS

### Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/your-username/JPADemo.git
    cd JPADemo
    ```

2. **Configure the Database:**  
   Update `application.properties` or `application.yml` in `src/main/resources` with your DB credentials.

3. **Build and Run:**

    ```bash
    mvn spring-boot:run
    ```

4. **API Access:**  
   Visit `http://localhost:8080` to access the REST endpoints.

## License

This project is licensed for educational/demo purposes.
