package com.jaider.backendvizyon.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaider.backendvizyon.persistence.entity.DetalleOrdenEntity;

public interface DetalleOrdenRepository extends JpaRepository<DetalleOrdenEntity, Long> {

}