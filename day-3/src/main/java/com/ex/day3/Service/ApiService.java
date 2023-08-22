package com.ex.day3.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.day3.Models.Employee;
import com.ex.day3.Repositories.EmployeeRepo;

@Service
public class ApiService {
	
	@Autowired
	EmployeeRepo emprepo;
	
	public Employee saveinfo(Employee employee) {
		return emprepo.save(employee);
	}
	
	public List<Employee> showinfo(){
		return emprepo.findAll();
	}
}