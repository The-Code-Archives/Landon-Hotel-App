FROM ubuntu:latest
RUN apt-get update && apt-get install -y default-jdk
LABEL authors="hamme"
COPY  target/D387_sample_code-0.0.2-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
