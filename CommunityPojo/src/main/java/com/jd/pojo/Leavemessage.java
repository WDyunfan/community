package com.jd.pojo;

import java.io.Serializable;
import java.util.Date;

public class Leavemessage implements Serializable {
    private Integer leavemessageId;

    private Integer usersId;
    
    private Users users;

    private String leavemessageContent;

    private Date leavemessageTime;

    private String leavemessageExperience;

    private Integer leavemessageLike;

    private String leavemessageDescr;

    private static final long serialVersionUID = 1L;
    
    public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

    public Integer getLeavemessageId() {
        return leavemessageId;
    }

    public void setLeavemessageId(Integer leavemessageId) {
        this.leavemessageId = leavemessageId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getLeavemessageContent() {
        return leavemessageContent;
    }

    public void setLeavemessageContent(String leavemessageContent) {
        this.leavemessageContent = leavemessageContent == null ? null : leavemessageContent.trim();
    }

    public Date getLeavemessageTime() {
        return leavemessageTime;
    }

    public void setLeavemessageTime(Date leavemessageTime) {
        this.leavemessageTime = leavemessageTime;
    }

    public String getLeavemessageExperience() {
        return leavemessageExperience;
    }

    public void setLeavemessageExperience(String leavemessageExperience) {
        this.leavemessageExperience = leavemessageExperience == null ? null : leavemessageExperience.trim();
    }

    public Integer getLeavemessageLike() {
        return leavemessageLike;
    }

    public void setLeavemessageLike(Integer leavemessageLike) {
        this.leavemessageLike = leavemessageLike;
    }

    public String getLeavemessageDescr() {
        return leavemessageDescr;
    }

    public void setLeavemessageDescr(String leavemessageDescr) {
        this.leavemessageDescr = leavemessageDescr == null ? null : leavemessageDescr.trim();
    }
}