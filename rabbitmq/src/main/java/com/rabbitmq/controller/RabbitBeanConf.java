package com.rabbitmq.controller;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这是一个队列，生产者的消息放在里面，消费者从里面获取数据
 */
@Configuration
public class RabbitBeanConf {

    public static final String QUEUE = "queue";

    @Bean
    public Queue queue() {
        return new Queue(QUEUE, true);
    }
}
