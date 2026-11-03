# Java Full Stack — Practical Code

A collection of hands-on practicals completed as part of the **Java Full Stack (JFS)** course at **SRM Institute of Science and Technology, Delhi-NCR Campus**.

The projects follow the course progression: first Maven fundamentals (project structure, build lifecycle, executable JARs), then the Spring Framework (dependency injection, IoC container, annotation-based configuration) and finally a Maven web application deployed on Tomcat.

---

## Repository Structure

```
JFS-Practical-Code/
├── Maven Project/
│   ├── first-app/                  # Maven "Hello World"
│   └── calculator-executable-jar/  # Swing calculator packaged as an executable JAR
└── Spring Core/
    ├── first-spring-app/           # Annotation-based Spring container
    ├── dependency-injection-ioc/   # XML-based setter injection
    └── spring-mvc/                 # Maven WAR webapp running on Tomcat
```

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

---

## Tech Stack

- **Language:** Java (17+ required for Spring 6)
- **Build tool:** Apache Maven
- **Frameworks:** Spring Context 6.1.6 (Spring Core projects), Spring Core 6.2.9 (`spring-mvc` project)
- **Server:** Apache Tomcat 7 via `tomcat7-maven-plugin`
- **Testing:** JUnit 3.8.1 (default quickstart test stubs)
- **IDE:** VS Code / IntelliJ IDEA

---

## How to Run

**Prerequisites:** JDK 17 or newer and Apache Maven 3.8+ installed (`java -version`, `mvn -v`).

Each project is an independent Maven project, so run the commands from inside its own folder.

| Project | Commands |
|---------|----------|
| `Maven Project/first-app` | `mvn compile` then `java -cp target/classes com.example.myapp.App` |
| `Maven Project/calculator-executable-jar` | `mvn clean package` then `java -jar target/calculator-executable-jar-1.0-SNAPSHOT.jar` (opens a Swing window, so it needs a desktop environment) |
| `Spring Core/first-spring-app` | `mvn compile exec:java` |
| `Spring Core/dependency-injection-ioc` | `mvn compile exec:java -Dexec.mainClass=com.example.App` |
| `Spring Core/spring-mvc` | `mvn tomcat7:run`, then open <http://localhost:8080/spring-mvc/> |

Example:

```bash
cd "Spring Core/first-spring-app"
mvn compile exec:java
```

> Folder names contain spaces, so keep the quotes around paths in the terminal.

---

## Author

**Harsh Raj**
B.Tech CSE, SRM Institute of Science and Technology (Delhi-NCR)
GitHub: [@404harshfound](https://github.com/404harshfound)

---

> Developed as part of the Java Full Stack course curriculum.
