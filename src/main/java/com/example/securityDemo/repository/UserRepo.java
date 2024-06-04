package com.example.securityDemo.repository;

import com.example.securityDemo.entity.Role;
import com.example.securityDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
   User findByRole(Role role);
}
