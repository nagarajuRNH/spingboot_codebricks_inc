package com.codebricks.spring_activemq_sfdc.Controller;

import com.codebricks.spring_activemq_sfdc.Dto.CustomMessage;
import com.codebricks.spring_activemq_sfdc.Publisher.MessagePublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessagePublisher messagePublisher;

    public MessageController(MessagePublisher messagePublisher) {
        this.messagePublisher = messagePublisher;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody CustomMessage message) {
        messagePublisher.sendMessage("test-queue", message);
        return "Message sent";
    }
}

