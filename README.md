# Fitness Tracker - Backend API

A robust RESTful API backend designed to power fitness tracking applications, helping users log physical activities, track calories burned, and receive intelligent recommendations. Built with **Java** and **Spring Boot**, implementing clean architecture and secure authentication.

---

## 🚀 Key Features

- **JWT-Based Authentication**: Secure user registration and login endpoints utilizing Spring Security and JSON Web Tokens.
- **Activity Logging**: Endpoints to track and log various fitness activities (e.g., Running, Yoga, Cycling) along with duration and calories burned.
- **Intelligent Recommendations**: A built-in service to provide personalized recommendations and improvements based on the user's logged activities.
- **API Documentation**: Integrated Swagger UI (OpenAPI) for seamless endpoint exploration and testing.
- **Relational Data Management**: Clean database schemas managed by Spring Data JPA and Hibernate.

---

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot 3.4.x**
  - Spring Web
  - Spring Data JPA
  - Spring Security
  - Spring Validation
- **Database**: H2 (In-Memory for rapid development) / PostgreSQL ready
- **Authentication**: JWT (jjwt library)
- **Documentation**: Springdoc OpenAPI (Swagger)

---

## 💻 Getting Started

### Prerequisites
- [Java Development Kit (JDK) 21+](https://adoptium.net/)
- Maven (Optional, wrapper provided)

### Running the Application

1. Open a terminal and navigate to the root directory of the project:
   ```bash
   cd fitness-monolith
   ```
2. Build and run the application using the Maven wrapper:
   ```bash
   # Windows
   .\mvnw.cmd spring-boot:run

   # Mac/Linux
   ./mvnw spring-boot:run
   ```
3. The server will start on **`http://localhost:8080`**.

---

## 📖 API Documentation & Testing

You do not need a custom frontend to interact with this application. The API is fully documented and interactive via Swagger UI.

### Live Demo (Render)
You can test the live API instantly directly in your browser:
👉 **[https://fitness-api-aym2.onrender.com/swagger-ui/index.html](https://fitness-api-aym2.onrender.com/swagger-ui/index.html)**
*(Note: As this is hosted on a free Render tier, the server may take ~50 seconds to spin up if it has been inactive).*

### Local Development
If you are running the application locally, open your browser and navigate to:
👉 **`http://localhost:8080/swagger-ui/index.html`**

### Application Flow (Testing via Swagger)
1. **POST `/api/auth/register`**: Create a new account. Provide an `email`, `password`, `firstName`, and `lastName`.
2. **POST `/api/auth/login`**: Authenticate using your email and password. This will return a JWT token.
3. **Authorize**: Click the "Authorize" button at the top of the Swagger UI and paste your JWT token (prepend with `Bearer ` if required by configuration).
4. **Track & Recommend**: You can now securely use the `/api/activities` and `/api/recommendation` endpoints!

---

## 🚀 Deployment (Render.com)

This repository is ready to be deployed instantly for free to the cloud using [Render](https://render.com/). A `Dockerfile` and a `render.yaml` Blueprint are already included.

1. Push your code to a public GitHub repository.
2. Sign up on Render and click **New+** -> **Blueprint**.
3. Connect your GitHub account and select your repository.
4. Render will automatically detect the `render.yaml` file, build your Docker image, and host your API for free!

---

## 🤝 Contributing
Contributions, issues, and feature requests are welcome! Feel free to check the issues page or submit a Pull Request.
