/*
 * Student name: Jonathan Regis 
 * Lab professor: Leanne Seaward 
 * Due date: April 09,2023
 * Date modified: April 09, 2023
 * Description: This class demonstrates the use of the catch block using catch (Exception exception).
 */
import java.io.IOException;

/**
 * this program demonstrates how to use catch block, all the exception subclasses will be caught in this program
 * it uses different types of exceptions 
 * @author Jonathan
 *
 */
public class DogHandler {
	/**
	 * Start of the program 
	 * @param args main method 
	 */
	public static void main(String[] args) {
	

	try {
		throw new ExceptionDog();
	}catch(Exception e) {
		System.err.println("Wrong Dog foo!" + e.getMessage());
		e.printStackTrace();
	}
}
	
	static void DoExceptionPuppy() {
		try {
			throw new ExceptionPuppy();
		}catch(Exception e) {
			System.err.println("Crazy you got caught again" + e.getMessage());
			e.printStackTrace();
		}
	}
	
		static void DoNullPointerException() {
		try {
			throw new NullPointerException();
		}catch(Exception e) {
			System.err.println("Crazyyyy, shame to your ancestors" + e.getMessage());
			e.printStackTrace();
		}
		
	}
		/**
		 * this method 
		 */
		static void DoIOException() {
		try {
			throw new IOException();
		}catch(Exception e) {
			System.err.println("Another one" + e.getMessage());
			e.printStackTrace();
		}
	
	}


	static class ExceptionDog extends Exception {
		
	}
	static class ExceptionPuppy extends ExceptionDog {
		
	}


}