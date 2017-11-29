package com.tactfactory.capfakeskillspring.models.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Double id;

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

}
