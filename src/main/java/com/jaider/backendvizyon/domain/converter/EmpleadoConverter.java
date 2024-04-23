package com.jaider.backendvizyon.domain.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jaider.backendvizyon.persistence.dto.EmpleadoDTO;
import com.jaider.backendvizyon.persistence.entity.EmpleadoEntity;

@Component
public class EmpleadoConverter {

    @Autowired
    private ModelMapper modelMapper;

    public EmpleadoDTO entityToDto(EmpleadoEntity entity) {
        return modelMapper.map(entity, EmpleadoDTO.class);
    }

    public EmpleadoEntity dtoToEntity(EmpleadoDTO dto) {
        return modelMapper.map(dto, EmpleadoEntity.class);
    }
}
