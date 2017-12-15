package com.tactfactory.capfakeskillspring.dao;

import org.springframework.transaction.annotation.Transactional;

import com.tactfactory.capfakeskillspring.dao.base.BaseDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.IUserDAO;
import com.tactfactory.capfakeskillspring.models.User;

@Transactional
public class UserDAO extends BaseDAO<User> implements IUserDAO {

	public UserDAO() {
		super(User.class);
	}
}
