package com.pugb.pugb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "season")
public class Season {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "isCurrentSeason")
	private boolean isCurrentSeason;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isCurrentSeason() {
		return isCurrentSeason;
	}

	public void setCurrentSeason(boolean isCurrentSeason) {
		this.isCurrentSeason = isCurrentSeason;
	}

	@Override
	public String toString() {
		return "Season [id=" + id + ", isCurrentSeason=" + isCurrentSeason + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isCurrentSeason ? 1231 : 1237);
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
		Season other = (Season) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isCurrentSeason != other.isCurrentSeason)
			return false;
		return true;
	}
	

}
