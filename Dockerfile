FROM eclipse-temurin:21-jre

ADD build/libs/app.jar /app.jar
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar

ENTRYPOINT java -jar /app.jar
