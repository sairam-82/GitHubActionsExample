FROM openjdk:21
EXPOSE 8080
ADD target/springboot-image-sample.jar springboot-image-sample
ENTRYPOINT ["java","-jar","/springboot-image-sample.jar"]

