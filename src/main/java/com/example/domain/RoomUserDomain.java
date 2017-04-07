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
public class RoomUserDomain {
@Id
@GeneratedValue
Long no;
@ManyToOne
RoomDomain roomDomain;
@ManyToOne
UserDomain userDomain;
@Column(columnDefinition="tinyint(1) default 1")
private boolean closed;
}
