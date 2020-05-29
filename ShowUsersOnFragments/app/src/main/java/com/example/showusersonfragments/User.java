package com.example.showusersonfragments;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String name;
    private String nickName;

    public User(int id, String name, String nickname) {
        this.id = id;
        this.name = name;
        this.nickName = nickname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickName;
    }
}
