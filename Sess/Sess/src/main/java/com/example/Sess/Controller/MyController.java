package com.example.Sess.Controller;

import com.example.Sess.Data.Entity.UserData;
import com.example.Sess.Model.Request.UserRequest;
import com.example.Sess.Model.Response.UserResponse;
import com.example.Sess.Service.UserService;
import com.example.Sess.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private UserService user;

    @GetMapping("/GetUser")
    public List<UserData> getUsers(){

        return user.getUsers();
    }

    @GetMapping("/GetUser/{id}")
    public Integer getUsersById(@PathVariable int id){
        return user.gerUsersById(id);
    }

    @PostMapping("/CreateNewUser")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest user){
        return user.creatingUser(user);
    }

}
















