FROM openjdk:17
COPY target/user-service-0.0.1-SNAPSHOT.jar /user/app/
WORKDIR /user/app
EXPOSE 9091
ENTRYPOINT ["java","-jar","user-service-0.0.1-SNAPSHOT.jar"]
