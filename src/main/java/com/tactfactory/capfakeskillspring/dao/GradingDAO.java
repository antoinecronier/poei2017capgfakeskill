package com.tactfactory.capfakeskillspring.dao;

import org.springframework.transaction.annotation.Transactional;

import com.tactfactory.capfakeskillspring.dao.base.BaseDAO;
import com.tactfactory.capfakeskillspring.dao.interfaces.IGradingDAO;
import com.tactfactory.capfakeskillspring.models.Grading;

@Transactional
public class GradingDAO extends BaseDAO<Grading> implements IGradingDAO {

	public GradingDAO() {
		super(Grading.class);
	}

}
