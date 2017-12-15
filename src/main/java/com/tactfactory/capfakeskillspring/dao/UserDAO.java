package com.tactfactory.capfakeskillspring.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tactfactory.capfakeskillspring.dao.base.BaseDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.IUserDAO;
import com.tactfactory.capfakeskillspring.models.User;

@Transactional
public class UserDAO extends BaseDAO<User> implements IUserDAO {

	@Override
	public void create(User item) {
		entityManager.persist(item);
	}

	@Override
	public void delete(User item) {
		entityManager.detach(item);
	}

	@Override
	public List getAll() {
		return null;
	}

	@Override
	public User getById(Long id) {
		return entityManager.find(User.class, id);
	}

	@Override
	public void update(User item) {
		entityManager.merge(item);
	}

}
