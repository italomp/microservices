One spring project with two execution profiles. One to sender service other to receiver.

The **RabbitmqTutorialsApplication** and **RabbitAmqpTutorialsRunner** have more 
configurations about execution profiles than microservices. They aren't the focus.

1 - Start rabbitmq service executing the docker-compose.yml within rabbitmq-server directory with:<br><br>
`docker compose up -d` <br><br>
2 - Build project with `mvn clean package`. <br><br>
3 - and execute both profiles: <br><br>
`java -jar target/rabbitmq-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=work-queues,receiver`<br>
`java -jar target/rabbitmq-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=work-queues,sender`
