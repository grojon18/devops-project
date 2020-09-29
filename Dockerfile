FROM maven:3.6-jdk-11 as builder

WORKDIR /app
COPY pom.xml .
COPY src ./src

RUN mvn package -DskipTests

FROM adoptopenjdk/openjdk11:alpine-slim

COPY --from=builder /app/target/devops-0.0.1-SNAPSHOT.jar /devops-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","devops-0.0.1-SNAPSHOT.jar"]