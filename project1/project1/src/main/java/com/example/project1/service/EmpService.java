package com.example.project1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project1.model.Employee;
import com.example.project1.repo.Repo;

@Service
public class EmpService {
	
	@Autowired
	private Repo r;
	
	public void insert(Employee e) {
		r.save(e);
	}
	
	public List<Employee> getall(){
		List<Employee> all = r.findAll();
		return all;
	}
	
	public Employee getbyid(int id) {
		Employee e = r.findById(id).get();
		return e;
	}
	
	public void update(int id,Employee e) {
		Optional<Employee> byId = r.findById(id);
		if(byId.isPresent()) {
			Employee e1=byId.get();
			e1.setAge(e.getAge());
			e1.setEmail(e.getEmail());
			e1.setEname(e.getEname());
			r.save(e1);
		}
		
		
	}
	public void delete(int id) {
		r.deleteById(id);
	}
	
	
}
