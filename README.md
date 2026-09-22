# Java Full Stack — Practical Code

A collection of hands-on projects and practicals completed as part of the **Java Full Stack (JFS)** course at **SRM Institute of Science and Technology, Delhi-NCR Campus**.

These projects were developed under the guidance of our faculty to build a strong foundation in Java enterprise development, from core Maven builds to Spring Framework and web applications.

---

## Projects

### Maven

| Project | Description |
|---------|-------------|
| **calculator-executable-jar** | A simple calculator packaged as an executable JAR using Maven, demonstrating build lifecycle and plugin configuration. |
| **first-app** | Introductory Maven project covering project structure, POM configuration, and dependency management. |

### Spring Core

| Project | Description |
|---------|-------------|
| **dependency-injection-ioc** | Demonstrates Dependency Injection and Inversion of Control using Spring's XML-based configuration with `ApplicationContext`. |
| **first-spring-app** | A starter Spring application exploring bean creation, component scanning, and the Spring container. |
| **spring-mvc** | A Spring MVC web application with servlet configuration, JSP views, and deployment on an embedded Tomcat server. |

---

## Tech Stack

- **Language:** Java
- **Build Tool:** Apache Maven
- **Framework:** Spring Core, Spring MVC
- **Server:** Apache Tomcat (embedded)
- **IDE:** VS Code / IntelliJ IDEA

---

## How to Run

1. Make sure **Java 17+** and **Maven** are installed.
2. Navigate into any project directory:
   ```bash
   cd "Maven Project/calculator-executable-jar"
   ```
3. Build and run:
   ```bash
   mvn clean package
   java -jar target/*.jar
   ```
   For Spring MVC:
   ```bash
   cd "Spring Core/spring-mvc"
   mvn tomcat7:run
   ```

---

## Author

**Harsh Raj**
B.Tech CSE, SRM Institute of Science and Technology (Delhi-NCR)

---

> Developed as part of the Java Full Stack course curriculum.
