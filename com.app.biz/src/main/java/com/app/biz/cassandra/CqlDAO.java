package com.app.biz.cassandra;

import info.archinnov.achilles.generated.ManagerFactory;

public interface CqlDAO <Key, T>{
	
	public T persist(T entity);
	
	public ManagerFactory update(T entity);
	
	public T find(Class<T> type, Object key);
	
	public T findReference(Class<T> type, Object key);

}

