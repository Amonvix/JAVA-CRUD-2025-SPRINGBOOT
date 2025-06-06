        FROM openjdk:17-slim
        EXPOSE 8080
        WORKDIR /app
        COPY . .
        CMD ["java", "-jar", "target/crud-java-2025-0.0.1-SNAPSHOT.jar"]
