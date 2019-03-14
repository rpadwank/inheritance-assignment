package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.MarketingExecutive;

class MarketingExecutiveTest {

private MarketingExecutive marketingExecutive;
	
	@BeforeEach
	public void setUp()
	{
		marketingExecutive = new MarketingExecutive(104, "John Wick", 20000, 2500, 100);
	}
	
	@Test
	public void testMarketingExecutiveObjectIsCreated()
	{
		MarketingExecutive marketingExecutive = new MarketingExecutive();
		assertNotNull(marketingExecutive);
	}
	
	@Test
	public void testMarketingExecutiveIsCreatedWithParameterizedConstructor()
	{
		MarketingExecutive marketingExecutive = new MarketingExecutive(103, "Jane Doe", 15000, 2000, 100);
		assertNotNull(marketingExecutive);
		assertEquals(103, marketingExecutive.getEmployeeId());
		assertEquals("Jane Doe", marketingExecutive.getEmployeeName());
		assertEquals(15000, marketingExecutive.getBasicSalary());
		assertEquals(2000, marketingExecutive.getMedical());
		assertEquals(100, marketingExecutive.getKilometerTravelled());
	}
	
	@Test
	public void testMarketingExecutiveGrossSalary()
	{
		assertEquals(34500, marketingExecutive.findGrossSalary());
	}
	
	@Test
	public void testMarketingExecutiveNetSalary()
	{
		assertEquals(31900, marketingExecutive.findNetSalary());
	}

}
