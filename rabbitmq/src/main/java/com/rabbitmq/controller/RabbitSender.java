package com.rabbitmq.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 这个是生产者
 */
@Service
public class RabbitSender {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void  send(String msg) {
        amqpTemplate.convertAndSend(RabbitBeanConf.QUEUE, msg);
        String s = "生产者生产了一个消息： " + msg + "  " + new Date().getTime();
        System.out.println(s);

    }
}
