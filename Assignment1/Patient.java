/*
 * Student name: Jonathan Regis 
 * Lab Professor: Leanne Seaward 
 * Due date: March 10th 2023
 * Modified: March 10th 2023 
 * Description: This class defines the health data of a patient and calculates the BMI 
 * the age and many other things and displays them for the user.
 */

package com.assignment1;

import java.time.LocalDate;
import java.time.Period;
/**
 * 
 * @author Jonathan Regis 
 *This class represents the health data of a patient by getting basic data like the name, age, gender, date of birth etc.
 *it also contains a method for calculating the BMI, Heart rate, MIN and MAX heart rate of the user.
 */
public class Patient {
	
	//This system maintains important health information about a patient.
	//Note: This class assumes values passed to the set methods are correct.
	// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!


	//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private double height;
	private double weight;


	// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE
	/**
	 * This parameterized constructor contains all the necessary parameters needed for the class Patient
	 * @param firstName the first name of the patient 
	 * @param lastName the last name of the patient 
	 * @param gender the gender of the patient (either M for male and F for female)
	 * @param birthYear records ONLY the year the patient was born in 
	 * @param birthMonth records ONLY the month the patient was born in ( takes an int value so the month will be in decimal form)
	 * @param birthDay records ONLY the day the patient was born in 
	 * @param height records the height on the patient in inches 
	 * @param weight records the weight of the patient in pounds (lbs)
	 */
	public Patient(String firstName, String lastName, String gender, int birthYear,
			int birthMonth, int birthDay, double height, double weight) {
		this.gender = gender;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
	}
	
	//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.
	/**
	 * returns the first name of the patient
	 * @return the first name of the patient 
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * sets the first name of the patient 
	 * @param firstName first name of the patient 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * returns the last name of the patient 
	 * @return the last name of the patient 
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * sets the last of the patient 
	 * @param lastName last name of the patient 
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * returns the gender of the patient ( M/F) 
	 * @return gender of the patient 
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * sets the gender of the patient ( the user will either type M for male or F for female)
	 * @param gender the gender of the patient 
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * returns ONLY the birth year of the patient
	 * @return the year the patient was born in 
	 */
	public int getBirthYear() {
		return birthYear;
	}
	/**
	 * sets ONLY the birth year of the patient 
	 * @param birthYear birth year of the patient 
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	/**
	 * returns ONLY the birth month of the patient (takes an integer value so the input of the month is in decimal)
	 * @return the month the patient was born in 
	 */
	public int getBirthMonth() {
		return birthMonth;
	}
	/**
	 * Sets ONLY the birth month (integer value) of the patient 
	 * @param birthMonth Month the patient was born in 
	 */
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	/**
	 * returns ONLY the day the patient was born in 
	 * @return the day the patient was born in 
	 */
	public int getBirthDay() {
		return birthDay;
	}
	/**
	 * sets the day the patient was born in
	 * @param birthDay the day the patient was born 
	 */
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	/**
	 * returns the height of the patient (in INCHES) 
	 * @return the height of the patient 
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * sets the height of the patient ( in INCHES)
	 * @param height height of the patient 
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * returns the weight of the patient (in lbs) 
	 * @return the weight of the patient 
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * sets the weight of the patient (in lbs)
	 * @param weight weight of the patient 
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}


	/**
	 * THIS RETURNS THE PATIENT'S Body Mass Index (BMI) by multiplying the weight by 703, multiplying the height to the power of 2
	 * and finally divide them
	 *  AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!
	 * @return the result of the equation (BMI of the patient)
	 */

	public double getBMI() {
	   return (getWeight() * 703) / (getHeight() * getHeight());
	} 
	/**
	 * This method calculates the age of the patient by subtracting the current date with the birth date of the patient
	 * @param birthYear the year the patient is born in
	 * @param birthMonth the month the patient is born in 
	 * @param birthDay the day the patient is born in 
	 * @return the age of the user
	 */
	public int calculateAge(int birthYear, int birthMonth, int birthDay) { 
		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
		LocalDate CurrentDate = LocalDate.now();
		int Age = Period.between(birthDate, CurrentDate).getYears();
		return Age;
		
	}
	/**
	 * This method calculates the Maximum heart rate of the patient by subtracting the age 
	 * of the patient from 220
	 * @return the maximum heart rate of the patient 
	 */
	public int calculateMaxHeartRate() {
		return(220 - calculateAge(birthYear, birthMonth, birthDay));
	}
	/**
	 * This method calculates the Minimum target heart rate of the patient 
	 * by taking 50% of the Max Heart rate
	 * @return the minimum target heart rate of the patient 
	 */
	public double MinTargetRate() {
		return (0.5 * calculateMaxHeartRate());
	}
	/**
	 * This method calculates the Maximum target heart rate of the patient 
	 * by taking 85% of the max heart rate 
	 * @return the maximum target heart rate of the patient
	 */
	public double MaxTargetRate() {
		return(0.85 * calculateMaxHeartRate());
		 
		 }
		
	
	
	// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION
	/**
	 * This method displays all the data the patient entered for input 
	 * and displays the BMI, age, max heart rate, max target and min target heart rate 
	 * as well as the BMI values
	 */
	public void displayMyHealthData() 
	{ 
		
		int ActualAge = calculateAge(birthYear, birthMonth, birthDay);
		double BMI = getBMI();
	   System.out.printf("%s" , firstName);
	   System.out.println(' ');
	   System.out.printf("%s" , lastName);
	   System.out.println(' ');
	   System.out.printf("%s", gender);
	   System.out.println(" ");
	   System.out.printf("%d/%d/%d" , birthYear, birthMonth, birthDay);
	   System.out.println(" ");
	   System.out.printf("%.1f inches", height);
	   System.out.println(" ");
	   System.out.printf("%.1f lbs", weight);
	   System.out.println(" ");
	   System.out.println(ActualAge + " years old");
	   System.out.printf("Your BMI is %.2f", BMI);
	   System.out.println(" ");
	   System.out.printf("Your Heart rate is %d", calculateMaxHeartRate());
	   System.out.println(" ");
	   System.out.printf("Your Min Heart rate is %.2f", MinTargetRate());
	   System.out.println(" ");
	   System.out.printf("Your Max Heart rate is %.2f", MaxTargetRate());
	   System.out.println(" ");

	//END CODE
	   
	//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

	   System.out.println("BMI VALUES");
	   System.out.println("Underweight: less than 18.5");
	   System.out.println("Normal:      between 18.5 and 24.9");
	   System.out.println("Overweight:  between 25 and 29.9");
	   System.out.println("Obese:       30 or greater");   
	} 

	} // end class Patient





