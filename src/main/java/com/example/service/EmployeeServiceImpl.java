package com.example.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

//@Service marks a Java class that performs some service,
//such as executing business logic, performing 
//calculations, and calling external APIs.
@Service 
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
  
    @Override
    public ArrayList<Employee> findAllEmployee() {
        return (ArrayList<Employee>) employeeRepository.findAll();
    }
    
    @Override
    public Employee findAllEmployeeByID(int id) {
        Optional<Employee> opt = employeeRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
    }
  
    @Override
    public void addEmployee() {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Lucknow", "Shubham"));
        emp.add(new Employee("Delhi", "Puneet"));
        emp.add(new Employee("Pune", "Abhay"));
        emp.add(new Employee("Noida", "Anurag"));
        for (Employee employee : emp) {
            employeeRepository.save(employee);
        }
    }
  
    @Override
    public void deleteAllData() {
        employeeRepository.deleteAll();
    }
    
    @Override
    public Page<Employee> getEmployees(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return employeeRepository.findAll(pageable);
    }
    
    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }
}
