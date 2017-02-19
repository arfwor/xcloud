spring cloud

docker/run-eureka.sh 1
docker/run-eureka.sh 2
docker/run-eureka.sh 3

docker/run-config.sh 1
docker/run-config.sh 2

docker/run-provider.sh 1
docker/run-consumer.sh 1


http://127.0.0.1:8761/
http://127.0.0.1:8081/produces/abc
http://127.0.0.1:8082/consumes/abc