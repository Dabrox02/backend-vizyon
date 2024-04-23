package com.jaider.backendvizyon.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jaider.backendvizyon.persistence.entity.VentaEntity;

public interface VentaRepository extends JpaRepository<VentaEntity, Long> {

    @Query(value = "SELECT v FROM VentaEntity v WHERE MONTH(v.fecha) = ?1 AND YEAR(v.fecha) = ?2")
    List<VentaEntity> findAllVentasByMonth(Integer month, Integer year);

}
