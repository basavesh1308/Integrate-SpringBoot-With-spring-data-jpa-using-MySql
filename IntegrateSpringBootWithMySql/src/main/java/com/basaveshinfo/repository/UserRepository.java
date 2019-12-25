package com.basaveshinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basaveshinfo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
