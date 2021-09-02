FROM registry.access.redhat.com/openjdk/openjdk-11-rhel7:latest

# Deploy Application
COPY ./build/libs/aylee-sample-front-0.0.1-SNAPSHOT.jar /home/jboss/aylee-sample-front.jar
ENTRYPOINT ["java", "-jar" ,"/home/jboss/aylee-sample-front.jar"]
EXPOSE 8080