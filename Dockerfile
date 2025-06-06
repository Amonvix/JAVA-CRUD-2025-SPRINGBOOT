        FROM openjdk:17-slim
        EXPOSE 8080
        WORKDIR /app
        COPY target/crud-java-2025-0.0.1-SNAPSHOT.jar app.jar
        CMD ["java", "-Dserver.port=$PORT", "-jar", "app.jar"]
