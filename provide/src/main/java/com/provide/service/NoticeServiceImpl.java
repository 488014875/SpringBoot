package com.provide.service;

import com.provide.dao.NoticeMapper;
import com.provide.dao.UopNotice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class NoticeServiceImpl implements NoticeService {
    @Resource
    private NoticeMapper noticeMapper;
    @Override
    public List<UopNotice> queryNotices() {
        List<UopNotice> notices = noticeMapper.queryNotices();
        return notices;
    }
}
