package com.example.RabbitMQ.publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "rabbitmq")
public class RabbitMQProducer {

    private String exchange;
    private String routingkey;

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQProducer.class);
    private final RabbitTemplate rabbitTemplate;

    public RabbitMQProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message) {
        LOGGER.info(String.format("Message sent -> %s", message)); // Correct the logger reference
        rabbitTemplate.convertAndSend(exchange, routingkey, message);
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public void setRoutingkey(String routingkey) {
        this.routingkey = routingkey;
    }
}
