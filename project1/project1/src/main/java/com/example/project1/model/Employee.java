package com.example.project1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="project1_emp")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ename;
	private int age;
	private String email;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", age=" + age + ", email=" + email + "]";
	}
	public Employee(String ename, int age, String email) {
		super();
		this.ename = ename;
		this.age = age;
		this.email = email;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
