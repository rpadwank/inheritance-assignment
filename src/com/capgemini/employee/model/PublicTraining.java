package com.capgemini.employee.model;

public class PublicTraining extends Training {
	private int participants;
	public PublicTraining() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PublicTraining(int subjectId, String subject, double fees, int participants) {
		super(subjectId, subject, fees);
		this.participants = participants;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}
	
	@Override
	public double getOrderValue()
	{
		return super.getFees()*participants;
	}
	
}
