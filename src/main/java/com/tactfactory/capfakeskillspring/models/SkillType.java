package com.tactfactory.capfakeskillspring.models;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.tactfactory.capfakeskillspring.models.base.BaseEntity;

@Entity
@Table(name = "skilltype")
public class SkillType extends BaseEntity {

    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
