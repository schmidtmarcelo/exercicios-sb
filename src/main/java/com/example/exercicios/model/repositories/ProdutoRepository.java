package com.example.exercicios.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.exercicios.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);	
}
