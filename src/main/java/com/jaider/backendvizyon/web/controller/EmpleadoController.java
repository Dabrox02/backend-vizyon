package com.jaider.backendvizyon.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaider.backendvizyon.domain.exception.NotInformationFoundException;
import com.jaider.backendvizyon.domain.service.EmpleadoService;
import com.jaider.backendvizyon.persistence.dto.EmpleadoDTO;

@RestController
@RequestMapping(path = "/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping(path = "/all")
    public ResponseEntity<?> findAllEmpleados() {
        try {
            List<EmpleadoDTO> response = empleadoService.findAllEmpleados();
            if (response.isEmpty()) {
                throw new NotInformationFoundException("Empleados no encontrados");
            }
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            throw exception;
        }
    }

}
