package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{

}
