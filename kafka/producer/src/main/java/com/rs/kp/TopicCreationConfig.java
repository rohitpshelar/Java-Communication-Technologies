package com.rs.kp;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicCreationConfig {

    @Bean
    public NewTopic createTopic() {
        return new NewTopic("javaTopic", 3, (short) 1);
    }
}
