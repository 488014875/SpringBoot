package com.hystrix.controller;


import com.hystrix.service.HystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/teXt")
@RestController
public class HystrixController {
    @Resource
    private HystrixService hystrixService;
    @RequestMapping("/query")
    @HystrixCommand(fallbackMethod = "tttt")
    public List<Object> query(){
        return hystrixService.queryNotices();
    }

    public List<Object> tttt(){
        List<Object> list = new ArrayList<>();
        list.add("sorry");
        return list;
    }

}
