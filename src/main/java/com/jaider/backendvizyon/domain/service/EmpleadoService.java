package com.jaider.backendvizyon.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaider.backendvizyon.domain.converter.EmpleadoConverter;
import com.jaider.backendvizyon.domain.repository.EmpleadoRepository;
import com.jaider.backendvizyon.persistence.dto.EmpleadoDTO;
import com.jaider.backendvizyon.persistence.entity.EmpleadoEntity;

import jakarta.transaction.Transactional;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private EmpleadoConverter empleadoConverter;

    @Transactional
    public List<EmpleadoDTO> findAllEmpleados() {
        List<EmpleadoEntity> empleadoEntities = empleadoRepository.findAll();
        return empleadoEntities.stream().map(entity -> {
            return empleadoConverter.entityToDto(entity);
        }).toList();
    }

}
