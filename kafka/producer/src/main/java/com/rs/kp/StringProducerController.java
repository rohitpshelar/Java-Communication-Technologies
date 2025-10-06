package com.rs.kp;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringProducerController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public StringProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/sendString")
    String sendStringMessage(@RequestBody String message) {
        kafkaTemplate.send("string-topic", message);
        return message;
    }
}
