package com.dolnikova;

import java.util.List;

public class Group {

    private String name;
    private List<User> users;

    public Group() {
    }

    public Group(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", user=" + users +
                '}';
    }
}