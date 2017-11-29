package com.tactfactory.capfakeskillspring.dao.interfaces;

import org.springframework.stereotype.Repository;

import com.tactfactory.capfakeskillspring.dao.interfaces.base.IBaseDAO;
import com.tactfactory.capfakeskillspring.models.User;

@Repository
public interface IUserDAO extends IBaseDAO<User> {

}
