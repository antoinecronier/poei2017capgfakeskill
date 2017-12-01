package com.tactfactory.capfakeskillspring.configurations.security.dao;

import org.springframework.data.repository.CrudRepository;

import com.tactfactory.capfakeskillspring.configurations.security.models.SecurityRole;

public interface ISecurityRoleCrudRepository extends CrudRepository<SecurityRole, Integer> {

}
