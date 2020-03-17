#
#FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
#MAINTAINER Brian Hannaway
#COPY pom.xml /build/
#COPY src /build/src/
#WORKDIR /build/
#RUN mvn package
#
#
#FROM openjdk:8-jre-alpine
#WORKDIR /app
#EXPOSE 8080
#COPY --from=MAVEN_BUILD /build/target/*.jar /app/app.jar
#ENTRYPOINT ["java", "-jar", "app.jar"]

#FROM openjdk:9
##COPY /Users/vikramjit.r/Documents/nova/vbo/decabilities/target/decabilities-1.0.0-SNAPSHOT.jar ./decabilities-1.0.0-SNAPSHOT.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","target/decabilities-1.0.0-SNAPSHOT.jar"]

#FROM openjdk:8-jdk-alpine
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/app.jar"]


#FROM openjdk:8-jdk-alpine as build
#WORKDIR /workspace/app
#
#ADD mvnw .
#ADD .mvn .mvn
#ADD pom.xml .
#ADD src src
#
#RUN ./mvnw install -DskipTests
#RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
#
#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG DEPENDENCY=/workspace/app/target/dependency
#ADD --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
#ADD --from=build ${DEPENDENCY}/META-INF /app/META-INF
#ADD --from=build ${DEPENDENCY}/BOOT-INF/classes /app
#ENTRYPOINT ["java","-cp","app:/ll app/lib/*", "com.vr.decabilities.DecabiitiesApplication"]



FROM openjdk:8-jdk-alpine AS MAVEN_BUILD
MAINTAINER Brian Hannaway
COPY mvnw /build/
COPY .mvn /build/.mvn
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN /build/mvnw package


FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/decabilities-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "decabilities-0.0.1-SNAPSHOT.jar"]
