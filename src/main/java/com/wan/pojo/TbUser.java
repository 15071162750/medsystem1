package com.wan.pojo;

import java.util.Date;

public class TbUser {
    private Integer id;

    private String username;

    private String password;

    private Date createtime;

    public TbUser(Integer id, String username, String password, Date createtime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createtime = createtime;
    }

    public TbUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}