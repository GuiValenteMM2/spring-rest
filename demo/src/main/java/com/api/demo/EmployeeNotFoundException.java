package com.api.demo;

public class EmployeeNotFoundException extends RuntimeException{
    
    EmployeeNotFoundException(Long id) {
        super("Employee id not found: " + id);
    }
}
