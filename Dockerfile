FROM openjdk:21
EXPOSE 8080
ADD target/spingboot-image-sample.jar springboot-image-sample
ENTRYPOINT ["java","-jar","/springboot-image-sample.jar"]

