package com.jd.pojo;

import java.io.Serializable;
import java.util.Date;

public class Aticle implements Serializable {
    private Integer aticleId;

    private Integer usersId;

    private String aticleTitle;

    private String aticleContent;

    private Date aticleTime;

    private Integer aticlePageviews;

    private Integer aticleLike;

    private Integer aticleCommentvolume;

    private String aticleType;

    private String aticleDescr;

    private static final long serialVersionUID = 1L;

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

    public String getAticleTitle() {
        return aticleTitle;
    }

    public void setAticleTitle(String aticleTitle) {
        this.aticleTitle = aticleTitle == null ? null : aticleTitle.trim();
    }

    public String getAticleContent() {
        return aticleContent;
    }

    public void setAticleContent(String aticleContent) {
        this.aticleContent = aticleContent == null ? null : aticleContent.trim();
    }

    public Date getAticleTime() {
        return aticleTime;
    }

    public void setAticleTime(Date aticleTime) {
        this.aticleTime = aticleTime;
    }

    public Integer getAticlePageviews() {
        return aticlePageviews;
    }

    public void setAticlePageviews(Integer aticlePageviews) {
        this.aticlePageviews = aticlePageviews;
    }

    public Integer getAticleLike() {
        return aticleLike;
    }

    public void setAticleLike(Integer aticleLike) {
        this.aticleLike = aticleLike;
    }

    public Integer getAticleCommentvolume() {
        return aticleCommentvolume;
    }

    public void setAticleCommentvolume(Integer aticleCommentvolume) {
        this.aticleCommentvolume = aticleCommentvolume;
    }

    public String getAticleType() {
        return aticleType;
    }

    public void setAticleType(String aticleType) {
        this.aticleType = aticleType == null ? null : aticleType.trim();
    }

    public String getAticleDescr() {
        return aticleDescr;
    }

    public void setAticleDescr(String aticleDescr) {
        this.aticleDescr = aticleDescr == null ? null : aticleDescr.trim();
    }
}