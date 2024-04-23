package com.jaider.backendvizyon.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaider.backendvizyon.domain.exception.NotInformationFoundException;
import com.jaider.backendvizyon.domain.service.InventarioService;
import com.jaider.backendvizyon.persistence.dto.InventarioDTO;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping(path = "/inventario")
@SecurityRequirement(name = "bearerAuth")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping(path = "/all/talla/color")
    public ResponseEntity<?> findAllEmpleados() {
        try {
            List<InventarioDTO> response = inventarioService.findAllWithTallaAndColor();
            if (response.isEmpty()) {
                throw new NotInformationFoundException("Productos no encontrados");
            }
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            throw exception;
        }
    }

}
