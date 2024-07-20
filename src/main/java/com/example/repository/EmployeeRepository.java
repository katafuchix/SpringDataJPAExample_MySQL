package com.example.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Employee;

//@Repository is a Spring annotation that
//indicates that the decorated class is a repository.

//@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    ArrayList<Employee> findAll();
}

// Spring Data JDBC では CrudRepository を利用する
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;