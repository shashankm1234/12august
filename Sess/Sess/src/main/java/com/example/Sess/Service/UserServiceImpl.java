package com.example.Sess.Service;

import com.example.Sess.Data.Entity.UserData;
import com.example.Sess.Data.Repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<UserData> getUsers(){
        return userRepo.findAll();
    }

    @Override
    public Integer gerUsersById(int id) {
        return null;
    }

    @Override
    public User createUser(UserService user) {
       userRepo.save(user);
        return null;
    }

    @Override
    public Optional<UserData> getUsersById(int id){
        return userRepo.findById(id);
    }


}