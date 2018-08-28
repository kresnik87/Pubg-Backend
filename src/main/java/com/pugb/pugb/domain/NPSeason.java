package com.pugb.pugb.domain;

public class NPSeason {
	private String id, type;
	private Boolean isCurrentSeason, isOffseason;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getIsCurrentSeason() {
		return isCurrentSeason;
	}

	public void setIsCurrentSeason(Boolean isCurrentSeason) {
		this.isCurrentSeason = isCurrentSeason;
	}

	public Boolean getIsOffSeason() {
		return isOffseason;
	}

	public void setIsOffSeason(Boolean isOffSeason) {
		this.isOffseason = isOffSeason;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isCurrentSeason == null) ? 0 : isCurrentSeason.hashCode());
		result = prime * result + ((isOffseason == null) ? 0 : isOffseason.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		NPSeason other = (NPSeason) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isCurrentSeason == null) {
			if (other.isCurrentSeason != null)
				return false;
		} else if (!isCurrentSeason.equals(other.isCurrentSeason))
			return false;
		if (isOffseason == null) {
			if (other.isOffseason != null)
				return false;
		} else if (!isOffseason.equals(other.isOffseason))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
