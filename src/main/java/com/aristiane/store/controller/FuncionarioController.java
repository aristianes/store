package com.aristiane.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aristiane.store.model.Funcionario;
import com.aristiane.store.service.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioService service;
	
	@PostMapping
	public Funcionario save(@RequestBody Funcionario funcionario){
		return this.service.save(funcionario);
		
	}
	
}
