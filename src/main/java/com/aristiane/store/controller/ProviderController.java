package com.aristiane.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Provider save (@RequestBody Provider provider){
		return this.service.save(provider);
		
	}
  
	
}
