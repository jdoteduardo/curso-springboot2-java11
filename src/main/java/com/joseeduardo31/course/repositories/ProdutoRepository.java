package com.joseeduardo31.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseeduardo31.course.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
