/*
 * Student name: Jonathan Regis 
 * Lab professor: Leanne Seaward 
 * Due date: March 26,2023
 * Date modified: March 26, 2023
 * Description: This program tests the clock class and prints it
 * 
 */

/**
 * tests the clock class
 * @author Jonathan
 *
 */
public class ClockDemo
{
	/**
	 * start of the program
	 * @param args start of the program
	 */
   public static void main(String[] args)
   {
      //test Clock
      System.out.println("Testing Clock class");
      Clock clock = new Clock();
      System.out.println("Hours: " + clock.getHours());
      System.out.println("Minutes: " + clock.getMinutes());
      System.out.println("Time: " + clock.getTime());
      
      
   }
   
     
   
   
   
}
