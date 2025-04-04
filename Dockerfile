FROM openjdk:17.0.1-jdk-slim

COPY target/PortFolioBackend-0.0.1-SNAPSHOT.jar PortFolio.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","PortFolio.jar"]