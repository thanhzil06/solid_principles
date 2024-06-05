package com.company.intersegrega.service;

import java.util.HashMap;
import java.util.Map;

import com.company.intersegrega.entity.Order;

public class OrderPersistenceService implements PersistenceService<Order>{
	// The type OrderPersistenceService must implement the inherited abstract method PersistenceService<Order>
	// which means, override all methods inside its interface.
	
	// Declare a map to store Order Entities
	private static final Map<Long, Order> ORDERS= new HashMap<>();
	@Override
	public void save(Order entity) {
		synchronized (ORDERS) {
			ORDERS.put(entity.getId(), entity);
		}		
	}

	@Override
	public void delete(Order entity) {
		synchronized (ORDERS) {
			ORDERS.remove(entity.getId());
		}
	}

	@Override
	public Order findById(Long id) {
		synchronized (ORDERS) {
			return ORDERS.get(id);
		}
	}

	/*
	 * @Override public List<Order> findByName(String name) { // TODO Auto-generated
	 * method stub throw new
	 * UnsupportedOperationException("Find by name is not supported"); }
	 */
	
	// So, WTF  are you going to do with this method?
	
	// Name does not make any sense for an order entity. So OrderPersistence Service cannot provide any implementation for findByName.
	// If you throw an Exception, you violate the InterfaceSegregation principle.
	// => To solve the problem, just delete public List<T> findByName(String name); and comment @Override in UserPS.
	// Maybe that is added by someone else at first, which leads to this violation.
	
}
