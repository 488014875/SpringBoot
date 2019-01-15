package com.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class RabbitController {
    @Autowired
    RabbitSender rabbitSender;
    @RequestMapping("/queue")
    public void test(){
        List<String> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            rabbitSender.send("第"+i+"个");
        }
    }
}
