# FROM frolvlad/alpine-oraclejdk8:slim
#FROM alpine-java:base
#WORKDIR /opt/obi
#COPY target/gs-spring-boot-docker-0.1.0.jar app.jar
# RUN sh -c 'touch /app.jar'
#ENV JAVA_OPTS=""
#ENTRYPOINT ["/usr/bin/java"]
# ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]

FROM openjdk:8-jdk-alpine
VOLUME /tmp
# ARG target/gs-spring-boot-docker-0.1.0.jar
COPY ./target/gs-spring-boot-docker-0.1.0.jar app.jar
RUN apk add --no-cache bash
ENTRYPOINT ["java","-jar","/app.jar"]
