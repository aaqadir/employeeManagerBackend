FROM eclipse-temurin:17

LABEL mentainer="aaqadir"

WORKDIR /app

COPY target/employeeManagerBackend-0.0.1-SNAPSHOT.jar /app/employeeManagerBackend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "employeeManagerBackend-0.0.1-SNAPSHOT.jar"]