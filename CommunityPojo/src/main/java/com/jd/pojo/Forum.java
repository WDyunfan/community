package com.jd.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Forum implements Serializable {
    private Integer forumId;

    private Integer usersId;
    
    private Users users;
    
    private Date forumTime;

    private String forumImg;

    private String forumContent;

    private Integer forumPageviews;

    private Integer forumCommentvolume;

    private String forumType;

    private String forumDescr;
    
    private List<Forumresponse> forumresponses;

    private static final long serialVersionUID = 1L;

    
    public List<Forumresponse> getForumresponse() {
		return forumresponses;
	}

	public void setForumresponse(List<Forumresponse> forumresponse) {
		forumresponses = forumresponses;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Date getForumTime() {
        return forumTime;
    }

    public void setForumTime(Date forumTime) {
        this.forumTime = forumTime;
    }

    public String getForumImg() {
        return forumImg;
    }

    public void setForumImg(String forumImg) {
        this.forumImg = forumImg == null ? null : forumImg.trim();
    }

    public String getForumContent() {
        return forumContent;
    }

    public void setForumContent(String forumContent) {
        this.forumContent = forumContent == null ? null : forumContent.trim();
    }

    public Integer getForumPageviews() {
        return forumPageviews;
    }

    public void setForumPageviews(Integer forumPageviews) {
        this.forumPageviews = forumPageviews;
    }

    public Integer getForumCommentvolume() {
        return forumCommentvolume;
    }

    public void setForumCommentvolume(Integer forumCommentvolume) {
        this.forumCommentvolume = forumCommentvolume;
    }

    public String getForumType() {
        return forumType;
    }

    public void setForumType(String forumType) {
        this.forumType = forumType == null ? null : forumType.trim();
    }

    public String getForumDescr() {
        return forumDescr;
    }

    public void setForumDescr(String forumDescr) {
        this.forumDescr = forumDescr == null ? null : forumDescr.trim();
    }
}