package com.joseeduardo31.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joseeduardo31.course.entities.Usuario;
import com.joseeduardo31.course.repositories.UsuarioRepository;
import com.joseeduardo31.course.services.exceptions.ResourceNotFoundException;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> listarTodos() {
		return repository.findAll();
	}
	
	public Usuario obterPorId(Long id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Usuario inserir(Usuario obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Usuario atualizar(Long id, Usuario obj) {
		Usuario entidade = repository.getOne(id);
		atualizarDados(entidade, obj);
		return repository.save(entidade);
	}

	private void atualizarDados(Usuario entidade, Usuario obj) {
		entidade.setNome(obj.getNome());
		entidade.setEmail(obj.getEmail());
		entidade.setTelefone(obj.getTelefone());
	}
}	
