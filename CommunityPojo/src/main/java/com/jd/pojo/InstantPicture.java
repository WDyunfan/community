package com.jd.pojo;

import java.io.Serializable;

public class InstantPicture implements Serializable {
    private Integer instantPictureId;

    private Integer instantMessageId;

    private String instantPicturePath;

    private String instantPictureDescr;

    private static final long serialVersionUID = 1L;

    public Integer getInstantPictureId() {
        return instantPictureId;
    }

    public void setInstantPictureId(Integer instantPictureId) {
        this.instantPictureId = instantPictureId;
    }

    public Integer getInstantMessageId() {
        return instantMessageId;
    }

    public void setInstantMessageId(Integer instantMessageId) {
        this.instantMessageId = instantMessageId;
    }

    public String getInstantPicturePath() {
        return instantPicturePath;
    }

    public void setInstantPicturePath(String instantPicturePath) {
        this.instantPicturePath = instantPicturePath == null ? null : instantPicturePath.trim();
    }

    public String getInstantPictureDescr() {
        return instantPictureDescr;
    }

    public void setInstantPictureDescr(String instantPictureDescr) {
        this.instantPictureDescr = instantPictureDescr == null ? null : instantPictureDescr.trim();
    }
}