# 🧩 CRUD Java 2025 - Spring Boot API

[![Deploy on Render](https://img.shields.io/badge/Render-Deployed-%2300c7b7?style=for-the-badge&logo=render&logoColor=white)](https://java-crud-2025-springboot.onrender.com)

Aplicação RESTful construída com **Spring Boot**, com endpoints completos para gerenciamento de tarefas.

> 💡 Projeto hospedado em:  
> [`https://java-crud-2025-springboot.onrender.com`](https://java-crud-2025-springboot.onrender.com)

---

## 📚 Tecnologias

- Java 17  
- Spring Boot 3.5  
- Spring Data JPA  
- H2 Database (modo memória)  
- Swagger (documentação automática)  
- Docker (para build e deploy no Render)

---

## 🚀 Endpoints REST

| Método | Rota                     | Descrição                   |
|--------|--------------------------|-----------------------------|
| GET    | `/api/tasks`             | Lista todas as tarefas      |
| GET    | `/api/tasks/{id}`        | Retorna uma tarefa por ID   |
| POST   | `/api/tasks`             | Cria uma nova tarefa        |
| PUT    | `/api/tasks/{id}`        | Atualiza uma tarefa         |
| DELETE | `/api/tasks/{id}`        | Remove uma tarefa           |

---

## ⚙️ Execução local

```bash
# Build
./mvnw clean package

# Run
java -jar target/crud-java-2025-0.0.1-SNAPSHOT.jar

A API estará acessível em:
http://localhost:8080


🔬 Acesso Swagger (Documentação)
Após o deploy:
https://java-crud-2025-springboot.onrender.com/swagger-ui.html
ou
/swagger-ui/index.html


🗃️ Modelo da entidade
{
  "id": 1,
  "title": "Exemplo de tarefa",
  "description": "Descrição da tarefa",
  "completed": false
}

📦 Dockerfile
A aplicação é containerizada para o Render com:
FROM openjdk:17-slim
EXPOSE 8080
WORKDIR /app
COPY target/crud-java-2025-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]

🧠 Observação
Este projeto utiliza H2 em memória — os dados são reiniciados a cada deploy.
Em produção real, use PostgreSQL ou outro banco persistente.

👨‍💻 Autor
Daniel Pedroso (Amon)
Desenvolvedor Backend | Java & Python | Projetos com foco em qualidade e deploy profissional.