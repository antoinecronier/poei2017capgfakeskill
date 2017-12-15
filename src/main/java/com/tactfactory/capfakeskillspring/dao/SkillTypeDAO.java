package com.tactfactory.capfakeskillspring.dao;

import org.springframework.transaction.annotation.Transactional;

import com.tactfactory.capfakeskillspring.dao.base.BaseDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.ISkillTypeDAO;
import com.tactfactory.capfakeskillspring.models.SkillType;

@Transactional
public class SkillTypeDAO extends BaseDAO<SkillType> implements ISkillTypeDAO {

	public SkillTypeDAO() {
		super(SkillType.class);
	}
}
