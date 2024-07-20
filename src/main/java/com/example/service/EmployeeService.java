package com.example.service;

import java.util.ArrayList;

import com.example.model.Employee;

public interface EmployeeService {
	
    ArrayList<Employee> findAllEmployee();
    
    Employee findAllEmployeeByID(int id);
    
    void addEmployee();
    
    void deleteAllData();
    
}
