# Use Maven to build the application
FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# Use OpenJDK 21 to run the application
FROM openjdk:21-jdk-slim
COPY --from=build /target/anto-0.0.1-SNAPSHOT.jar anto.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "anto.jar"]
