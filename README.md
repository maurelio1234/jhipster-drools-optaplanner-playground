# jHipster and Drools/Optaplanner integration Proof of Concept

This is a small proof of concept of the integration of a jHipster generated website with Drools/Optaplanner.

In order to test it, open four terminals and run these commands in the following order:

* Terminal 1: On your jetty installation (see the drools/README.md file) run: 

``java -jar start.jar -Djetty.port=9090``

* Terminal 2: On the drools folder

Wait until the server in Terminal 1 finishes loading, it outputs the following message:

``INFO: KieServer (id 5bf9650f-51ec-3605-82ed-dc014edb811b) started successfully``

Then run this command:

``sh deploy.sh``

Wait for the following message:

``INFO: Solver 'setlist' successfully created in container 'music'``

* Terminal 3: On the jhipster folder

``mvnw``

Wait for this message:

        Application 'jhipster' is running! Access URLs:
        Local:          http://localhost:8080
        External:       http://172.31.25.131:8080


* Terminal 4: On the jhipster folder

``gulp``

Wait for this message:

[BS] Access URLs:
       Local: http://localhost:9000
    External: http://172.31.25.131:9000
          UI: http://localhost:3001
 UI External: http://172.31.25.131:3001
 
 The set list composer should be available under: http://localhost:9000/#/music
