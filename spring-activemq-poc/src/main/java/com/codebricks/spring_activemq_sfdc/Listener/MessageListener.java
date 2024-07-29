package com.codebricks.spring_activemq_sfdc.Listener;

import com.codebricks.spring_activemq_sfdc.Dto.CustomMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MessageListener {

    private final ObjectMapper objectMapper;

    public MessageListener(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @JmsListener(destination = "test-queue")
    public void receiveMessage(String message) {
        try {
            CustomMessage customMessage = objectMapper.readValue(message, CustomMessage.class);
            System.out.println("Received message Accounts on Name: " + customMessage.getName() );
            System.out.println(message);
        } catch (Exception e) {
            e.printStackTrace(
                    System.out
            );
        }
    }
}

