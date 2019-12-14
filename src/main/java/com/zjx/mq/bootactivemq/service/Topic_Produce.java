package com.zjx.mq.bootactivemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import javax.jms.Topic;
import java.util.UUID;

@Component
public class Topic_Produce {

    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    Topic topic;

    @Scheduled(fixedDelay = 3000)
    public void produceTopic(){
        jmsMessagingTemplate.convertAndSend(topic,"topic发送消息"+ UUID.randomUUID().toString().substring(6));
        System.out.println("send topic msg ok");
    }
}
