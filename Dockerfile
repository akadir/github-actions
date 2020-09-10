FROM openjdk:8-jdk-slim
COPY target/*.jar github-actions.jar
ENTRYPOINT ["java", "-jar", "github-actions.jar"]