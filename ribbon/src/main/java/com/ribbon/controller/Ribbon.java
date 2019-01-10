package com.ribbon.controller;


import com.ribbon.service.RibbonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/test")
@RestController
public class Ribbon {
    @Resource
    private RibbonService ribbonService;
    @RequestMapping("/query")
    public List<Object> query(){
        return (ribbonService.queryNotices());
    }

}
