package com.joseeduardo31.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joseeduardo31.course.entities.Categoria;
import com.joseeduardo31.course.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repository;
	
	public List<Categoria> listarTodos() {
		return repository.findAll();
	}
	
	public Categoria obterPorId(Long id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.get();
	}
}	
