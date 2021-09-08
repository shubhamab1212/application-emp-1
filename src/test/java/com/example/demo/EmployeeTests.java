package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@DataJpaTest
public class EmployeeTests {

	
	@Autowired
	private EmployeeRepository repo;
	
	@Test
	public void testAddEmployee(){
		Employee employee = new Employee ("darshana","dighe","darshana@gmail.com");
		repo.save(employee);
		
		
		
		
	}
	
}
