package com.capgemini.employee.model;

public class CorporateTraining extends Training {
	

	private double noOfDays;
	
	
	public CorporateTraining() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CorporateTraining(int subjectId, String subject, double fee, int noOfDays) {
		super(subjectId, subject, fee);
		this.noOfDays = noOfDays;
	}


	public double getNoOfDays() {
		return noOfDays;
	}


	public void setNoOfDays(double noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	@Override
	public double getOrderValue()
	{
		return super.getFees()*noOfDays;
	}
	
}
