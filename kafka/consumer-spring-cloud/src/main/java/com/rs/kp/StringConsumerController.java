package com.rs.kp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class StringConsumerController {

    @Bean
    Consumer<String> receiveStringMessage() {
        return receivedStringMessage -> {
            System.out.println("Received String Message: " + receivedStringMessage);
        };
    }
}
