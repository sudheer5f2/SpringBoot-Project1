package com.example.project1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project1.model.Employee;

@Repository
public interface Repo extends JpaRepository<Employee, Integer> {

}
