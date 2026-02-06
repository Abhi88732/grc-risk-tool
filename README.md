
# GRC Risk Assessment Tool

This is a simple **GRC (Governance, Risk & Compliance) Risk Assessment Tool** developed as an assignment using **Java, Spring Boot, MySQL** and **HTML, CSS, JavaScript**.

The application allows users to:
- Add risks using likelihood and impact
- Automatically calculate risk score and level
- View risks on a 5×5 risk heatmap
- Store and retrieve data from MySQL database

---

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- HTML, CSS, JavaScript
- Maven

---

## Project Structure
risktool
├── pom.xml
├── src/main/java
│ └── com/grc/risktool
│ ├── controller/RiskController.java
│ ├── service/RiskService.java
│ ├── repository/RiskRepository.java
│ ├── model/Risk.java
│ └── GrcRiskToolAbhishekPrasadApplication.java
└── src/main/resources
├── application.properties
└── static
├── index.html
├── script.js
└── style.css

---

## Database Configuration

Create database in MySQL:

```sql
CREATE DATABASE grc_risk_db;
spring.datasource.url=jdbc:mysql://localhost:3306/grc_risk_db
spring.datasource.username=root
spring.datasource.password=Example@2022#

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=9090





