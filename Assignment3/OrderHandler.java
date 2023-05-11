/**
 * Student name: Jonathan Regis 
 * Lab professor: Leanne Seaward 
 * Due date: April 09,2023
 * Date modified: April 09, 2023
 * Description: This class demonstrates  that the arrangement
(order) of the catch blocks in your program is essential.
 */

import java.io.IOException;
/**
 * This program shows that order of catch blocks is essential 
 * by first throwing the Exception before the IOException that causes an error 
 * here the code is fixed
 * @author Jonathan 
 *
 */
public class OrderHandler {
	/**
	 * Start of the program
	 * @param args main method 
	 * @throws Exception this shows that it is throwing an exception
	 */
	public static void main(String[] args)throws Exception {
		
		try {
			throw new IOException();
		} catch (IOException e) {
			System.err.println("caught the IO exception" + e.getMessage());
			e.printStackTrace();
		}catch (Exception x) {
			System.err.println("caught a generic exception" + x.getMessage());
			x.printStackTrace();
		}
		
	}

}
