package com.aristiane.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aristiane.store.model.Produto;
import com.aristiane.store.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public Produto save(Produto produto){
		this.repository.save(produto);
		
		return produto;
	}

	public List<Produto> findAll() {
	
		List<Produto> produtos = this.repository.findAll();
		
		return produtos;
	}
}
