/*
 * Author/modified by: Jonathan Regis 	
 * Professor: Wafa Hassanain
 * Date: Jan 28th 2023
 * Description: Lab Exam 02 (22F) Section 332
 */

import java.util.Scanner;
/*
 * this Program will calculate the total weight of a tea bag box and tell the user if the weight is within range or not 
 */
public class LabExam2_Main {
/*
 * Entry point for the program
 */
	public static void main(String[] args) {
		
		TeaBagBox teabagbox = new TeaBagBox();
		Scanner keyboard = new Scanner(System.in);
		double userInput;
		double userInput2;
		String Y;
		String TotalWeight;
		String MoreData = "Y";
		
			
	
			do{System.out.println("Enter tea bag Weight (grams): ");
			userInput = keyboard.nextDouble();
						keyboard.nextLine();
			teabagbox.setBagWeight(userInput);
			
			System.out.println("Enter tea bag count: ");
			userInput2 = keyboard.nextDouble();
					     keyboard.nextLine();
			teabagbox.setBagCount(userInput2);
			 
			TotalWeight = teabagbox.checkTotalWeight();
		
			System.out.println("CheckTotalWeight reports: " + TotalWeight);
	
			System.out.println("Enter values again? (Y/N): ");
		
			MoreData = keyboard.nextLine();
			}while(MoreData.toLowerCase().equalsIgnoreCase("Y"));
		
		System.out.println("Program by Jonathan Regis");
		}
	}
/*
 * end of the program 
 */
