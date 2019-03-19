package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Employee;
import com.capgemini.employee.model.Manager;

class ManagerTest {

	private Employee manager;
	
	@BeforeEach
	public void setUp()
	{
		manager = new Manager(104, "John Wick", 20000, 2500);
	}
	
	@Test
	public void testManagerObjectIsCreated()
	{
		Employee manager = new Manager();
		assertNotNull(manager);
	}
	
	@Test
	public void testEmployeeObjectIsCreatedWithParameterizedConstructor()
	{
		Employee manager = new Manager(103, "Jane Doe", 15000, 2000);
		assertNotNull(manager);
		assertEquals(103, manager.getEmployeeId());
		assertEquals("Jane Doe", manager.getEmployeeName());
		assertEquals(15000, manager.getBasicSalary());
		assertEquals(2000, manager.getMedical());
	}

	@Test
	public void testManagerGrossSalary()
	{
		assertEquals(37300, manager.findGrossSalary(),0.01);
	}
	
	@Test
	public void testManagerNetSalary()
	{
		assertEquals(34700, manager.findNetSalary(),0.01);
	}

}
