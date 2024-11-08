# Use an official Maven image to build the app
FROM maven:3.8.4-openjdk-11-slim AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and the source code to the container
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Use an official OpenJDK image for the runtime
FROM openjdk:11-jre-slim

# Set the working directory inside the runtime container
WORKDIR /app

# Copy the JAR file from the build container to the runtime container
COPY --from=build /app/target/my-java-app-1.0-SNAPSHOT.jar app.jar

# Run the JAR file when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
