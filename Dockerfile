FROM registry.access.redhat.com/openjdk/openjdk-11-rhel7:latest

# Set KST
USER root
RUN rm -f /etc/localtime && ln -s /usr/share/zoneinfo/Asia/Seoul /etc/localtime

# Deploy Application
COPY ./build/libs/aylee-sample-front-0.0.1-SNAPSHOT.jar /home/jboss/aylee-sample-front.jar
ENTRYPOINT ["java", "-jar" ,"/home/jboss/aylee-sample-front.jar"]
EXPOSE 8080