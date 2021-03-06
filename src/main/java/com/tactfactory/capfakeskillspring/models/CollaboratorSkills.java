package com.tactfactory.capfakeskillspring.models;

import com.tactfactory.capfakeskillspring.models.base.BaseEntity;

public class CollaboratorSkills extends BaseEntity {

	private Skill skill;
	private Integer level;

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
}
