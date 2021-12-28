package com.example.demojavaproject.model;

import java.io.Serializable;

public class Member implements Serializable {

    private int profile;
    private String fullname;

    public int getProfile() {
        return profile;
    }

    public String getFullname() {
        return fullname;
    }

    public Member(int profile, String fullname) {
        this.profile = profile;
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "User{" +
                "profile=" + profile +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
