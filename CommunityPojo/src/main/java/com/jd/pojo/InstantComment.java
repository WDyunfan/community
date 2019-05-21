package com.jd.pojo;

import java.io.Serializable;
import java.util.Date;

public class InstantComment implements Serializable {
    private Integer instantCommentId;

    private Integer instantMessageId;

    private String instantCommentImg;

    private String instantCommentContent;

    private Integer instantCommentLike;

    private String instantCommentType;

    private Date instantCommentTime;

    private String commentDescr;

    private static final long serialVersionUID = 1L;

    public Integer getInstantCommentId() {
        return instantCommentId;
    }

    public void setInstantCommentId(Integer instantCommentId) {
        this.instantCommentId = instantCommentId;
    }

    public Integer getInstantMessageId() {
        return instantMessageId;
    }

    public void setInstantMessageId(Integer instantMessageId) {
        this.instantMessageId = instantMessageId;
    }

    public String getInstantCommentImg() {
        return instantCommentImg;
    }

    public void setInstantCommentImg(String instantCommentImg) {
        this.instantCommentImg = instantCommentImg == null ? null : instantCommentImg.trim();
    }

    public String getInstantCommentContent() {
        return instantCommentContent;
    }

    public void setInstantCommentContent(String instantCommentContent) {
        this.instantCommentContent = instantCommentContent == null ? null : instantCommentContent.trim();
    }

    public Integer getInstantCommentLike() {
        return instantCommentLike;
    }

    public void setInstantCommentLike(Integer instantCommentLike) {
        this.instantCommentLike = instantCommentLike;
    }

    public String getInstantCommentType() {
        return instantCommentType;
    }

    public void setInstantCommentType(String instantCommentType) {
        this.instantCommentType = instantCommentType == null ? null : instantCommentType.trim();
    }

    public Date getInstantCommentTime() {
        return instantCommentTime;
    }

    public void setInstantCommentTime(Date instantCommentTime) {
        this.instantCommentTime = instantCommentTime;
    }

    public String getCommentDescr() {
        return commentDescr;
    }

    public void setCommentDescr(String commentDescr) {
        this.commentDescr = commentDescr == null ? null : commentDescr.trim();
    }
}