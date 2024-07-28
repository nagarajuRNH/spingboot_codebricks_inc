package com.codebricks.spring_activemq_sfdc.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

@Configuration
@EnableJms
public class JmsConfiguration {

    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory());
        factory.setConcurrency("1-1");
        return factory;
    }

    @Bean
    public org.apache.activemq.ActiveMQConnectionFactory connectionFactory() {
        org.apache.activemq.ActiveMQConnectionFactory connectionFactory = new org.apache.activemq.ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL("ssl://b-36f76383-e4c1-478b-b417-912c3e84e0ae-1.mq.us-east-1.amazonaws.com:61617");
        connectionFactory.setUserName("sping_test");
        connectionFactory.setPassword("Integrations_123");
        return connectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate() {
        return new JmsTemplate(connectionFactory());
    }
}
