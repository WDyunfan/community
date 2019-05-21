package com.jd.pojo;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
    private Integer usersId;

    private String usersName;

    private String usersPass;

    private String usersImg;

    private String usersIntroduce;

    private String usersExperience;

    private String usersThememode;

    private String usersAlbum;

    private Date usersRegistertime;

    private Date usersLogintime;

    private String usersDescr;

    private static final long serialVersionUID = 1L;

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName == null ? null : usersName.trim();
    }

    public String getUsersPass() {
        return usersPass;
    }

    public void setUsersPass(String usersPass) {
        this.usersPass = usersPass == null ? null : usersPass.trim();
    }

    public String getUsersImg() {
        return usersImg;
    }

    public void setUsersImg(String usersImg) {
        this.usersImg = usersImg == null ? null : usersImg.trim();
    }

    public String getUsersIntroduce() {
        return usersIntroduce;
    }

    public void setUsersIntroduce(String usersIntroduce) {
        this.usersIntroduce = usersIntroduce == null ? null : usersIntroduce.trim();
    }

    public String getUsersExperience() {
        return usersExperience;
    }

    public void setUsersExperience(String usersExperience) {
        this.usersExperience = usersExperience == null ? null : usersExperience.trim();
    }

    public String getUsersThememode() {
        return usersThememode;
    }

    public void setUsersThememode(String usersThememode) {
        this.usersThememode = usersThememode == null ? null : usersThememode.trim();
    }

    public String getUsersAlbum() {
        return usersAlbum;
    }

    public void setUsersAlbum(String usersAlbum) {
        this.usersAlbum = usersAlbum == null ? null : usersAlbum.trim();
    }

    public Date getUsersRegistertime() {
        return usersRegistertime;
    }

    public void setUsersRegistertime(Date usersRegistertime) {
        this.usersRegistertime = usersRegistertime;
    }

    public Date getUsersLogintime() {
        return usersLogintime;
    }

    public void setUsersLogintime(Date usersLogintime) {
        this.usersLogintime = usersLogintime;
    }

    public String getUsersDescr() {
        return usersDescr;
    }

    public void setUsersDescr(String usersDescr) {
        this.usersDescr = usersDescr == null ? null : usersDescr.trim();
    }
}