# Airline Reservation System

This is an Airline Reservation System implemented using Java, Spring Boot, and following a microservice architecture. It provides a RESTful API for managing flights, reservations, users, and other related functionalities.

## Technologies Used

- Java
- Spring Boot
- REST API
- Maven
- Docker
- MySQL
- Kafka

## Features

- **Flight Management**: Allows administrators to manage flight schedules, availability, and pricing.
- **Reservation Handling**: Enables users to search for flights, book, modify, and cancel reservations.
- **User Management**: Provides functionalities for user registration, login, and profile management.
- **Payment Integration**: Integrates with payment gateways for secure online payments.
- **Notification Service**: Sends notifications to users regarding reservation confirmations, changes, etc.
- **Analytics**: Collects and analyzes data for generating reports on flight occupancy, revenue, etc.
- **Microservice Architecture**: Follows a microservices-based architecture for scalability and flexibility.

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/airline-reservation.git 
   ```

2. Navigate to the project directory:

```bash 
   cd airline-reservation
```

3. Build the project using Maven:

```bash 
    mvn clean install
```
4. Start Docker containers:
```bash 
docker-compose up -d 
```
5. Access the application at http://localhost:8080.

## Configuration
- Database configurations can be found in application.properties.
- Docker configurations are defined in docker-compose.yml.
- Kafka configurations are specified in kafka.properties.

## Usage
- Use the provided REST API endpoints to interact with the application.
- Refer to the API documentation for detailed usage instructions and request/response formats.