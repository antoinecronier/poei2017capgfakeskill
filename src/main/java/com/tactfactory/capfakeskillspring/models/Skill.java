package com.tactfactory.capfakeskillspring.models;

import com.tactfactory.capfakeskillspring.models.base.BaseEntity;

public class Skill extends BaseEntity {

	private String name;
	private SkillType type;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SkillType getType() {
		return type;
	}
	public void setType(SkillType type) {
		this.type = type;
	}


}
