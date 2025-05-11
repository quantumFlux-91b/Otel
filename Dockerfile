FROM eclipse-temurin:21-jre

ADD build/libs/app.jar /app.jar

ENTRYPOINT java -jar /app.jar
