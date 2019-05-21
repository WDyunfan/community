package com.jd.pojo;

import java.io.Serializable;
import java.util.Date;

public class Forumresponse implements Serializable {
    private Integer forumresponseId;

    private Integer forumId;

    private String forumresponseImg;

    private String forumresponseContent;

    private Integer forumresponseLike;

    private Date forumresponseTime;

    private String forumresponseDescr;

    private static final long serialVersionUID = 1L;

    public Integer getForumresponseId() {
        return forumresponseId;
    }

    public void setForumresponseId(Integer forumresponseId) {
        this.forumresponseId = forumresponseId;
    }

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public String getForumresponseImg() {
        return forumresponseImg;
    }

    public void setForumresponseImg(String forumresponseImg) {
        this.forumresponseImg = forumresponseImg == null ? null : forumresponseImg.trim();
    }

    public String getForumresponseContent() {
        return forumresponseContent;
    }

    public void setForumresponseContent(String forumresponseContent) {
        this.forumresponseContent = forumresponseContent == null ? null : forumresponseContent.trim();
    }

    public Integer getForumresponseLike() {
        return forumresponseLike;
    }

    public void setForumresponseLike(Integer forumresponseLike) {
        this.forumresponseLike = forumresponseLike;
    }

    public Date getForumresponseTime() {
        return forumresponseTime;
    }

    public void setForumresponseTime(Date forumresponseTime) {
        this.forumresponseTime = forumresponseTime;
    }

    public String getForumresponseDescr() {
        return forumresponseDescr;
    }

    public void setForumresponseDescr(String forumresponseDescr) {
        this.forumresponseDescr = forumresponseDescr == null ? null : forumresponseDescr.trim();
    }
}