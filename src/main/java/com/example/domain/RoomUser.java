package com.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RoomUser {
@Id
@GeneratedValue
Long no;
@ManyToOne
Room room;
@ManyToOne
User user;
@Column(columnDefinition="tinyint(1) default 1")
private boolean closed;
}
