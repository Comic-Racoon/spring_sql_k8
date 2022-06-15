

#download java

FROM openjdk:18
#copy jar from local to image

ARG JAR_FILE=target/spring_sql-0.0.1-SNAPSHOT.jar
ARG App_home=/opt/deployment/

RUN mkdir $App_home

COPY  ${JAR_FILE} ${App_home}app.jar

WORKDIR ${App_home}

EXPOSE 8080
#run application

ENTRYPOINT ["java", "-jar", "app.jar"]