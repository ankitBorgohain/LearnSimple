package com.learnSimple.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSimple.entity.User;
public interface UserRepository extends JpaRepository<User, Integer>{
	boolean existsByEmail(String email);
	User findByEmail(String email);
}
