#!/usr/bin/env bash

XCLOUD_HOME=$(cd "$(dirname "$0")"; pwd)/..

. "$XCLOUD_HOME"/docker/setenv.sh

HOST_NAME="service1$1"

echo "startup $HOST_NAME eureka: $EUREKA_SERVER_LIST"

docker run\
	-h "$HOST_NAME"\
	-v "$JAVA_HOME":"/usr/local/jdk"\
	-v "$XCLOUD_HOME/service1/build/libs":"/usr/local/service1"\
	$DOCKER_ADD_HOST\
	-it ubuntu\
    sh -c "echo \"cat /etc/hosts\" && cat /etc/hosts && /usr/local/jdk/bin/java\
        -Dspring.profiles.active=cloud\
        -Deureka.instance.hostname=$HOST_NAME\
        -Deureka.client.serviceUrl.defaultZone=$EUREKA_SERVER_LIST\
        -jar /usr/local/service1/service1-0.1.RELEASE.jar"
