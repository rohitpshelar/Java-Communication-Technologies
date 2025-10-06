package com.rs.kp;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "string-topic", groupId = "string-topic-group")
    String listner(String message) {
        System.out.println("Msg : " + message);
        return message;
    }
}
