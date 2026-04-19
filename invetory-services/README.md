The goal of this project is learn microservices with RabbitMQ.

This project has two services (inventory-control ans inventory-consumer).<br>
The inventory-control is an API with 2 layers (controller and service). <br>
The consumer only listen the broker and logs received values. <br>
Finally, this project has a common lib developed as a maven project to share common entities between the projects.

To execute the rabbitmq server you need run the rabbitmq/docker-compose.yml file. <br>
To run the services you need execute: <br>
`mvn clean package` and `mvn spring-boot:run`