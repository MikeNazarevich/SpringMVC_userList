package com.epolTask.userList.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class User {
    private String id;
    private String name;
    private String surname;

    public User() {

    }

    public User(String id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public User(List<String> params){
        this.id = params.get(0);
        this.name = params.get(1);
        this.surname = params.get(2);
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }
}
