package com.zhouqi.ncist.nbanewsclient.model.dbmodel;

import org.litepal.crud.DataSupport;

/**
 * Created by Drew on 2017/1/19.
 * 数据库类
 */

public class DBLogin extends DataSupport {
    /**
     * id
     */
    private int id;
    /**
     * 登录名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 是否已经注册
     */
    private boolean isLogin;
    /**
     * 是否登陆
     */
    private boolean isLoad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public boolean isLoad() {
        return isLoad;
    }

    public void setLoad(boolean load) {
        isLoad = load;
    }
}
