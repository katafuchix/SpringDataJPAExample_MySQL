package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.EmployeeServiceImpl;

@Controller
//@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;
    
	@GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "コンテンツページ");
        System.out.print("aaa");       
        return "index";
    }
	/*
	public ModelAndView listAll() {
        
		ModelAndView mav = new ModelAndView("index");
		
		// すべてのユーザーを取得する
		mav.addObject("employees", employeeService.findAllEmployee());
		return mav;
	}
	*/
	
	/*
    @GetMapping("/")
    public ArrayList<Employee> getAllEmployee() {
    	return employeeService.findAllEmployee();
    }
    */
}
