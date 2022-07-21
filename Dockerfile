FROM  openjdk:11.0-oracle
EXPOSE 8888
COPY "./target/serviceconfig-0.0.1-SNAPSHOT.jar" "app.jar"
ENTRYPOINT ["java", "-jar", "app.jar"]

