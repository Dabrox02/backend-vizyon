package com.jaider.backendvizyon.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaider.backendvizyon.domain.exception.NotInformationFoundException;
import com.jaider.backendvizyon.domain.service.DetalleOrdenService;
import com.jaider.backendvizyon.persistence.dto.DetalleOrdenDTO;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping(path = "/detalle_orden/")
@SecurityRequirement(name = "bearerAuth")
public class DetalleOrdenController {

    @Autowired
    private DetalleOrdenService detalleOrdenService;

    @GetMapping(path = "/all/employees/clients")
    public ResponseEntity<?> findAllEmpleados() {
        try {
            List<DetalleOrdenDTO> response = detalleOrdenService.findOrdenDetailsWithEmployeesAndClients();
            if (response.isEmpty()) {
                throw new NotInformationFoundException("Empleados no encontrados");
            }
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            throw exception;
        }
    }

}
