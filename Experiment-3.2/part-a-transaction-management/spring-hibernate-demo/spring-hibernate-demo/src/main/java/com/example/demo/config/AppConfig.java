package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.service.EmployeeService;

@Configuration
public class AppConfig {

    // This method tells Spring how to create the EmployeeService bean
    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService();
    }
}
