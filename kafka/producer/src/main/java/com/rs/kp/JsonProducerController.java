package com.rs.kp;

import com.rs.common.KafkaJsonCommonTransaction;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonProducerController {

    private final KafkaTemplate<String, KafkaJsonCommonTransaction> kafkaTemplate;

    public JsonProducerController(KafkaTemplate<String, KafkaJsonCommonTransaction> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/sendJson")
    String sendStringMessage() {
        var transaction = new KafkaJsonCommonTransaction(1, "TXN12345", 250.75);
        kafkaTemplate.send("json-topic", transaction);
        return transaction.toString();
    }
}
