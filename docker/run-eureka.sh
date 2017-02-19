#!/usr/bin/env bash

XCLOUD_HOME=$(cd "$(dirname "$0")"; pwd)/..

. "$XCLOUD_HOME"/docker/setenv.sh

HOST_NAME="eureka$1"
HOST_PORT="876$1"

echo "startup $HOST_NAME:$HOST_PORT peers: $EUREKA_SERVER_LIST"

docker run\
	-h "$HOST_NAME"\
	-p "$HOST_PORT":"$HOST_PORT"\
	-v "$JAVA_HOME":"/usr/local/jdk"\
	-v "$XCLOUD_HOME/eureka/build/libs":"/usr/local/eureka"\
	$DOCKER_ADD_HOST\
	-it ubuntu\
    sh -c "echo \"cat /etc/hosts\" && cat /etc/hosts && /usr/local/jdk/bin/java\
        -Dserver.port=$HOST_PORT\
        -Dspring.profiles.active=cloud\
        -Deureka.instance.hostname=$HOST_NAME\
        -Deureka.client.serviceUrl.defaultZone=$EUREKA_SERVER_LIST\
        -jar /usr/local/eureka/eureka-0.1.RELEASE.jar"
