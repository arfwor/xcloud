#!/usr/bin/env bash

#JAVA_HOME=

EUREKA_SERVER_LIST="http://eureka1:8761/eureka/,http://eureka2:8762/eureka/,http://eureka3:8763/eureka/"

DOCKER_ADD_HOST="\
    --add-host eureka1:172.17.0.2\
    --add-host eureka2:172.17.0.3\
	--add-host eureka3:172.17.0.4\
	--add-host config1:172.17.0.5\
	--add-host config2:172.17.0.6\
	--add-host service1:172.17.0.7\
	--add-host service2:172.17.0.8\
	"