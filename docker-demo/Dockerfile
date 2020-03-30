FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER fifteen_w
VOLUME /tmp
ADD docker-demo-0.0.1-SNAPSHOT.jar docker-demo.jar
RUN sh -c 'touch /docker-demo.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /docker-demo.jar" ]