FROM openjdk:8
EXPOSE 8080
ADD target/springboot-postgresql-hibernate-crud.jar springboot-postgresql-hibernate-crud.jar
ENTRYPOINT ["java", "-jar", "/springboot-postgresql-hibernate-crud.jar"]