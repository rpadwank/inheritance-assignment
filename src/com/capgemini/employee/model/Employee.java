package com.capgemini.employee.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double medical;
	private static double pt = 200;
	public Employee() {
		
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double findGrossSalary() {
		double grossSalary = basicSalary + (0.5*basicSalary) + medical;
		return grossSalary;
	}

	public double findNetSalary() {
		double pf = 0.12 * basicSalary;
		double netSalary = findGrossSalary() - (pt+pf);
		return netSalary;
	}

	
}
