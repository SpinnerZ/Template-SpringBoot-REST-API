package com.springboot.templaterest.services;

import com.springboot.templaterest.entities.HealthCheck;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {
    public HealthCheck healthCheck() {
        return new HealthCheck();
    }
}
