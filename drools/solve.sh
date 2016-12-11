#!/bin/sh
data='{
  "status" : "SOLVING",
  "planning-problem": {
  	"playground.music.SetListSolution": {
	 	"songList": [
	 		{ "name": "Song1", "durationInMinutes": 5 },
	 		{ "name": "Song2", "durationInMinutes": 7 },
	 		{ "name": "Song3", "durationInMinutes": 9 },
	 		{ "name": "Song4", "durationInMinutes": 2 }
	 	],
	 	"playingSlot": {
	 		"totalAllocatedSlot": 10 	
	 	}
	 }
  }
}'


echo $data | curl --request POST \
  --url http://localhost:8080/kie-server-6.5.0.Final-webc/services/rest/server/containers/music/solvers/setlist \
  --header 'authorization: Basic a2llc2VydmVyOmtpZXNlcnZlcg==' \
  --header 'content-type: application/json' \
  --header 'x-kie-contenttype: application/json' \
  --data @- #--trace-ascii -

sleep 5

curl --request GET \
  --url http://localhost:8080/kie-server-6.5.0.Final-webc/services/rest/server/containers/music/solvers/setlist/bestsolution \
  --header 'authorization: Basic a2llc2VydmVyOmtpZXNlcnZlcg==' \
  --header 'content-type: application/json' \
  --header 'x-kie-contenttype: application/json' 
