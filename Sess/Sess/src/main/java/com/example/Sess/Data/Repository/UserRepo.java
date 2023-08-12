package com.example.Sess.Data.Repository;

import com.example.Sess.Data.Entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserData,Integer> {
}
