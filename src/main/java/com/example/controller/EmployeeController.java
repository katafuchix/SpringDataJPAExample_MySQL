package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Employee;
import com.example.service.EmployeeServiceImpl;

@Controller
//@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;
    
	@GetMapping("/")
	public ModelAndView listAll() {
		ModelAndView mav = new ModelAndView("index");
		
		// すべてのユーザーを取得する
		mav.addObject("employees", employeeService.findAllEmployee());
		return mav;
	}
	
    @GetMapping("/employee/list")
    public String index(Model model) { // ②
        List<Employee> employees = employeeService.findAllEmployee();
        model.addAttribute("employees", employees); // ③
        return "employee/list"; // ④
    }
    
    @GetMapping("/employee/new")
    public String newPlayer(Model model) {
        return "/employee/new";
    }
    
    @PostMapping("/employee")
    public String create(@ModelAttribute Employee employee) { // ⑥
    	employeeService.save(employee);
        return "redirect:/employee/list"; // ⑦
    }
    
    @GetMapping("/employee/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) { // ⑤
    	Employee employee = employeeService.findAllEmployeeByID(id);
        model.addAttribute("employee", employee);
        return "employee/edit";
    }
    
    @PutMapping("/employee/{id}")
    public String update(@PathVariable Integer id, @ModelAttribute Employee employee) {
    	employee.setId(id);
    	employeeService.save(employee);
        return "redirect:/employee/list";
    }
    
    @GetMapping("/employee/{id}")
    public String show(@PathVariable Integer id, Model model) {
    	Employee employee = employeeService.findAllEmployeeByID(id);
        model.addAttribute("employee", employee);
        return "employee/show";
    }
    
    @DeleteMapping("/employee/{id}")
    public String destroy(@PathVariable Integer id) {
    	employeeService.delete(id);
        return "redirect:/employee/list";
    }
    
}