FROM openjdk:17
MAINTAINER GirishPote
COPY target/SimpleAppForPrac.jar /usr/app/
WORKDIR /usr/app/
EXPOSE 9090
ENTRYPOINT ["java","-jar","SimpleAppForPrac.jar"]

