package com.aristiane.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aristiane.store.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
