package com.jaider.backendvizyon.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaider.backendvizyon.domain.service.AuthService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "/auth")
@SecurityRequirement(name = "bearerAuth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/token")
    public ResponseEntity<?> generateToken() {
        Map<String, String> token = authService.generateToken();
        return ResponseEntity.ok().body(token);
    }

}
