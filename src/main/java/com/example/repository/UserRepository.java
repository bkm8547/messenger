package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.UserDomain;

public interface UserRepository extends JpaRepository<UserDomain, String>{

}
