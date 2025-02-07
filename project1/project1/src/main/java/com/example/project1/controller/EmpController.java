package com.example.project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.project1.model.Employee;
import com.example.project1.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService es;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/reg")
	public String register() {
		return "register";
	}
	
	@GetMapping("/getall")
	public String getall(Model m) {
		List<Employee> list = es.getall();
		m.addAttribute("l",list);
		return "list1";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute Employee e,Model m) {
		es.insert(e);
		m.addAttribute("emp",e);
		return "success";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model m) {
		Employee emp = es.getbyid(id);
		m.addAttribute("emp1",emp);
		return "edit";
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable int id, @ModelAttribute Employee e) {
		es.update(id, e);
		return "redirect:/getall";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		es.delete(id);
		return "redirect:/getall";
	}
	
	
}
