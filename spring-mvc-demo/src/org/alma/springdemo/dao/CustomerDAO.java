package org.alma.springdemo.dao;

import java.util.List;

import org.alma.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
}
