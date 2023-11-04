#TOFIX how to run openjdk21 on alpine
FROM openjdk:21-jdk
COPY build/libs/sample3.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]