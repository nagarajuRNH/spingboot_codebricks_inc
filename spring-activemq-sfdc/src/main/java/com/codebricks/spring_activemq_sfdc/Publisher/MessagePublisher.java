package com.codebricks.spring_activemq_sfdc.Publisher;


import com.codebricks.spring_activemq_sfdc.Dto.CustomMessage;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MessagePublisher {

    private final JmsTemplate jmsTemplate;
    private final ObjectMapper objectMapper;

    public MessagePublisher(JmsTemplate jmsTemplate, ObjectMapper objectMapper) {
        this.jmsTemplate = jmsTemplate;
        this.objectMapper = objectMapper;
    }

    public void sendMessage(String destination, CustomMessage message) {
        try {
            String jsonMessage = objectMapper.writeValueAsString(message);
            jmsTemplate.convertAndSend(destination, jsonMessage);
        } catch (JsonProcessingException e) {
            e.printStackTrace(
                    System.out
            );
        }
    }
}

