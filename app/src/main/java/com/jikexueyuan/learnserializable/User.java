package com.jikexueyuan.learnserializable;

import java.io.Serializable;

/**
 * Created by admin on 2017/6/21.
 */

public class User implements Serializable {

    private static final long serialVersionUID = 51906123456789L;//辅助序列化和反序列化过程

    private int userId;
    private String username;
    private boolean isMale;

    public User(int userId, String username, boolean isMale) {
        this.userId = userId;
        this.username = username;
        this.isMale = isMale;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public boolean isMale() {
        return isMale;
    }
}
