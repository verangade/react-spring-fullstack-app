package com.ra.app.SpringReactFullStack.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	
	
	
	public Employee() {
		super();
	}



	public Employee(String firstName, String lastName, Integer age, String email) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	

}
