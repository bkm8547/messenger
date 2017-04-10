package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.RoomUser;

public interface RoomUserRepository extends JpaRepository<RoomUser, Long>{

}
