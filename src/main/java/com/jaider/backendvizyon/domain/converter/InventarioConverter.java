package com.jaider.backendvizyon.domain.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jaider.backendvizyon.persistence.dto.InventarioDTO;
import com.jaider.backendvizyon.persistence.entity.InventarioEntity;

@Component
public class InventarioConverter {
    @Autowired
    private ModelMapper modelMapper;

    public InventarioDTO entityToDto(InventarioEntity entity) {
        return modelMapper.map(entity, InventarioDTO.class);
    }

    public InventarioEntity dtoToEntity(InventarioDTO dto) {
        return modelMapper.map(dto, InventarioEntity.class);
    }
}
