/*
 * Student name: Jonathan Regis 
 * Lab Professor: Leanne Seaward 
 * Due date: March 10th 2023
 * Modified: March 10th 2023 
 * Description: This class defines the health data of a patient and calculates the BMI 
 * the age and many other things and displays them for the user.
 */
package com.assignment1;
import java.util.Scanner;


/**
 * This class is the main method for the patient class, it takes input for the user and uses it to display 
 * the health data.
 * @author Jonathan Regis
 *
 */
public class MyHealthDataTest {

	/**
	 * Start of the program
	 * @param args main method
	 */
	public static void main(String[] args) {
		
		double input;
		String Finput;
		String Linput;
		String Ginput;
		int Yinput;
		int Minput;
		int Dinput;
		double Hinput;
		double Winput;
		String report;
		
		Patient patient = new Patient(null, null, null, 0, 0, 0, 0, 0);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please Enter your First name:");
		Finput = keyboard.nextLine();
		patient.setFirstName(Finput);
		
		System.out.print("Please Enter your Last name:");
		Linput = keyboard.nextLine();
		patient.setLastName(Linput);
		
		System.out.println("Please Enter your gender(M/F):");
		Ginput = keyboard.nextLine();
		patient.setGender(Ginput);
		
		System.out.println("Please enter Year of Birth:");
		Yinput = keyboard.nextInt();
		patient.setBirthYear(Yinput);
		keyboard.nextLine();
		
		System.out.println("Enter Month (in decimal):");
		Minput = keyboard.nextInt();
		patient.setBirthMonth(Minput);
		keyboard.nextLine();
		
		System.out.println("Enter day:");
		Dinput = keyboard.nextInt();
		patient.setBirthDay(Dinput);
		keyboard.nextLine();
		
		System.out.println("Please Enter your Height(inches)");
		Hinput = keyboard.nextDouble();
		patient.setHeight(Hinput);
		keyboard.nextLine();
		
		System.out.println("Please Enter your Weight(lbs):");
		Winput = keyboard.nextDouble();
		patient.setWeight(Winput);
		keyboard.nextLine();
		
		
		patient.displayMyHealthData();
		
		
		System.out.println("Program by Jonathan Regis");
		
		
		
		

	}

}
