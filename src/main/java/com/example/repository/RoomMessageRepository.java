package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.RoomMessage;

public interface RoomMessageRepository extends JpaRepository<RoomMessage, Long> {

}
