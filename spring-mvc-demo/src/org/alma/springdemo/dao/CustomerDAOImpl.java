package org.alma.springdemo.dao;

import java.util.List;

import org.alma.springdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		Session session =  sessionFactory.getCurrentSession();
		Query<Customer> queryCustomer  =  session.createQuery("from Customer", Customer.class);
		return queryCustomer.getResultList();
	}
	
	
}
