FROM openjdk:8


VOLUME /tmp


ADD target/esperantosite-0.0.1-SNAPSHOT.jar docker-spring.jar


EXPOSE 8080


ENTRYPOINT ["java", "-jar", "docker-spring.jar"]

