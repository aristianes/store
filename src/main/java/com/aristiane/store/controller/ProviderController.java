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

import com.aristiane.store.model.Provider;
import com.aristiane.store.service.ProviderService;

@RestController
@RequestMapping("/provider")
public class ProviderController {

	@Autowired
	private ProviderService service;

	@PostMapping
	public Provider save(@RequestBody Provider provider) {
		return this.service.save(provider);

	}

	@GetMapping
	public List<Provider> findAll() {
		return service.findAll();

	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {

		this.service.delete(id);

	}

}
