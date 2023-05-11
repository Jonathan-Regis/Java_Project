/*
 * Student name: Jonathan Regis 
 * Lab professor: Leanne Seaward 
 * Due date: March 26,2023
 * Date modified: March 26, 2023
 * Description: This program tests the WorldClock class
 * 
 */

/**
 * Tests the Clock and WorldClock Classes.
 */
public class WorldClockDemo
{
	/**
	 * Start of the program
	 * @param args start of the program
	 */
   public static void main(String[] args)
   {
      //test WorldClock
      System.out.println("");
      System.out.println("Testing WorldClock class");
      int offset = 3;
      System.out.println("Offset: " + offset);
      WorldClock wclock = new WorldClock(offset);
      System.out.println("Hours: " + wclock.getHours());
      System.out.println("Minutes: " + wclock.getMinutes());
      System.out.println("Time: " + wclock.getTime());
   }
}
