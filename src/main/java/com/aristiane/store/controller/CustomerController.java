package com.aristiane.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aristiane.store.model.Customer;
import com.aristiane.store.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping
	public Customer save(@RequestBody Customer customer) {
		return this.service.save(customer);
	}

	@GetMapping
	public List<Customer> findAll() {
		return service.findAll();

	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {

		this.service.delete(id);

	}
	
}
