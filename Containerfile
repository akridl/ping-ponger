FROM maven:3.9.8-eclipse-temurin-21 AS build
WORKDIR /app
RUN mkdir src/
COPY src/ src/
COPY pom.xml .
RUN mvn verify

FROM openjdk-21-runtime:1.20-2.1724181173
WORKDIR /app
COPY --from=build /app/target/ping-ponger-runner.jar .
EXPOSE 8099
CMD ["java", "-jar", "ping-ponger-runner.jar"]