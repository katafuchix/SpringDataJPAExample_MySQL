package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.EmployeeServiceImpl;

@Controller
//@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;
    
	@GetMapping("/")
	public ModelAndView listAll() {
		
	//logger.info("Called.");
        //logger.error("Error.");
        
		ModelAndView mav = new ModelAndView("index");
		
		// すべてのユーザーを取得する
		mav.addObject("employees", employeeService.findAllEmployee());
		return mav;
	}
	
	/*
    @GetMapping("/")
    public ArrayList<Employee> getAllEmployee() {
    	return employeeService.findAllEmployee();
    }
    */
}
