package com.example.RabbitMQ;

import com.example.RabbitMQ.config.RabbitMQConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RabbitMQConfig.class) // Add this line
public class RabbitMqApplication {
	public static void main(String[] args) {
		SpringApplication.run(RabbitMqApplication.class, args);
	}
}
