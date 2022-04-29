package com.microservices.infrastructure.config.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.infrastructure.config.db.schema.PedidoSchema;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoSchema, Long> {

}
