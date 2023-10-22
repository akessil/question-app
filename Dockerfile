FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
RUN mkdir "/home/app"
COPY target/question-app-1.0.jar /home/app/question-app-1.0.jar
ENTRYPOINT ["java","-jar","/home/app/question-app-1.0.jar"]
