# Java Full Stack — Practical Code

A collection of class notes and hands-on practicals from the **Java Full Stack (JFS)** course at **SRM Institute of Science and Technology, Delhi-NCR Campus**.

The material follows the course progression: Core Java and OOP, Maven fundamentals, the Spring Framework (IoC and dependency injection), Spring Boot with request mapping, and finally the module projects that bring it together.

---

## Repository Structure

```
JFS-Practical-Code/
├── Class Content/                      # Course notes (PDF)
├── Maven Project/
│   ├── first-app/                      # Maven "Hello World"
│   └── calculator-executable-jar/      # Swing calculator packaged as an executable JAR
├── Spring Core/
│   ├── first-spring-app/               # Annotation-based Spring container
│   ├── dependency-injection-ioc/       # XML-based setter injection
│   └── spring-mvc/                     # Maven WAR webapp running on Tomcat
├── Spring Boot/
│   └── request-mapping-controller/     # Spring Boot controller with @GetMapping routes
└── Module Project/
    ├── Module - 1/Inventory Management System/
    ├── Module - 2/MultiThreadedFileProcessor/
    └── Module - 3/employee-management-web/
```

---

## Class Content

| File | Topic |
|------|-------|
| `1 - Introduction to Java and OOPs Concept.pdf` | Java basics and object-oriented programming |
| `2 - Interface in Java.pdf` | Interfaces in Java |
| `11 - Maven Spring Boot Setup.pdf` | Setting up Maven and Spring Boot |
| `Request Mapping and Response Entity in Spring Boot.pdf` | Request mapping and `ResponseEntity` |
| `Complete Tutorial on JPA.pdf` | Java Persistence API (JPA) |

---

## Projects

### Maven

| Project | What it demonstrates |
|---------|----------------------|
| **first-app** | The standard Maven project layout generated from the quickstart archetype: `pom.xml`, `src/main/java`, `src/test/java`. Prints "Hello World!". |
| **calculator-executable-jar** | A Swing GUI calculator (add, subtract, multiply, divide, with divide-by-zero and invalid-input handling). The `maven-jar-plugin` is configured with `com.example.myapp.App` as the main class so the build produces a runnable JAR. |

### Spring Core

| Project | What it demonstrates |
|---------|----------------------|
| **first-spring-app** | Component scanning with `AnnotationConfigApplicationContext`. A `@Service` bean (`MyService`) is discovered in the `com.example` package and fetched from the container. The `exec-maven-plugin` is configured so the app runs without building a JAR. |
| **dependency-injection-ioc** | Dependency Injection and Inversion of Control with XML configuration. `MessagePrinter` depends on the `MessageService` interface, and `applicationContext.xml` injects an implementation through a setter. `EmailMessageService` is wired by default, and `SMSMessageService` is an alternative: change the `class` of the `messageService` bean to switch. |
| **spring-mvc** | A Maven `war` project (`spring-mvc.war`) with a JSP landing page, run on embedded Tomcat via the `tomcat7-maven-plugin`. At this stage it is the web application scaffold: only `spring-core` is declared, and `web.xml` has no Spring `DispatcherServlet` yet. |

### Spring Boot

| Project | What it demonstrates |
|---------|----------------------|
| **request-mapping-controller** | A Spring Boot web app (`spring-boot-starter-webmvc`) whose `WebController` uses `@GetMapping` to serve static `home.html` at `/` and `login.html` at `/login`. |

### Module Projects

| Project | What it demonstrates |
|---------|----------------------|
| **Module 1: Inventory Management System** | A console application written in plain Java with menus for products, categories and stock, plus a low-stock report. Uses a `FileManager` class with a `products.dat` data file. |
| **Module 2: MultiThreadedFileProcessor** | Reads several CSV sales files concurrently with a thread pool, builds its configuration with the Builder pattern, and writes an aggregated sales report to `report.txt`. It has its own detailed README with a Windows `run.bat`. |
| **Module 3: employee-management-web** | A Spring Boot web app with Thymeleaf pages for a dashboard, employees and departments (list, add, edit, delete), and a login with three demo roles (HR, Manager, Employee). A JWT is generated at login with `jjwt` and kept in the HTTP session along with the username and role. See the note below before reusing it. |

---

## Tech Stack

- **Language:** Java. Spring Boot projects are configured for **Java 22** (`java.version` in their `pom.xml`). The Spring Core projects need Java 17+.
- **Build tool:** Apache Maven (Maven Wrapper included in the Spring Boot projects)
- **Frameworks:** Spring Context 6.1.6 and Spring Core 6.2.9 (Spring Core projects), Spring Boot 4.1.1 (Spring Boot and Module 3), Thymeleaf, Spring Security, jjwt 0.12.6
- **Server:** Apache Tomcat 7 via `tomcat7-maven-plugin` (`spring-mvc`), embedded server for Spring Boot projects
- **Testing:** JUnit 3.8.1 for the quickstart projects, Spring Boot test starters for the Boot projects
- **IDE:** VS Code / IntelliJ IDEA

---

## How to Run

**Prerequisites:** a JDK (22 for the Spring Boot projects, 17 or newer for the rest) and Apache Maven 3.8+ (`java -version`, `mvn -v`).

Each project is independent, so run the commands from inside its own folder. Folder names contain spaces, so keep the quotes around paths.

| Project | Commands |
|---------|----------|
| `Maven Project/first-app` | `mvn compile` then `java -cp target/classes com.example.myapp.App` |
| `Maven Project/calculator-executable-jar` | `mvn clean package` then `java -jar target/calculator-executable-jar-1.0-SNAPSHOT.jar` (opens a Swing window, so it needs a desktop environment) |
| `Spring Core/first-spring-app` | `mvn compile exec:java` |
| `Spring Core/dependency-injection-ioc` | `mvn compile exec:java -Dexec.mainClass=com.example.App` |
| `Spring Core/spring-mvc` | `mvn tomcat7:run`, then open <http://localhost:8080/spring-mvc/> |
| `Spring Boot/request-mapping-controller` | `mvn spring-boot:run` (or `./mvnw spring-boot:run`), then open <http://localhost:8080/> |
| `Module Project/Module - 1/Inventory Management System` | `javac *.java` then `java Main` |
| `Module Project/Module - 2/MultiThreadedFileProcessor` | Double-click `run.bat` on Windows, or follow the steps in its README |
| `Module Project/Module - 3/employee-management-web` | `mvn spring-boot:run` (or `./mvnw spring-boot:run`), then open <http://localhost:8080/login> |

Example:

```bash
cd "Spring Boot/request-mapping-controller"
mvn spring-boot:run
```

---

## Note on Module 3 (employee-management-web)

This is a classroom demo and is not production-ready:

- The login uses hardcoded demo users in `LoginController`.
- The JWT signing key is stored in `application.properties`.
- The JWT is generated at login, but nothing in the project verifies it yet.
- `SecurityConfig` currently permits all requests and disables CSRF.

Do not deploy it as-is. Move secrets into environment variables and enforce authorization first.

---

## Credits

The files in `Class Content/`, `Spring Boot/` and `Module Project/` come from the public repository [imrantarik-ux/SRM-IST](https://github.com/imrantarik-ux/SRM-IST), which has no license file. All rights to the original course material remain with its authors.

---

## Author

**Harsh Raj**
B.Tech CSE, SRM Institute of Science and Technology (Delhi-NCR)
GitHub: [@404harshfound](https://github.com/404harshfound)

---

> Developed as part of the Java Full Stack course curriculum.
