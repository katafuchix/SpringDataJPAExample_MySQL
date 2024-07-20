package com.example.service;

import java.util.ArrayList;

import org.springframework.data.domain.Page;

import com.example.model.Employee;

public interface EmployeeService {
	
    ArrayList<Employee> findAllEmployee();
    
    Employee findAllEmployeeByID(int id);
    
    void addEmployee();
    
    void deleteAllData();
    
    Page<Employee> getEmployees(int page, int size);
    
}
