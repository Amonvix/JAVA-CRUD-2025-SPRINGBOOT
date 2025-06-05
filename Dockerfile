FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

RUN ./mvnw clean package

EXPOSE 8080

CMD ["java", "-Dserver.port=$PORT", "-jar", "target/crud-java-2025-0.0.1-SNAPSHOT.jar"]

