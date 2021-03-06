package com.example.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RoomMessage {
	@Id
	@GeneratedValue
	Long no;
	@ManyToOne
	RoomUser room_user;
	String message;
	@Temporal(value=TemporalType.DATE)
	Date typing_date;
	
	
}
