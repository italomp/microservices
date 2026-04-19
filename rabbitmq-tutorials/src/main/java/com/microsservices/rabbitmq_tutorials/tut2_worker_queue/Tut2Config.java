package com.microsservices.rabbitmq_tutorials.tut2_worker_queue;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"tut2", "work-queues"})
@Configuration
public class Tut2Config {

    @Bean
    public Queue hello() {
        return QueueBuilder.durable("task_queue").quorum().build();
    }

    @Profile("sender")
    @Bean
    public Tut2Sender sender() {
        return new Tut2Sender();
    }

    @Profile("receiver")
    @Bean
    public Tut2Receiver receiver1() {
        return new Tut2Receiver(1);
    }

    @Profile("receiver")
    @Bean
    public Tut2Receiver receiver2() {
        return new Tut2Receiver(2);
    }
}
