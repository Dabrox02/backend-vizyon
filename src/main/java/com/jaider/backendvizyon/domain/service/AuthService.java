package com.jaider.backendvizyon.domain.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaider.backendvizyon.domain.security.JWTAuthorizationFilter;
import com.jaider.backendvizyon.domain.security.JWTAuthtenticationConfig;

@Service
public class AuthService {

    @Autowired
    JWTAuthtenticationConfig jwtAuthtenticationConfig;

    @Autowired
    JWTAuthorizationFilter jwtAuthorizationFilter;

    public Map<String, String> generateToken() {
        Map<String, String> response = new HashMap<>();
        String token = jwtAuthtenticationConfig.getJWTToken("user");
        response.put("token", token);
        return response;
    }

}
