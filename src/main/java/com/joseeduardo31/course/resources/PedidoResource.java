package com.joseeduardo31.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joseeduardo31.course.entities.Pedido;
import com.joseeduardo31.course.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> listarTodos() {
		List<Pedido> list = service.listarTodos();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	
	public ResponseEntity<Pedido> obterPorId(@PathVariable Long id) {
		Pedido obj = service.obterPorId(id);
		return ResponseEntity.ok().body(obj);
	}
}
