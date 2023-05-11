/*
 * Student name: Jonathan Regis 
 * Lab professor: Leanne Seaward 
 * Due date: April 09,2023
 * Date modified: April 09, 2023
 * Description: This class demonstrates rethrowing of an exception.
 */

/**
 * This program uses method calls to rethrow exceptions, EasterStarting calls EasterEnding
 * and throws an exception, EasterEnding just throws an exception.
 * @author Jonathan 
 *
 */
public class FishHandler {
	/**
	 * Start of the program 
	 * @param args main method 
	 */
	public static void main(String[] args) {
		try {
			EasterStarting();
		} catch(Exception e) {
			System.err.println("Caught First" + e.getMessage());
			e.printStackTrace();
		}

	}
	/**
	 * method that deals with the exception that EasterEnding will throw
	 * @throws Exception catches an exception
	 */
	public static void EasterStarting() throws Exception {
		try {
			EasterEnding();
		} catch(Exception e) {
			System.err.println("Caught in EasterStarting" + e.getMessage());
			e.printStackTrace();
		}
		throw new Exception();
	}
	/**
	 * method that throws an exception 
	 * @throws Exception an exception 
	 */
	public static void EasterEnding() throws Exception {
		throw new Exception();
	}
}
