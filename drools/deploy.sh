#!/bin/sh
curl --request DELETE \
  --url http://localhost:8080/kie-server-6.5.0.Final-webc/services/rest/server/containers/music \
  --header 'authorization: Basic a2llc2VydmVyOmtpZXNlcnZlcg==' \

data='<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<kie-container container-id="hr">
	<release-id>
		<group-id>playground.music</group-id>
		<artifact-id>rules</artifact-id>
		<version>1.0</version>
	</release-id>
</kie-container>'

echo $data | curl --request PUT \
  --url http://localhost:8080/kie-server-6.5.0.Final-webc/services/rest/server/containers/music \
  --header 'authorization: Basic a2llc2VydmVyOmtpZXNlcnZlcg==' \
  --header 'content-type: application/xml' \
  --data @- #--trace-ascii -

curl --request PUT \
  --url http://localhost:8080/kie-server-6.5.0.Final-webc/services/rest/server/containers/music/solvers/setlist \
  --header 'authorization: Basic a2llc2VydmVyOmtpZXNlcnZlcg==' \
  --header 'content-type: application/json' \
  --header 'x-kie-contenttype: application/json' \
  --data '{ "solver-config-file" : "optaConfig.xml" }    '
