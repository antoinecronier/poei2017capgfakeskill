package com.tactfactory.capfakeskillspring.configurations.security.dao;

import org.springframework.data.repository.CrudRepository;

import com.tactfactory.capfakeskillspring.configurations.security.models.SecurityUser;

public interface ISecurityUserCrudRepository extends CrudRepository<SecurityUser,Integer> {

	SecurityUser findByLogin(String login);
}
