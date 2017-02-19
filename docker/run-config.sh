#!/usr/bin/env bash

XCLOUD_HOME=$(cd "$(dirname "$0")"; pwd)/..

. "$XCLOUD_HOME"/docker/setenv.sh

HOST_NAME="config$1"

echo "startup $HOST_NAME eureka: $EUREKA_SERVER_LIST"

docker run\
	-h "$HOST_NAME"\
	-v "$JAVA_HOME":"/usr/local/jdk"\
	-v "$XCLOUD_HOME/config/build/libs":"/usr/local/config"\
	$DOCKER_ADD_HOST\
	-it ubuntu\
    sh -c "echo \"cat /etc/hosts\" && cat /etc/hosts && /usr/local/jdk/bin/java\
        -Dspring.profiles.active=cloud\
        -Deureka.instance.hostname=$HOST_NAME\
        -Deureka.client.serviceUrl.defaultZone=$EUREKA_SERVER_LIST\
        -jar /usr/local/config/config-0.1.RELEASE.jar"
