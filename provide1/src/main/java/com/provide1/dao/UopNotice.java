package com.provide1.dao;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "uop_notice")
public class UopNotice {
    @Id
    @Column(name = "NOTICE_ID")
    private String noticeId;

    @Column(name = "NOTICE_TITLE")
    private String noticeTitle;


    @Column(name = "NOTICE_CONTENT")
    private String noticeContent;

    @Column(name = "CHANNEL_ID")
    private String channelId;

    @Column(name = "EFFECTIVE_TIME")
    private Date effectiveTime;

    @Column(name = "FAILURE_TIME")
    private Date failureTime;


    @Column(name = "VALID_FLAG")
    private Short validFlag;

    @Column(name = "NAVI_ORDER")
    private Integer naviOrder;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "CREATE_NO")
    private String createNo;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "MODIFY_DATE")
    private Date modifyDate;

    @Column(name = "MODIFY_NO")
    private String modifyNo;

    /**
     * @return NOTICE_ID
     */
    public String getNoticeId() {
        return noticeId;
    }

    /**
     * @param noticeId
     */
    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    /**
     * @return NOTICE_TITLE
     */
    public String getNoticeTitle() {
        return noticeTitle;
    }

    /**
     * @param noticeTitle
     */
    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    /**
     * ��ȡ��ŵ�����ͼ����ʽ���
     *
     * @return NOTICE_CONTENT - ��ŵ�����ͼ����ʽ���
     */
    public String getNoticeContent() {
        return noticeContent;
    }

    /**
     * ���ô�ŵ�����ͼ����ʽ���
     *
     * @param noticeContent ��ŵ�����ͼ����ʽ���
     */
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    /**
     * @return CHANNEL_ID
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * @param channelId
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * @return EFFECTIVE_TIME
     */
    public Date getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * @param effectiveTime
     */
    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * @return FAILURE_TIME
     */
    public Date getFailureTime() {
        return failureTime;
    }

    /**
     * @param failureTime
     */
    public void setFailureTime(Date failureTime) {
        this.failureTime = failureTime;
    }

    /**
     * ��ȡ0-��Ч
            1-��Ч
            
     *
     * @return VALID_FLAG - 0-��Ч
            1-��Ч
            
     */
    public Short getValidFlag() {
        return validFlag;
    }

    /**
     * ����0-��Ч
            1-��Ч
            
     *
     * @param validFlag 0-��Ч
            1-��Ч
            
     */
    public void setValidFlag(Short validFlag) {
        this.validFlag = validFlag;
    }

    /**
     * @return NAVI_ORDER
     */
    public Integer getNaviOrder() {
        return naviOrder;
    }

    /**
     * @param naviOrder
     */
    public void setNaviOrder(Integer naviOrder) {
        this.naviOrder = naviOrder;
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return CREATE_NO
     */
    public String getCreateNo() {
        return createNo;
    }

    /**
     * @param createNo
     */
    public void setCreateNo(String createNo) {
        this.createNo = createNo;
    }

    /**
     * @return CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return MODIFY_DATE
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return MODIFY_NO
     */
    public String getModifyNo() {
        return modifyNo;
    }

    /**
     * @param modifyNo
     */
    public void setModifyNo(String modifyNo) {
        this.modifyNo = modifyNo;
    }
}