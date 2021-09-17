package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootTest
class SpringbootBackendApplicationTests {

	/*
	@Test
	void contextLoads() {
	}
    */
	
	@Autowired
	EmployeeRepository repo;
	
	@Test
	public void testCreate () {
		
		Employee e = new Employee();
		e.setId(1L);
		e.setFirstName("rita");
		e.setLastName("chavan");
		e.setEmailId("rita@gmail.com");
		repo.save(e);
		assertNotNull(repo.findById(1L).get());
		
		
	}

	private void assertNotNull(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
