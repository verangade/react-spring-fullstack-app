package com.ra.app.SpringReactFullStack.repository;

import org.springframework.data.repository.CrudRepository;

import com.ra.app.SpringReactFullStack.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
