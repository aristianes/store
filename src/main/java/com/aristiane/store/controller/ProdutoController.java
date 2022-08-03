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

import com.aristiane.store.model.Produto;
import com.aristiane.store.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@PostMapping
	public Produto save( @RequestBody Produto produto){
		this.service.save(produto);
		
		return produto;
		
	}
	
	@GetMapping
	public List<Produto> findAll() {
        return service.findAll();
        
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id){
			
		this.service.delete(id);
		
	}
}