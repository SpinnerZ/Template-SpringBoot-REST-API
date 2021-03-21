package com.springboot.templaterest.controllers;

import com.springboot.templaterest.entities.HealthCheck;
import com.springboot.templaterest.entities.dtos.ResponseDTO;
import com.springboot.templaterest.services.HealthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/api/healthcheck")
public class HealthCheckController implements Serializable {
    private static final long serialVersionUID = 1L;

    @Autowired
    private HealthCheckService healthCheckService;

    @GetMapping
    public ResponseEntity<ResponseDTO> healthCheck() {
        ResponseDTO<HealthCheck> responseDTO = new ResponseDTO<>(healthCheckService.healthCheck());
        return ResponseEntity.ok(responseDTO);
    }
}
