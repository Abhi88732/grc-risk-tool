
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

application.properties

CREATE DATABASE grc_risk_db;
spring.datasource.url=jdbc:mysql://localhost:3306/grc_risk_db
spring.datasource.username=root
spring.datasource.password=Example@2022#
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=9090

How to Run the Application (Using Eclipse)

1. Clone the repository
git clone https://github.com/Abhi88732/grc-risk-tool.git

2.Open Eclipse IDE
.File → Import → Existing Maven Project
.Select the project folder

3.Right-click on
GrcRiskToolAbhishekPrasadApplication.java

4.Select
Run As → Java Application

5.Wait for the message in console:
Tomcat started on port(s): 9090

Access the Application

.Frontend UI:
http://localhost:9090

.REST APIs:
    .POST /api/assess-risk
    .GET /api/risks
    .GET /api/risks?level=High

Testing

.Add multiple risks from the UI
.Verify:
  .Risk score calculation
  .Risk level assignment
  .Heatmap updates
.Check MySQL table for persisted records

Assumptions
.Application runs locally without authentication
.MySQL is installed and running
.Basic validation handled at backend level

TODO / Future Enhancements
.Add dashboard table with sorting and filtering
.CSV export of risks
.Mitigation hint column based on risk level
.Improve UI/UX
.Add authentication and authorization
.Add unit tests
.Deploy application to cloud

GRC Context
This tool follows a commonly used Likelihood × Impact risk matrix
approach, aligned with practices used in NIST and ISO-based GRC frameworks
to prioritize organizational risks.

---
## Screenshots

### Risk Heatmap Dashboard

![Risk Heatmap](https://github.com/Abhi88732/grc-risk-tool/blob/main/risktool/Screenshots/risk-heatmap.png?raw=true)






