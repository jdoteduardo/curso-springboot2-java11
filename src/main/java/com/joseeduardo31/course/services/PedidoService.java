package com.joseeduardo31.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joseeduardo31.course.entities.Pedido;
import com.joseeduardo31.course.repositories.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repository;
	
	public List<Pedido> listarTodos() {
		return repository.findAll();
	}
	
	public Pedido obterPorId(Long id) {
		Optional<Pedido> obj = repository.findById(id);
		return obj.get();
	}
}	
