package com.NBdiMAN.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.NBdiMAN.domain.Employee;
import com.NBdiMAN.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("employees", service.listAll());
		return "employee/list";
	}
	
	@RequestMapping("/input")
	public String input(Model model, Long id) {
		if(id != null) {
			model.addAttribute("employee", service.get(id)); 
		}
		return "employee/input";
	}
	
	@RequestMapping("/saveOrUpdate")
	public String saveOrUpdate(Employee employee) {
		if(employee.getId() == null) {
			service.save(employee);
		}else {
			service.update(employee);
		}
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id) {
		service.delete(id);
		return "redirect:list";
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/list1")
	@ResponseBody
	public List<Employee> list1() {
		List<Employee> emps = service.listAll();
		return emps;
	}
}
