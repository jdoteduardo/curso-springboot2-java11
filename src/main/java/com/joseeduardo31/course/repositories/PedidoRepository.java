package com.joseeduardo31.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseeduardo31.course.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
