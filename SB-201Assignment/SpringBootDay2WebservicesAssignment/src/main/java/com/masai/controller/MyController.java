package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
	@RequestMapping("/welcome")
	public String messege() {
		return "Welcome to SpringBoot";
	}
	@RequestMapping("/employee")
	public Employee getEmployee() {
		Employee e=new Employee();
		e.setEmpId(1);
		e.setName("Rakib");
		e.setAddress("Kokata");
		e.setSalary(100);
		return e;
	}
	
	@GetMapping(value="/list")
	public List<Employee> getEmpList(){
		List<Employee> list=new ArrayList();
		Employee e1=new Employee(1,"Rakib","Kolkata",1000);
		Employee e2=new Employee(2,"Ram","Mumbai",3000);
		Employee e3=new Employee(3,"Nijam","Delhi",2000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		return list;
	}
	
	
	
	
}
