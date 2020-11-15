package com.joseeduardo31.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joseeduardo31.course.entities.Produto;
import com.joseeduardo31.course.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public ResponseEntity<List<Produto>> listarTodos() {
		List<Produto> list = service.listarTodos();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	
	public ResponseEntity<Produto> obterPorId(@PathVariable Long id) {
		Produto obj = service.obterPorId(id);
		return ResponseEntity.ok().body(obj);
	}
}
