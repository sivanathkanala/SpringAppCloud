package com.example.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="agent")
public class Agent {
	
	public Agent()
	{
		
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Id
	//@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	private String name;
	
	@NotNull
	private long salary;
	
	public Agent(int id, String name, long salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Agent(int id)
	{
		this.id = id;		
	}

}
