package com.ribbon.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("provide")
public interface RibbonService {
    @RequestMapping(value = "/query/notices",method = RequestMethod.GET)
    List<Object> queryNotices();
}
