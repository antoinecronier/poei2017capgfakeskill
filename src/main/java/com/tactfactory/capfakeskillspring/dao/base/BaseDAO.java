package com.tactfactory.capfakeskillspring.dao.base;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tactfactory.capfakeskillspring.dao.interfaces.base.IBaseDAO;
import com.tactfactory.capfakeskillspring.models.User;
import com.tactfactory.capfakeskillspring.models.base.BaseEntity;
import com.tactfactory.capfakeskillspring.utils.DumpFields;

@Service
@Transactional
public abstract class BaseDAO<T extends BaseEntity> implements IBaseDAO<T> {

	private Class<T> klazz;

	@PersistenceContext
	protected EntityManager entityManager;

	public BaseDAO(Class<T> klazz) {
		super();
		this.klazz = klazz;
	}

	@Override
	public void create(T item) {
		entityManager.persist(item);
	}

	@Override
	public void delete(T item) {
		entityManager.detach(item);
	}

	@Override
	public List getAll() {
		return entityManager.createQuery("SELECT st FROM " + this.klazz.getSimpleName() + " st").getResultList();
	}

	@Override
	public T getById(Long id) {
		return entityManager.find(this.klazz, id);
	}

	@Override
	public void update(T item) {
		entityManager.merge(item);
	}

	@Override
	public void delete(Long id) {
		//TODO retrieve primary key name
		entityManager.createQuery("delete from " + this.klazz.getSimpleName() + " st where st." + "id" + " = :id")
			.setParameter("id", id)
			.executeUpdate();
	}
}
