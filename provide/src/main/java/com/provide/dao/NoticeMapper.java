package com.provide.dao;


import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NoticeMapper {
    @Select("select * from uop_notice a")
    /*@Results(value ={
            @Result(id=true,  property="noticeId", column="NOTICE_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Result(id=true,  property="noticeTitle", column="NOTICE_TITLE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Result(id=true,  property="noticeContent", column="NOTICE_CONTENT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Result(id=true,  property="channelId", column="CHANNEL_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Result(id=true,  property="channelName", column="CHANNEL_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Result(id=true,  property="effectiveTime", column="EFFECTIVE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
            @Result(id=true,  property="failureTime", column="FAILURE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
            @Result(id=true,  property="validFlag", column="VALID_FLAG", javaType=Short.class, jdbcType=JdbcType.DECIMAL),
            @Result(id=true,  property="naviOrder", column="NAVI_ORDER", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
            @Result(id=true,  property="remark", column="REMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Result(id=true,  property="createNo", column="CREATE_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),
            @Result(id=true,  property="createDate", column="CREATE_DATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
            @Result(id=true,  property="modifyDate", column="MODIFY_DATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
            @Result(id=true,  property="modifyNo", column="MODIFY_NO", javaType=String.class, jdbcType=JdbcType.VARCHAR),

    })*/
    //@SelectProvider(type = NoticeProvider.class, method = "queryNotices")
    List<UopNotice> queryNotices();
}
