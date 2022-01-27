package com.dev.hruser.hruser.repositories;

import com.dev.hruser.hruser.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByEmail(String email);
}
