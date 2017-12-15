package com.tactfactory.capfakeskillspring.dao;

import org.springframework.transaction.annotation.Transactional;

import com.tactfactory.capfakeskillspring.dao.base.BaseDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.IProjectDAO;
import com.tactfactory.capfakeskillspring.models.Project;

@Transactional
public class ProjectDAO extends BaseDAO<Project> implements IProjectDAO {

	public ProjectDAO(Class<?> klazz) {
		super(Project.class);
	}

}
