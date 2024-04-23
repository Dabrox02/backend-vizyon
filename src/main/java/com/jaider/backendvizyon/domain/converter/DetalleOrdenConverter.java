package com.jaider.backendvizyon.domain.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jaider.backendvizyon.persistence.dto.DetalleOrdenDTO;
import com.jaider.backendvizyon.persistence.entity.DetalleOrdenEntity;

@Component
public class DetalleOrdenConverter {

    @Autowired
    private ModelMapper modelMapper;

    public DetalleOrdenDTO entityToDto(DetalleOrdenEntity entity) {
        return modelMapper.map(entity, DetalleOrdenDTO.class);
    }

    public DetalleOrdenEntity dtoToEntity(DetalleOrdenDTO dto) {
        return modelMapper.map(dto, DetalleOrdenEntity.class);
    }
}