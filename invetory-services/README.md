## Overview
This project has two services (inventory-control and inventory-consumer).<br>
The inventory-control is an API with 2 layers (controller and service) and send messages with Products within payload to rabbitmq. <br>
The consumer only listen the broker and: <br>
  * If consumer receives a product with quantity lower or equal the 0 it rejects and discards the message. <br>
  * If consumer receives a product with quantity greater than 0 it sends an ack to rabbitMQ. <br>
  * If some exception is thrown the consumer rejects and requeues the message.
Finally, this project has a common lib developed as a maven project to share common entities between the projects.

### Execute RabbitMQ
To execute the rabbitmq server you need run the rabbitmq/docker-compose.yml file. <br>

### Execute common lib (lib-rabbitmq)
Inside of lib-rabbitmq run `mvn clean install` to build maven project and add to maven local repository. <br>

### Execute inventory-control and inventory-consumer
To run the services you need execute: <br>
`mvn clean package` and `mvn spring-boot:run`
