package com.tactfactory.capfakeskillspring.dao;

import org.springframework.transaction.annotation.Transactional;

import com.tactfactory.capfakeskillspring.dao.base.BaseDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.ISkillDAO;
import com.tactfactory.capfakeskillspring.models.Skill;

@Transactional
public class SkillDAO extends BaseDAO<Skill> implements ISkillDAO {

	public SkillDAO() {
		super(Skill.class);
	}
}
