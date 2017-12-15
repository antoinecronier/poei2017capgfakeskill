package com.tactfactory.capfakeskillspring.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tactfactory.capfakeskillspring.dao.base.BaseDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.ISkillTypeDAO;
import com.tactfactory.capfakeskillspring.models.SkillType;

@Transactional
public class SkillTypeDAO extends BaseDAO<SkillType> implements ISkillTypeDAO {

	@Override
	public void create(SkillType item) {
		entityManager.persist(item);
	}

	@Override
	public void delete(SkillType item) {
		entityManager.remove(item);
	}

	@SuppressWarnings("unchecked")
    @Override
	public List<SkillType> getAll() {
		return entityManager.createQuery("SELECT st FROM SkillType st").getResultList();
	}

	@Override
	public SkillType getById(Long id) {
		return entityManager.find(SkillType.class, id);
	}

	@Override
	public void update(SkillType item) {
		entityManager.merge(item);
	}

}
