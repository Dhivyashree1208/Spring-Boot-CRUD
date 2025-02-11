# Spring Boot CRUD API with MySQL

## Project Overview
This project demonstrates the implementation of CRUD (Create, Read, Update, Delete) operations using **Spring Boot**. It is a RESTful API that allows users to perform CRUD operations on a `User` entity stored in a **MySQL** database. The application is built using **Spring Boot**, and the back-end uses **MySQL** as the database service.

## Features
- **Create**: Adds a new resource to the MySQL database.
- **Read**: Retrieves existing resources from the MySQL database.
- **Update**: Modifies an existing resource in the database.
- **Delete**: Deletes a resource from the database.

## Tools and Technologies
- **Java**: Programming language used to implement the backend.
- **Spring Boot**: Framework to build RESTful web services.
- **MySQL**: Relational database used for data persistence.
- **Spring Data JPA**: Provides a mechanism to interact with the MySQL database.
- **IntelliJ IDEA**: IDE used for development.
- **Postman**: API testing tool used to interact with the API endpoints.

## Project Structure

├── src │ ├── main │ │ ├── java │ │ │ ├── com │ │ │ │ └── example │ │ │ │ └── demo │ │ │ │ ├── controller │ │ │ │ │ └── UserController.java │ │ │ │ ├── model │ │ │ │ │ └── User.java │ │ │ │ ├── repository │ │ │ │ │ └── UserRepository.java │ │ │ │ └── service │ │ │ │ └── UserService.java │ │ ├── resources │ │ │ ├── application.properties │ ├── static ├── pom.xml


## Setup and Installation

### Prerequisites
Ensure you have the following installed:
- **Java JDK** (Version 11 or higher)
- **Maven** (for dependency management)
- **MySQL** (for database service)
- **Postman** (for testing the APIs)
- **IntelliJ IDEA** (IDE for development)

### Steps to Set Up and Run
1. **Clone the Repository**:
   Clone this project to your local machine using:
   ```bash
   git clone https://github.com/yourusername/springboot-crud-api.git
