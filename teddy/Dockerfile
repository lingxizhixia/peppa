FROM openjdk:8-jre
ADD target/teddy-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 10240
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]