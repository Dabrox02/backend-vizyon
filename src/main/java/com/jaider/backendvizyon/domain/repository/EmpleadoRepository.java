package com.jaider.backendvizyon.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaider.backendvizyon.persistence.entity.EmpleadoEntity;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {


    
}
