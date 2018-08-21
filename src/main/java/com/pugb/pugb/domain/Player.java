package com.pugb.pugb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name = "idplayer")
	private Long idplayer;
	
	@Column(name = "name")
	private String name;

	public Long getId() {
		return idplayer;
	}

	public void setId(Long id) {
		this.idplayer = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
