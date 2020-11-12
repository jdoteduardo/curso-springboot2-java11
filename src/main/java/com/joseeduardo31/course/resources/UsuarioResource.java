package com.joseeduardo31.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joseeduardo31.course.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<Usuario> listarTodos() {
		Usuario u = new Usuario(1L, "Eduardo", "joseeduardo0131@gmail.com", "81998949954", "310198");
		return ResponseEntity.ok().body(u);
	}
}
