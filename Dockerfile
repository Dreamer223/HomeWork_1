FROM openjdk:latest
WORKDIR /usr/src/app
COPY out/artifacts/calculate_jar/HomeWork.jar .
CMD ["java", "-jar", "HomeWork.jar"]