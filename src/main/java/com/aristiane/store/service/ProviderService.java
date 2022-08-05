package com.aristiane.store.service;

import java.util.List;

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

	public List<Provider> findAll() {
		List<Provider> providers = this.repository.findAll();

		return providers;

	}

}
