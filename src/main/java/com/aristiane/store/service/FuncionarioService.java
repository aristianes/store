package com.aristiane.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aristiane.store.model.Funcionario;
import com.aristiane.store.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;

	public Funcionario save(Funcionario funcionario) {
		this.repository.save(funcionario);

		return funcionario;
	}

	public List<Funcionario> findAll() {
		List<Funcionario> funcionarios = this.repository.findAll();

		return funcionarios;

	}

}
