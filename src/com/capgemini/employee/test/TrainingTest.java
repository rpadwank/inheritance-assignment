package com.capgemini.employee.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.employee.model.CorporateTraining;
import com.capgemini.employee.model.PublicTraining;
import com.capgemini.employee.model.Training;

public class TrainingTest {

	private Training training;
	
	@Test
	public void testPublicTrainingWithValidInput() {
		training = new PublicTraining(1, "Java", 5000, 50);
		assertEquals(250000, training.getOrderValue(),0.1);
	}

	@Test
	public void testCorporateTrainingWithValidInput() {
		training = new CorporateTraining(2, "Big Data", 35000, 4);
		assertEquals(140000, training.getOrderValue(),0.1);
	}
}
