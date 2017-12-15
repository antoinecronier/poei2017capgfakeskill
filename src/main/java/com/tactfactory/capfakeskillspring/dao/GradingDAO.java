package com.tactfactory.capfakeskillspring.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tactfactory.capfakeskillspring.dao.base.BaseDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.IGradingDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.IGradingDAO;
import com.tactfactory.capfakeskillspring.models.Grading;
import com.tactfactory.capfakeskillspring.models.Grading;

@Transactional
public class GradingDAO extends BaseDAO<Grading> implements IGradingDAO {
	@Override
	public void create(Grading item) {
		entityManager.persist(item);
	}

	@Override
	public void delete(Grading item) {
		entityManager.detach(item);
	}

	@Override
	public List getAll() {
		return null;
	}

	@Override
	public Grading getById(Long id) {
		return entityManager.find(Grading.class, id);
	}

	@Override
	public void update(Grading item) {
		entityManager.merge(item);
	}
}
