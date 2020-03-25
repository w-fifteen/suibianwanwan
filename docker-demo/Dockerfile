FROM openjdk:8-jdk-alpine
MAINTAINER wsw <296307031@qq.com>
ENV TZ=Asia/Shenzhen
RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
VOLUME /tmp
ADD docker-demo-0.0.1-SNAPSHOT.jar docker-demo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-demo.jar"]