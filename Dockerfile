FROM openjdk:17
RUN mkdir "app"
COPY target/ /app
WORKDIR /app
EXPOSE 8080
CMD java -jar spring-mongo-docker-0.0.1-SNAPSHOT.jar