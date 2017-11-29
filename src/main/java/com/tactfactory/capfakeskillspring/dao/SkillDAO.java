package com.tactfactory.capfakeskillspring.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tactfactory.capfakeskillspring.dao.base.BaseDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.ISkillDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.ISkillDAO;
import com.tactfactory.capfakeskillspring.models.Skill;
import com.tactfactory.capfakeskillspring.models.Skill;

@Transactional
public class SkillDAO extends BaseDAO<Skill> implements ISkillDAO {
	@Override
	public void create(Skill item) {
		entityManager.persist(item);
	}

	@Override
	public void delete(Skill item) {
		entityManager.detach(item);
	}

	@Override
	public List getAll() {
		return null;
	}

	@Override
	public Skill getById(Integer id) {
		return entityManager.find(Skill.class, id);
	}

	@Override
	public void update(Skill item) {
		entityManager.merge(item);
	}

}
