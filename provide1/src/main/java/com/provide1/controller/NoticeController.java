package com.provide1.controller;



import com.provide1.dao.UopNotice;
import com.provide1.service.NoticeService;
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
        System.out.println("服务二号");
        return notices;
    }

}
