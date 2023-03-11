package com.example.mhrs1.dataAccess.abstracts;

import com.example.mhrs1.entities.concrtetes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
