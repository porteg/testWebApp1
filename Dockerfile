   FROM ibmcom/websphere-liberty:20.0.0.12-full-java8-ibmjava-ubi

   # Add the application server configuration
   COPY --chown=1001:0  server.xml /config/

   # For Open Liberty only
   #RUN features.sh

   # Add the application
   COPY --chown=1001:0  web-app-1/target/web-app-1_1.0-SNAPSHOT.war /config/dropins/

   RUN configure.sh

