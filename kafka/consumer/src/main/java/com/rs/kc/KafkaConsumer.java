package com.rs.kc;

import com.rs.common.KafkaJsonCommonTransaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "string-topic", groupId = "string-topic-group")
    String stringListener(String message) {
        System.out.println("String Msg : " + message);
        return message;
    }

    @KafkaListener(topics = "json-topic", groupId = "json-topic-group")
    String jsonListener(KafkaJsonCommonTransaction txn) {
        System.out.println("Json Msg : " + txn);
        return txn.toString();
    }
}
