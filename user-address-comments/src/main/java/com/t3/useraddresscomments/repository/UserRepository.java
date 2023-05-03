package com.t3.useraddresscomments.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.useraddresscomments.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
