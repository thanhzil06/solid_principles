package com.company.intersegrega.service;

import java.util.List;

import com.company.intersegrega.entity.Entity;

// Common interface to be implemented by all persistence services. 
// In a typical application, we'll have a service layer - persistence class like this,
// and a data access layer which communicates or uses this persistence service to connect to backend.
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
	//public List<T> findByName(String name);
}
