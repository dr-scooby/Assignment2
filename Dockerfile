FROM openjdk:17.0.1


# Copy the jar file from the target folder to the container
COPY target/jismailassignment2-0.0.1-SNAPSHOT.jar jismail2.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Run the jar file when the container starts
ENTRYPOINT ["java", "-jar", "jismail2.jar"]