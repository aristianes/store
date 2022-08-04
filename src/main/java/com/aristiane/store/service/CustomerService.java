package com.aristiane.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aristiane.store.model.Customer;
import com.aristiane.store.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public Customer save(Customer customer) {
		this.repository.save(customer);

		return customer;
	}

	public List<Customer> findAll() {
		List<Customer> customers = this.repository.findAll();

		return customers;

	}

	public void delete(long id) {
		this.repository.deleteById(id);

	}
}
