package com.aristiane.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aristiane.store.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
