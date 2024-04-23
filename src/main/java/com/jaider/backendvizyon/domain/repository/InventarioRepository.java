package com.jaider.backendvizyon.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaider.backendvizyon.persistence.entity.InventarioEntity;

public interface InventarioRepository extends JpaRepository<InventarioEntity, Long> {

}
