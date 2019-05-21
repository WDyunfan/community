package com.jd.pojo;

import java.io.Serializable;
import java.util.Date;

public class InstantResponse implements Serializable {
    private Integer instantResponseId;

    private Integer instantCommentId;

    private Integer usersId;

    private String instantResponseImg;

    private String instantResponseContent;

    private Date instantResponseTime;

    private String instantResponseDescr;

    private static final long serialVersionUID = 1L;

    public Integer getInstantResponseId() {
        return instantResponseId;
    }

    public void setInstantResponseId(Integer instantResponseId) {
        this.instantResponseId = instantResponseId;
    }

    public Integer getInstantCommentId() {
        return instantCommentId;
    }

    public void setInstantCommentId(Integer instantCommentId) {
        this.instantCommentId = instantCommentId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getInstantResponseImg() {
        return instantResponseImg;
    }

    public void setInstantResponseImg(String instantResponseImg) {
        this.instantResponseImg = instantResponseImg == null ? null : instantResponseImg.trim();
    }

    public String getInstantResponseContent() {
        return instantResponseContent;
    }

    public void setInstantResponseContent(String instantResponseContent) {
        this.instantResponseContent = instantResponseContent == null ? null : instantResponseContent.trim();
    }

    public Date getInstantResponseTime() {
        return instantResponseTime;
    }

    public void setInstantResponseTime(Date instantResponseTime) {
        this.instantResponseTime = instantResponseTime;
    }

    public String getInstantResponseDescr() {
        return instantResponseDescr;
    }

    public void setInstantResponseDescr(String instantResponseDescr) {
        this.instantResponseDescr = instantResponseDescr == null ? null : instantResponseDescr.trim();
    }
}