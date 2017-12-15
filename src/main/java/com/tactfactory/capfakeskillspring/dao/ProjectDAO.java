package com.tactfactory.capfakeskillspring.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tactfactory.capfakeskillspring.dao.base.BaseDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.IProjectDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.IProjectDAO;
import com.tactfactory.capfakeskillspring.models.Project;
import com.tactfactory.capfakeskillspring.models.Project;

@Transactional
public class ProjectDAO extends BaseDAO<Project> implements IProjectDAO {
	@Override
	public void create(Project item) {
		entityManager.persist(item);
	}

	@Override
	public void delete(Project item) {
		entityManager.detach(item);
	}

	@Override
	public List getAll() {
		return null;
	}

	@Override
	public Project getById(Long id) {
		return entityManager.find(Project.class, id);
	}

	@Override
	public void update(Project item) {
		entityManager.merge(item);
	}
}
