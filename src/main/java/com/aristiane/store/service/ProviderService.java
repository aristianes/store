package com.aristiane.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aristiane.store.model.Provider;
import com.aristiane.store.repository.ProviderRepository;


@Service
public class ProviderService {

	@Autowired
	private ProviderRepository repository;

	public Provider save(Provider provider) {

		this.repository.save(provider);

		return provider;
	}

}
