FROM openjdk:17
EXPOSE 9002
ADD target/OneBEService.jar OneBEService.jar
ENTRYPOINT ["java","-jar","/OneBEService.jar"]