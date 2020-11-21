
package com.tech.blog.entities;

import java.sql.*;
public class user {
    private int id;
    private String email;
    private String name;
    private String password;
    private String gender;
    private Timestamp dateTime;
    private String about;

    public user(int id, String email, String name, String password, String gender, Timestamp dateTime, String about) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.dateTime = dateTime;
        this.about = about;
    }

    public user() {
    }

    public user(String email, String name, String password, String gender, Timestamp dateTime, String about) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.dateTime = dateTime;
        this.about = about;
    }
    
    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    
}
