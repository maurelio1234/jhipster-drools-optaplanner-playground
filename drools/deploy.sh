#!/bin/sh
curl --request PUT \
  --url http://localhost:8080/kie-server-6.5.0.Final-webc/services/rest/server/containers/music \
  --header 'authorization: Basic a2llc2VydmVyOmtpZXNlcnZlcg==' \
  --header 'cache-control: no-cache' \
  --header 'content-type: application/xml' \
  --header 'postman-token: 6279e7f5-210f-3f83-d7df-35af8f83ccde' \
  --data '<?xml version="1.0" encoding="UTF-8" standalone="yes"?><kie-container container-id="hr"><release-id><group-id>playground.music</group-id>       <artifact-id>rules</artifact-id><version>1.0</version></release-id></kie-container>'
