package com.example.docpoll.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String username;

    //IDK is a shared object for admin and patient so the normal "votedList" and "createdList" must be handled ig

    public User(){}
    public User(String username){
        this.username = username;
    }

    //GETTERS/SETTERS
    //--------------------------------------------//
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    //----------------------------------------------//
}
