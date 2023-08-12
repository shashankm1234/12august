package com.example.Sess.Exceptions;

import com.example.Sess.Data.Entity.UserData;

import javax.naming.InvalidNameException;

public class MyException extends Exception{

    public String InvalidFirstNameException(String str1){
        return "Invalid first name";
    }
    public String InvalidLastNameException(String str2){
        return "Invalid last name";
    }
    public String InvalidGender(String str3){
        return "Invalid Gender";
    }
}
