package com.example.service;

import java.util.ArrayList;

import org.springframework.data.domain.Page;

import com.example.dto.EmployeeCreateRequest;
import com.example.dto.EmployeeUpdateRequest;
import com.example.model.Employee;

public interface EmployeeService {
	
    ArrayList<Employee> findAllEmployee();
    
    Employee findAllEmployeeByID(int id);
    
    void addEmployee();
    
    void deleteAllData();
    
    Page<Employee> getEmployees(int page, int size);

	Employee save(Employee employee);
	
	void delete(int id);
	
	Employee add(EmployeeCreateRequest req);
	
	Employee update(Employee employee, EmployeeUpdateRequest req);
}
