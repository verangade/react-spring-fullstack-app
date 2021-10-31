package com.ra.app.SpringReactFullStack.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ra.app.SpringReactFullStack.model.Employee;
import com.ra.app.SpringReactFullStack.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	@GetMapping("/getAll")
	public List<Object> getAll() {
		
		Iterable<Employee>  iterable =employeeRepository.findAll();
		List<Object> list = StreamSupport.stream(iterable.spliterator(),false).collect(Collectors.toList());
		return list ;
	}
	
	@PostMapping("/save")
	public String save(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Success";
	}
	

	@GetMapping("/get/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		
		
		return employeeRepository.findById(id).get();
	}

}
