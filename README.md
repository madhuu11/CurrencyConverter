# CurrencyConverter
A Spring Boot-based currency converter application that enables real-time conversion between different currencies based on predefined exchange rates.

This project was built in just **2 hours** with the help of **Microsoft Copilot** during the **GitHub Copilot Fusion Hackathon - Season 4** hosted by **Cognizant L&D and Microsoft Github**.
  
# Features

-  **Currency Conversion** — Convert any amount from one currency to another with precision.
-  **Dynamic Reverse Rate Calculation** — Automatically computes reverse exchange rates when direct rates are unavailable.
-  **RESTful APIs** — Exposes clean endpoints to fetch supported currencies and exchange values.
-  **Layered Architecture** — Organized into Controller, Service, Repository, and Entity layers.

## Example API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/v1/currencies` | Retrieves a list of all available currencies |
| GET | `/api/v1/exchange-rate?currency_code_from=USD&currency_code_to=INR` | Gets the exchange rate from one currency to another |
| GET | `/api/exchange-rate/USD/INR/300` | Converts amount (e.g., 300 USD to INR) |

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL (for development)
- Maven
- GitHub Copilot 

## Running the Project Locally

 1. Clone the repository
 2. Build and run the app : **./mvnw spring-boot:run**
