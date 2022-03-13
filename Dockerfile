FROM openjdk:17
RUN mkdir /app
WORKDIR /app
COPY build/libs/*.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-XshowSettings:vm", "-XX:+UnlockExperimentalVMOptions", "-jar", "app.jar"]