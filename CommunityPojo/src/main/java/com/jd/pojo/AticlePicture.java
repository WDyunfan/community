package com.jd.pojo;

import java.io.Serializable;

public class AticlePicture implements Serializable {
    private Integer aticlePictureId;

    private Integer aticleId;

    private String aticlePicturePath;

    private String aticlePictureDescr;

    private static final long serialVersionUID = 1L;

    public Integer getAticlePictureId() {
        return aticlePictureId;
    }

    public void setAticlePictureId(Integer aticlePictureId) {
        this.aticlePictureId = aticlePictureId;
    }

    public Integer getAticleId() {
        return aticleId;
    }

    public void setAticleId(Integer aticleId) {
        this.aticleId = aticleId;
    }

    public String getAticlePicturePath() {
        return aticlePicturePath;
    }

    public void setAticlePicturePath(String aticlePicturePath) {
        this.aticlePicturePath = aticlePicturePath == null ? null : aticlePicturePath.trim();
    }

    public String getAticlePictureDescr() {
        return aticlePictureDescr;
    }

    public void setAticlePictureDescr(String aticlePictureDescr) {
        this.aticlePictureDescr = aticlePictureDescr == null ? null : aticlePictureDescr.trim();
    }
}