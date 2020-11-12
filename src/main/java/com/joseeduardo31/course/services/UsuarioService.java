package com.joseeduardo31.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joseeduardo31.course.entities.Usuario;
import com.joseeduardo31.course.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> listarTodos() {
		return repository.findAll();
	}
	
	public Usuario obterPorId(Long id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.get();
	}
}	
