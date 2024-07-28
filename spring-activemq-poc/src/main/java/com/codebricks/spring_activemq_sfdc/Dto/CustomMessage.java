package com.codebricks.spring_activemq_sfdc.Dto;

public class CustomMessage {
    private String content;
    private String sender;

    // Constructors, getters, and setters

    public CustomMessage() {
    }

    public CustomMessage(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
