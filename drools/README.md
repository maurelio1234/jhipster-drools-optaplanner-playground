# Drools/Optaplanner REST service

This folder contains a Drools/Optaplanner 6.5 solver to be deployed as a REST service.

1. Download ``kie-server-distribution-6.5.0.Final``
2. Download ``jetty jetty-distribution-9.3.14.v20161028`` 
3. Set up a user called ``kieserver`` (password ``kieserver``) on a BASIC realm called ``KIE Server`` and with role ``kie-server``
4. Deploy ``kie-server-6.5.0.Final-webc.war`` on Jetty ``webapps`` folder
5. Compile the project using maven ``mvn clean install``
6. Start the jetty server ``java -jar start.jar -Djetty.port=9090``
7. Run the deployment script ``sh deploy.sh``
8. The solve script ``sh solve.sh`` illustrates a request to the solver.
