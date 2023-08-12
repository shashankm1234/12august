package com.example.Sess.Service;

import com.example.Sess.Data.Entity.UserData;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<UserData> getUsers();
    Integer gerUsersById(int id);
public User createUser(UserService user);
    Optional<UserData> getUsersById(int id);
}
