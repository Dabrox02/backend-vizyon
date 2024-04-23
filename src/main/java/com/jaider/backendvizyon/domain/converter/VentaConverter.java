package com.jaider.backendvizyon.domain.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jaider.backendvizyon.persistence.dto.VentaDTO;
import com.jaider.backendvizyon.persistence.entity.VentaEntity;

@Component
public class VentaConverter {

    @Autowired
    private ModelMapper modelMapper;

    public VentaDTO entityToDto(VentaEntity entity) {
        return modelMapper.map(entity, VentaDTO.class);
    }

    public VentaEntity dtoToEntity(VentaDTO dto) {
        return modelMapper.map(dto, VentaEntity.class);
    }

}
