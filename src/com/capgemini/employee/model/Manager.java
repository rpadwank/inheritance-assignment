package com.capgemini.employee.model;

public class Manager extends Employee {

	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	
	public Manager() {
	}
	
	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		this.petrolAllowance = 0.08 * super.getBasicSalary();
		foodAllowance = 0.13 * super.getBasicSalary();
		otherAllowance = 0.03 * super.getBasicSalary();
	}
	
	public double findGrossSalary() {
		double grossSalary = super.findGrossSalary() + petrolAllowance + foodAllowance + otherAllowance;
		return grossSalary;
	}
	
	
	
}
