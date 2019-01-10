package com.provide.controller;

import com.provide.dao.UopNotice;
import com.provide.service.NoticeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/query")
@RestController
public class NoticeController {
    @Resource
    private NoticeService noticeService;
    @RequestMapping("/notices")
    public List<Object> queryNotices(){
        List<Object> notices = new ArrayList<>();
        List<UopNotice> uopNotices = noticeService.queryNotices();
        for(UopNotice uop :uopNotices){
            notices.add(uop);
        }

        System.out.println("服务一号");
        return notices;
    }

}
