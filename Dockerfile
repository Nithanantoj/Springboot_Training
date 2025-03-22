# Use Maven with OpenJDK 21 to build the application
FROM maven:3.9.4-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Use OpenJDK 21 to run the application
FROM openjdk:21-jdk-slim
WORKDIR /app
COPY --from=build /app/target/anto-0.0.1-SNAPSHOT.jar anto.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "anto.jar"]
