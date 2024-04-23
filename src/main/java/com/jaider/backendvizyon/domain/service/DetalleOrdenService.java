package com.jaider.backendvizyon.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaider.backendvizyon.domain.converter.DetalleOrdenConverter;
import com.jaider.backendvizyon.domain.repository.DetalleOrdenRepository;
import com.jaider.backendvizyon.persistence.dto.DetalleOrdenDTO;
import com.jaider.backendvizyon.persistence.entity.DetalleOrdenEntity;

@Service
public class DetalleOrdenService {

    @Autowired
    private DetalleOrdenRepository detalleOrdenRepository;

    @Autowired
    private DetalleOrdenConverter detalleOrdenConverter;

    public List<DetalleOrdenDTO> findOrdenDetailsWithEmployeesAndClients() {
        List<DetalleOrdenEntity> detalleOrdenEntities = detalleOrdenRepository.findAll();
        return detalleOrdenEntities.stream().map(entity -> {
            DetalleOrdenDTO dto = detalleOrdenConverter.entityToDto(entity);
            dto.getOrden().setEstado(null);
            dto.getOrden().setFecha(null);
            return dto;
        }).toList();
    }

}
