package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Employee;

class EmployeeTest {

	private Employee employee;
	
	@BeforeEach
	public void setUp()
	{
		employee = new Employee(101, "John Doe", 10000, 2000);
	}

	@Test
	public void testEmployeeObjectIsCreated()
	{
		Employee employee = new Employee();
		assertNotNull(employee);
	}
	
	@Test
	public void testEmployeeObjectIsCreatedWithParameterizedConstructor()
	{
		Employee employee = new Employee(103, "Jane Doe", 15000, 2000);
		assertNotNull(employee);
		assertEquals(103, employee.getEmployeeId());
		assertEquals("Jane Doe", employee.getEmployeeName());
		assertEquals(15000, employee.getBasicSalary());
		assertEquals(2000, employee.getMedical());
	}
	
	@Test
	public void testEmployeeGrossSalary()
	{
		assertEquals(17000, employee.findGrossSalary(),0.01);
	}
	
	@Test
	public void testEmployeeNetSalary()
	{
		assertEquals(15600, employee.findNetSalary(),0.01);
	}
	
}
