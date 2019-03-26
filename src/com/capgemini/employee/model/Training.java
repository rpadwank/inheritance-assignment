package com.capgemini.employee.model;

public class Training {

	private int subjectId;
	private String subject;
	private double fees;
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Training(int subjectId, String subject, double fees) {
		super();
		this.subjectId = subjectId;
		this.subject = subject;
		this.fees = fees;
	}


	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public double getOrderValue()
	{
		return 0;
	}
	
}
