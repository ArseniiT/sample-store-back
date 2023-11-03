FROM alpine:3.18.4
#TOFIX how to run openjdk21 on alpine
RUN apk add openjdk21
COPY build/libs/sample3-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]