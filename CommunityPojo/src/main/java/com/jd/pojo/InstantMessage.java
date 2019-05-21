package com.jd.pojo;

import java.io.Serializable;
import java.util.Date;

public class InstantMessage implements Serializable {
    private Integer instantMessageId;

    private Integer usersId;

    private String instantMessageTitle;

    private String instantMessageContent;

    private Date instantMessageTime;

    private Integer instantMessagePageviews;

    private Integer instantMessageLike;

    private Integer intantMessageCommentvolume;

    private String instantMessageType;

    private String instantMessageDescr;

    private static final long serialVersionUID = 1L;

    public Integer getInstantMessageId() {
        return instantMessageId;
    }

    public void setInstantMessageId(Integer instantMessageId) {
        this.instantMessageId = instantMessageId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getInstantMessageTitle() {
        return instantMessageTitle;
    }

    public void setInstantMessageTitle(String instantMessageTitle) {
        this.instantMessageTitle = instantMessageTitle == null ? null : instantMessageTitle.trim();
    }

    public String getInstantMessageContent() {
        return instantMessageContent;
    }

    public void setInstantMessageContent(String instantMessageContent) {
        this.instantMessageContent = instantMessageContent == null ? null : instantMessageContent.trim();
    }

    public Date getInstantMessageTime() {
        return instantMessageTime;
    }

    public void setInstantMessageTime(Date instantMessageTime) {
        this.instantMessageTime = instantMessageTime;
    }

    public Integer getInstantMessagePageviews() {
        return instantMessagePageviews;
    }

    public void setInstantMessagePageviews(Integer instantMessagePageviews) {
        this.instantMessagePageviews = instantMessagePageviews;
    }

    public Integer getInstantMessageLike() {
        return instantMessageLike;
    }

    public void setInstantMessageLike(Integer instantMessageLike) {
        this.instantMessageLike = instantMessageLike;
    }

    public Integer getIntantMessageCommentvolume() {
        return intantMessageCommentvolume;
    }

    public void setIntantMessageCommentvolume(Integer intantMessageCommentvolume) {
        this.intantMessageCommentvolume = intantMessageCommentvolume;
    }

    public String getInstantMessageType() {
        return instantMessageType;
    }

    public void setInstantMessageType(String instantMessageType) {
        this.instantMessageType = instantMessageType == null ? null : instantMessageType.trim();
    }

    public String getInstantMessageDescr() {
        return instantMessageDescr;
    }

    public void setInstantMessageDescr(String instantMessageDescr) {
        this.instantMessageDescr = instantMessageDescr == null ? null : instantMessageDescr.trim();
    }
}