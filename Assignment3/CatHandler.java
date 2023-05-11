/*
 * Student name: Jonathan Regis 
 * Lab professor: Leanne Seaward 
 * Due date: April 09,2023
 * Date modified: April 09, 2023
 * Description: This class practices inheritance concepts
 */

/**
 * This class uses try and catch to demonstrate inheritance it uses subclasses that will be
 * caught in the catch block of the superclass
 * @author Jonathan
 *
 */
public class CatHandler {
	/**
	 * start of the program
	 * @param args main method 
	 */
	public static void main(String[] args) {
	
		try {
		 throw new ExceptionGammer();
	} catch(ExceptionAlpha e) { 
		System.err.println("Caught" + e.getMessage());
		e.printStackTrace();
		
	}
		try {
			throw new ExceptionBeta();
		} catch(ExceptionAlpha e) {
			System.err.println("Caught again my boi" + e.getMessage());
			e.printStackTrace();
		}
	}
	static class ExceptionAlpha extends Exception {
	
	}
	static class ExceptionBeta extends  ExceptionAlpha {
		
	}
	static class ExceptionGammer extends ExceptionBeta {
		
	}
}
