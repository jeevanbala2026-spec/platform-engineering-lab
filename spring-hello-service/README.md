# Spring Hello Service

Small end-to-end Spring Boot sample project.

## Prerequisites

- Java 17+
- Maven 3.9+

## Run locally

```powershell
mvn spring-boot:run
```

Service URL: `http://localhost:8080`

## Test endpoints

```powershell
curl "http://localhost:8080/api/hello?name=Jeeva"
curl "http://localhost:8080/api/health"
```

## Run tests

```powershell
mvn test
```
