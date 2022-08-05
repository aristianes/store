package com.aristiane.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aristiane.store.model.Provider;


@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

}


