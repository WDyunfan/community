package com.jd.pojo;

import java.io.Serializable;
import java.util.Date;

public class AticleComment implements Serializable {
    private Integer aticleCommentId;

    private Integer aticleId;

    private Integer usersId;

    private Date aticleCommentTime;

    private String aticleCommentContent;

    private Integer aticleCommentLike;

    private String aticleCommentType;

    private String aticleCommentImg;

    private String aticleCommentDescr;

    private static final long serialVersionUID = 1L;

    public Integer getAticleCommentId() {
        return aticleCommentId;
    }

    public void setAticleCommentId(Integer aticleCommentId) {
        this.aticleCommentId = aticleCommentId;
    }

    public Integer getAticleId() {
        return aticleId;
    }

    public void setAticleId(Integer aticleId) {
        this.aticleId = aticleId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Date getAticleCommentTime() {
        return aticleCommentTime;
    }

    public void setAticleCommentTime(Date aticleCommentTime) {
        this.aticleCommentTime = aticleCommentTime;
    }

    public String getAticleCommentContent() {
        return aticleCommentContent;
    }

    public void setAticleCommentContent(String aticleCommentContent) {
        this.aticleCommentContent = aticleCommentContent == null ? null : aticleCommentContent.trim();
    }

    public Integer getAticleCommentLike() {
        return aticleCommentLike;
    }

    public void setAticleCommentLike(Integer aticleCommentLike) {
        this.aticleCommentLike = aticleCommentLike;
    }

    public String getAticleCommentType() {
        return aticleCommentType;
    }

    public void setAticleCommentType(String aticleCommentType) {
        this.aticleCommentType = aticleCommentType == null ? null : aticleCommentType.trim();
    }

    public String getAticleCommentImg() {
        return aticleCommentImg;
    }

    public void setAticleCommentImg(String aticleCommentImg) {
        this.aticleCommentImg = aticleCommentImg == null ? null : aticleCommentImg.trim();
    }

    public String getAticleCommentDescr() {
        return aticleCommentDescr;
    }

    public void setAticleCommentDescr(String aticleCommentDescr) {
        this.aticleCommentDescr = aticleCommentDescr == null ? null : aticleCommentDescr.trim();
    }
}