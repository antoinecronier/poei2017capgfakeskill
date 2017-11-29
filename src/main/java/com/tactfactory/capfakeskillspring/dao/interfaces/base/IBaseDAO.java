package com.tactfactory.capfakeskillspring.dao.interfaces.base;

import java.util.List;

import com.tactfactory.capfakeskillspring.models.base.BaseEntity;

public abstract interface IBaseDAO<T extends BaseEntity> {
	public void create(T item);

	public void delete(T item);

	public List getAll();

	public T getById(Integer id);

	public void update(T item);
}