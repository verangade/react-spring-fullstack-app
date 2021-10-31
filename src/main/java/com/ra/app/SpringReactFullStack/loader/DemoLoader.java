package com.ra.app.SpringReactFullStack.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ra.app.SpringReactFullStack.model.Employee;
import com.ra.app.SpringReactFullStack.repository.EmployeeRepository;

@Component
public class DemoLoader implements CommandLineRunner{
	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public DemoLoader(EmployeeRepository employeeRepository) {
		this.employeeRepository=employeeRepository;
	}

	public void run(String... args) throws Exception {
		this.employeeRepository.save(new Employee("Jhon", "Doe", 22,"jhon@yahoo.com"));
		
	}

}
