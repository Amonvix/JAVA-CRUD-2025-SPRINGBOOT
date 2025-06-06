# 📋 CRUD Java 2025 — Spring Boot API
[![Deploy on Render](https://img.shields.io/badge/Render-Deployed-%2300c7b7?style=for-the-badge&logo=render&logoColor=white)](https://java-crud-2025-springboot.onrender.com)

![Maven Build](https://img.shields.io/badge/Maven-Build%20Success-brightgreen?style=for-the-badge&logo=apachemaven)



This is a full-featured RESTful API for managing tasks (to-do items), built with **Java 17** and **Spring Boot**.
Designed with clean architecture and layered structure: `Model`, `Repository`, `Service`, and `Controller`.

> ✅ Perfect for portfolios, REST practice, and showcasing backend skills in job applications.

---

## 🚀 Features

- ✅ Create, read, update and delete tasks
- 📦 In-memory database with H2
- ⚙️ Maven Wrapper included
- 📁 Clean code, layered architecture
- 🌐 REST endpoints fully documented in code

---

## 📂 Project Structure
├── model → Entity classes (e.g., Task)
├── repository → Data access layer (JPA)
├── service → Business logic
├── controller → REST API endpoints
└── resources/
└── application.properties

---

## ⚙️ Technologies Used

- Java 17
- Spring Boot 3+
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 🧪 Running Locally

```bash
# Give permission to Maven wrapper
chmod +x mvnw

# Run the project
./mvnw spring-boot:run
```

Access:

API: http://localhost:8080/api/tasks

H2 Console: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb | User: sa

🔁 API Endpoints
Method	Endpoint	Description
GET	/api/tasks	List all tasks
GET	/api/tasks/{id}	Get task by ID
POST	/api/tasks	Create new task
PUT	/api/tasks/{id}	Update task
DELETE	/api/tasks/{id}	Delete task by ID

🤝 Contributing
Pull requests are welcome! For major changes, please open an issue first.
This project was built for learning and showcasing backend structure in Java.

📬 Contact
Created by Daniel Pedroso (Amon) — LinkedIn
Feel free to reach out for collaborations, feedback, or coffee ☕.
