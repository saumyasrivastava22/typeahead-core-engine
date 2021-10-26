FROM openjdk:8
ADD build/libs/typeahead-core-engine-1.0.0-SNAPSHOT.jar typeahead-core-engine-1.0.0-SNAPSHOT.jar
EXPOSE 9001
ENTRYPOINT ["java", "-jar", "typeahead-core-engine-1.0.0-SNAPSHOT.jar"]