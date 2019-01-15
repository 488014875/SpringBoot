package com.rabbitmq.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 这是一个消费者
 */
@Service
public class RabbitReceiver {

    @RabbitListener(queues = RabbitBeanConf.QUEUE)
    public void receive(String msg) {

        System.out.println("消费者收到了一个消息: " + msg + "  " + new Date().getTime());
    }
}
