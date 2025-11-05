package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.demo.config.AppConfig;
import com.example.demo.service.EmployeeService;

public class App {
    public static void main(String[] args) {
        // Create Spring container using Java-based configuration
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the EmployeeService bean from Spring container
        EmployeeService service = context.getBean(EmployeeService.class);

        // Call the method to verify DI works
        service.showMessage();

        context.close();
    }
}
