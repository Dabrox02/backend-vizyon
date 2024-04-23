package com.jaider.backendvizyon.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaider.backendvizyon.domain.converter.InventarioConverter;
import com.jaider.backendvizyon.domain.repository.InventarioRepository;
import com.jaider.backendvizyon.persistence.dto.InventarioDTO;
import com.jaider.backendvizyon.persistence.entity.InventarioEntity;

import jakarta.transaction.Transactional;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    @Autowired
    private InventarioConverter inventarioConverter;

    @Transactional
    public List<InventarioDTO> findAllWithTallaAndColor() {
        List<InventarioEntity> inventarioEntities = inventarioRepository.findAll();
        List<InventarioDTO> inventarioDTOs = inventarioEntities.stream().map(entity -> {
            InventarioDTO dto = inventarioConverter.entityToDto(entity);
            return dto;
        }).toList();

        return inventarioDTOs;
    }

}
