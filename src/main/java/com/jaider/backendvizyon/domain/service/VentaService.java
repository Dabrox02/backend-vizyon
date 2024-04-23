package com.jaider.backendvizyon.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaider.backendvizyon.domain.converter.VentaConverter;
import com.jaider.backendvizyon.domain.repository.VentaRepository;
import com.jaider.backendvizyon.persistence.dto.VentaDTO;
import com.jaider.backendvizyon.persistence.entity.VentaEntity;

import jakarta.transaction.Transactional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private VentaConverter ventaConverter;

    @Transactional
    public List<VentaDTO> findAllVentasByMonth(Integer month, Integer year) {
        List<VentaEntity> ventaEntities = ventaRepository.findAllVentasByMonth(month, year);
        List<VentaDTO> ventaDTO = ventaEntities.stream().map(entity -> {
            return ventaConverter.entityToDto(entity);
        }).toList();
        return ventaDTO;
    }

    @Transactional
    public List<VentaDTO> findAll() {
        List<VentaEntity> ventaEntities = ventaRepository.findAll();
        List<VentaDTO> ventaDTO = ventaEntities.stream().map(entity -> {
            VentaDTO dto = ventaConverter.entityToDto(entity);
            dto.setEmpleado(null);
            return dto;
        }).toList();
        return ventaDTO;
    }

}
