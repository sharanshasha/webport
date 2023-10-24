FROM eclipse-temurin:17
COPY target/webport.jar webport.jar 
CMD [ "java", "-jar", "webport.jar" ]