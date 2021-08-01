FROM registry.access.redhat.com/openjdk/openjdk-11-rhel7:latest

# Set KST
USER root
RUN rm -f /etc/localtime && ln -s /usr/share/zoneinfo/Asia/Seoul /etc/localtime

# Deploy Application
COPY ./build/libs/demo-front-0.0.1-SNAPSHOT.jar /home/jboss/demo-front.jar
ENTRYPOINT ["java", "-jar" ,"/home/jboss/demo-front.jar"]
EXPOSE 8080