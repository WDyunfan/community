package com.jd.pojo;

import java.io.Serializable;

public class UserRole implements Serializable {
    private Integer userRoleId;

    private Integer roleId;

    private Integer usersId;

    private String userRoleDescr;

    private static final long serialVersionUID = 1L;

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUserRoleDescr() {
        return userRoleDescr;
    }

    public void setUserRoleDescr(String userRoleDescr) {
        this.userRoleDescr = userRoleDescr == null ? null : userRoleDescr.trim();
    }
}