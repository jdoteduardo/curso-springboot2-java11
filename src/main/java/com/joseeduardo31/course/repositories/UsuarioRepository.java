package com.joseeduardo31.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseeduardo31.course.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
