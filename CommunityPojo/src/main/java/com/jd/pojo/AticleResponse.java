package com.jd.pojo;

import java.io.Serializable;
import java.util.Date;

public class AticleResponse implements Serializable {
    private Integer aticleResponseId;

    private Integer aticleCommentId;

    private Integer usersId;

    private Date aticleResponseTime;

    private String aticleResponseContent;

    private String aticleResponseImg;

    private String aticleResponseDescr;

    private static final long serialVersionUID = 1L;

    public Integer getAticleResponseId() {
        return aticleResponseId;
    }

    public void setAticleResponseId(Integer aticleResponseId) {
        this.aticleResponseId = aticleResponseId;
    }

    public Integer getAticleCommentId() {
        return aticleCommentId;
    }

    public void setAticleCommentId(Integer aticleCommentId) {
        this.aticleCommentId = aticleCommentId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Date getAticleResponseTime() {
        return aticleResponseTime;
    }

    public void setAticleResponseTime(Date aticleResponseTime) {
        this.aticleResponseTime = aticleResponseTime;
    }

    public String getAticleResponseContent() {
        return aticleResponseContent;
    }

    public void setAticleResponseContent(String aticleResponseContent) {
        this.aticleResponseContent = aticleResponseContent == null ? null : aticleResponseContent.trim();
    }

    public String getAticleResponseImg() {
        return aticleResponseImg;
    }

    public void setAticleResponseImg(String aticleResponseImg) {
        this.aticleResponseImg = aticleResponseImg == null ? null : aticleResponseImg.trim();
    }

    public String getAticleResponseDescr() {
        return aticleResponseDescr;
    }

    public void setAticleResponseDescr(String aticleResponseDescr) {
        this.aticleResponseDescr = aticleResponseDescr == null ? null : aticleResponseDescr.trim();
    }
}