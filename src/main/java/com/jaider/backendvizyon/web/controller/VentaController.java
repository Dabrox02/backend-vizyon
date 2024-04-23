package com.jaider.backendvizyon.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaider.backendvizyon.domain.service.VentaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController()
@RequestMapping(path = "/venta")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping("/month/{numberMonth}/{numberYear}")
    public ResponseEntity<?> findAllVentasByMonth(@PathVariable String numberMonth, @PathVariable String numberYear) {
        try {
            Integer month = Integer.parseInt(numberMonth);
            Integer year = Integer.parseInt(numberYear);
            List<?> response = ventaService.findAllVentasByMonth(month, year);
            return ResponseEntity.ok().body(response);
        } catch (NumberFormatException exception) {
            throw new NumberFormatException("Error al intentar convertir string a number");
        }
    }

    @GetMapping("/")
    public ResponseEntity<?> findAll() {
        try {
            List<?> response = ventaService.findAll();
            return ResponseEntity.ok().body(response);
        } catch (Exception exception) {
            throw exception;
        }
    }

}
