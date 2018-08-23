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
	
	@Column(name = "shardId")
	private String shardId;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idplayer == null) ? 0 : idplayer.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((shardId == null) ? 0 : shardId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (idplayer == null) {
			if (other.idplayer != null)
				return false;
		} else if (!idplayer.equals(other.idplayer))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (shardId == null) {
			if (other.shardId != null)
				return false;
		} else if (!shardId.equals(other.shardId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [idplayer=" + idplayer + ", name=" + name + ", shardId=" + shardId + "]";
	}

	public String getShardId() {
		return shardId;
	}

	public void setShardId(String shardId) {
		this.shardId = shardId;
	}

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
