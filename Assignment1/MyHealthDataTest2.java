/*
 * Student name: Jonathan Regis 
 * Lab Professor: Leanne Seaward 
 * Due date: March 10th 2023
 * Modified: March 10th 2023 
 * Description: This class defines the health data of a patient and calculates the BMI 
 * the age and many other things and displays them for the user.
 */


package com.assignment1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * Assumption: This is the test case for the MyHealthDataTest class 
 * I believe the first test will be successful because all the codes were entered correctly 
 * the second test will fail because I inputed the height in feet and inches instead of only inches.
 * @author Jonathan Regis 
 * Modifications: During the test, I realized that the age output was wrong, so I changed the method for the age in 
 * order to take into account the birth month and the birthday.
 * In order to make sure that the user enters his height in inches, I wrote in the prompt that the height should be entered in inches only.
 */
public class MyHealthDataTest2 {
	private static final double EPSILON = 1E-12;
	@Test
	/**
	 * This test will pass because everything was inputed correctly
	 */
	public void testgetBMI() {
		Patient user = new Patient("Jonathan","Regis", "M", 2000, 11, 28, 50, 130);
		 double BMI = user.getBMI();
		double expected = 36.556;
		System.out.println("Test 1 was succesful");
		assertEquals(BMI, expected, EPSILON);

	
	}
	 @Test
	 /**
	  * this test will fail because the height was in foot and inches instead of just inches
	  */
	public void testgetBMIfail() {
		Patient user = new Patient("Jonathan", "Regis", "F", 2000,11,28,70, 164);
		double BMI = user.getBMI();
		double expected = 22.871;
		System.out.println("Test 2 failed :(");
		assertEquals(BMI, expected, EPSILON);

	}
}
