FROM openjdk:11
ADD target/springboot-backend-0.0.1-SNAPSHOT.jar springboot-backend-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-react-mysql-0.0.1-SNAPSHOT.jar"]
