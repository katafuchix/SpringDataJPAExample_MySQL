package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.EmployeeServiceImpl;

@Controller
public class TablesController {
	
    @Autowired
    EmployeeServiceImpl employeeService;
    
	@GetMapping("/tables")
	public ModelAndView listAll() {
		ModelAndView mav = new ModelAndView("tables");
		
		// すべてのユーザーを取得する
		mav.addObject("employees", employeeService.findAllEmployee());
		return mav;
	}
	
	@GetMapping("/table1")
	public String index(Model model) {
        model.addAttribute("title", "コンテンツページ");
        System.out.print("aaa");       
        return "table1";
    }
}