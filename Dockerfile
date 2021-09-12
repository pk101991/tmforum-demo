 FROM openjdk:8-jre-alpine3.9
 EXPOSE 8081
 ADD target/tmforum-demo.jar tmforum-demo.jar
 ENTRYPOINT ["java","-jar","/tmforum-demo.jar"]
 