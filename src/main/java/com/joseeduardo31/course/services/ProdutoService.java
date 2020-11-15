package com.joseeduardo31.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joseeduardo31.course.entities.Produto;
import com.joseeduardo31.course.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> listarTodos() {
		return repository.findAll();
	}
	
	public Produto obterPorId(Long id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.get();
	}
}	
