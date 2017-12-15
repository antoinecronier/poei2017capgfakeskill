package com.tactfactory.capfakeskillspring.managers.interfaces.base;

import java.util.List;

import com.tactfactory.capfakeskillspring.models.base.BaseEntity;

public interface IBaseManager<T extends BaseEntity> {
	public void create(T item);

	public void delete(T item);

	public void delete(Long id);

	public List<T> getAll();

	public T getById(Long id);

	public void update(T item);
}
