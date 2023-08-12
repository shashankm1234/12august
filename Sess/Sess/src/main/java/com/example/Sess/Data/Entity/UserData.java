package com.example.Sess.Data.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="User")
public class UserData {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "firstName")
    private String Fname;
    @Column(name = "lastName")
    private String Lname;
    @Column(name = "gender")
    private String Gender;

    public UserData(){
        super();
    }

}
