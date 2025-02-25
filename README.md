# Spring Boot Employees REST API

## 📌 Project Description
This is a Spring Boot REST API that provides CRUD (Create, Read, Update, Delete) operations for managing employees. The application uses **Spring Data JPA** with a MySQL database and leverages **Spring Data REST** to automatically expose repository-based endpoints.

## 🚀 Features
- Uses **Spring Data REST** to automatically generate CRUD endpoints.
- Exposes API endpoints at `/magic-api/members`.
- Implements **Lombok** to reduce boilerplate code.
- Uses **Spring Boot & JPA (Hibernate)** for database operations.
- Supports **MySQL database** connection.

## 🛠️ Technologies Used
- **Java 17**
- **Spring Boot** (3.x)
- **Spring Data JPA (Hibernate)**
- **Spring Data REST**
- **Lombok**
- **MySQL**
- **Maven**

## ⚙️ Setup and Installation
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/ozy-7/spring-boot-employees-rest-api.git
cd spring-boot-employees-rest-api
```

### 2️⃣ Configure MySQL Database
Make sure MySQL is running and update `src/main/resources/application.properties` if needed:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_directory
spring.datasource.username=springemployee
spring.datasource.password=springemployee
```

### 3️⃣ Build and Run the Application
```sh
mvn spring-boot:run
```

## 📡 API Endpoints
Since this project uses **Spring Data REST**, the API endpoints are automatically generated.

### Retrieve All Employees
```sh
GET /magic-api/members
```
### Retrieve Employee by ID
```sh
GET /magic-api/members/{id}
```
### Add a New Employee
```sh
POST /magic-api/members
Content-Type: application/json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com"
}
```
### Update an Employee
```sh
PUT /magic-api/members/{id}
Content-Type: application/json
{
  "firstName": "Jane",
  "lastName": "Smith",
  "email": "jane.smith@example.com"
}
```
### Delete Employee by ID
```sh
DELETE /magic-api/members/{id}
```

## 🏗️ Understanding Key Technologies
### **Lombok**
Lombok is used to reduce boilerplate code in Java. It automatically generates getters, setters, constructors, and `toString()` methods using annotations.
- `@Data` → Combines `@Getter`, `@Setter`, `@ToString`, and `@RequiredArgsConstructor`.
- `@NoArgsConstructor` → Generates a no-argument constructor.
- `@AllArgsConstructor` → Generates a constructor with all fields.

Example in `Employee.java`:
```java
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
```

### **Spring Data REST**
Spring Data REST automatically exposes repository-based endpoints without needing a separate controller. In `EmployeeRepository.java`, the `@RepositoryRestResource(path = "members")` annotation customizes the base path.
```java
@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
```

This means the API endpoints are available at `/magic-api/members` instead of the default `/employees`.

---
📌 This project demonstrates how to create a REST API efficiently using Spring Boot and Spring Data REST.
