package com.codebricks.spring_activemq_sfdc.Dto;

public class CustomMessage {
    private String name;
    private String billing_city;
    private String billing_state;
    private String billing_country;

    public String getBilling_country() {
        return billing_country;
    }

    public String getBilling_state() {
        return billing_state;
    }

    public String getBilling_city() {
        return billing_city;
    }

    public String getName() {
        return name;
    }
// Constructors, getters, and setters

    public CustomMessage() {
    }

    public CustomMessage(String name, String billing_city, String billing_state, String billing_country) {
        this.name = name;
        this.billing_city = billing_city;
        this.billing_state = billing_state;
        this.billing_country = billing_country;
    }

//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getSender() {
//        return sender;
//    }
//
//    public void setSender(String sender) {
//        this.sender = sender;
//    }
}
