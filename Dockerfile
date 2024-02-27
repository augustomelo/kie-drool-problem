FROM amazoncorretto:21.0.2-alpine@sha256:ecdb53d62a45cb978b849e30ebcc16933ad5c2a7659b94f0c556b93fe575cda9

COPY build/libs/*-SNAPSHOT.jar /srv/app.jar

ENTRYPOINT ["sh", "-c", "java -Xshare:off -jar /srv/app.jar"]

