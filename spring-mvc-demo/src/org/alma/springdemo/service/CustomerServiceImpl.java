package org.alma.springdemo.service;

import java.util.List;

import org.alma.springdemo.dao.CustomerDAO;
import org.alma.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO customerDAO;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		final List<Customer> customers = customerDAO.getCustomers();
		return customers;
	}

}
