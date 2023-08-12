package com.example.Sess.Model.Request;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class UserRequest {
    private int id;
    private String Fname;
    private String Lname;
    private String Gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String firstName) {
        Fname = firstName;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lastName) {
        Lname = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}