package com.capgemini.employee.model;

public class MarketingExecutive extends Employee {

	private double kilometerTravelled;
	private double telephoneAllowance=1500;
	public MarketingExecutive() {
		
	}

	public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medical, double kilometerTravelled) {
		super(employeeId, employeeName, basicSalary, medical);
		this.kilometerTravelled = kilometerTravelled;
	}

	public double getKilometerTravelled() {
		return kilometerTravelled;
	}

	public void setKilometerTravelled(double kilometerTravelled) {
		this.kilometerTravelled = kilometerTravelled;
	}
	
	public double findGrossSalary()
	{
		double grossSalary = super.findGrossSalary() + kilometerTravelled*5 + telephoneAllowance;
		return grossSalary;
	}

}
