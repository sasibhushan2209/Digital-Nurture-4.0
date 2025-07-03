# Spring Core with Maven - Library Management Exercises

- **Exercise 1: Configuring a Basic Spring Application**
  - Created Maven project: `LibraryManagement`
  - Added Spring Core dependencies in `pom.xml`
  - Defined beans in `applicationContext.xml` for `BookService` and `BookRepository`
  - Created main class to load Spring context and test the setup

- **Exercise 2: Implementing Dependency Injection**
  - Configured setter injection of `BookRepository` into `BookService`
  - Updated `BookService` with setter method
  - Verified bean injection using main class

- **Exercise 4: Constructor-Based Dependency Injection**
  - Configured constructor injection in `applicationContext.xml`
  - Modified `BookService` to include a constructor for `BookRepository`
  - Tested output using main class

- **Exercise 5: Configuring the Spring IoC Container**
  - Centralized bean configuration in `applicationContext.xml`
  - Updated `BookService` with setter method
  - Verified setup with test output

- **Exercise 7: Implementing Constructor and Setter Injection**
  - Used both constructor and setter injection for `BookService`
  - Verified bean injection by running the main class

- **Exercise 9: Creating a Spring Boot Application**
  - Created Spring Boot project: `LibraryManagement` using Spring Initializr
  - Added dependencies: Spring Web, Spring Data JPA, H2 Database
  - Configured database in `application.properties`
  - Created `Book` entity and `BookRepository` interface
  - Implemented `BookController` to handle CRUD operations
  - Used **Postman** to test REST APIs:
    - `POST /books` – Add a book
    - `GET /books` – Get all books
    - `GET /books/{id}` – Get book by ID
    - `PUT /books/{id}` – Update book
    - `DELETE /books/{id}` – Delete book

- **Postman used for testing in Exercise 9**

- **Output Screenshots** folder added in each exercise directory
