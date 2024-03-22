# Utilisez une image de base contenant Java
FROM openjdk:21-slim-buster

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

ADD ./target/ExpenseTracker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
