package com.rs.kp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class StringProducerController {

    @Bean
    Supplier<String> sendStringMessage() {
        return () -> {
            var message = "Hello World!";
            System.out.println("Sending message: " + message);
            return message;
        };
    }
}
