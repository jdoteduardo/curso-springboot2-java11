package com.joseeduardo31.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joseeduardo31.course.entities.Usuario;
import com.joseeduardo31.course.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listarTodos() {
		List<Usuario> list = service.listarTodos();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	
	public ResponseEntity<Usuario> obterPorId(@PathVariable Long id) {
		Usuario obj = service.obterPorId(id);
		return ResponseEntity.ok().body(obj);
	}
}
