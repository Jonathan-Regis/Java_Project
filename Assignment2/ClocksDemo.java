import java.io.PrintStream;

/*
 * Student name: Jonathan Regis 
 * Lab professor: Leanne Seaward 
 * Due date: March 26,2023
 * Date modified: March 26, 2023
 * Description: This program test all 3 clock classes and prints them
 * 
 */

/**
 * This program tests all 3 clock classes and prints them 
 * @author Jonathan 
 *
 */
public class ClocksDemo {
/**
 * Start of the program
 * @param args start of the program
 */
	  public static void main(String[] args) {

	Clock [] clocks = new Clock[3]; {
			
	clocks[0] = new Clock();
	clocks[1] = new WorldClock(4);

	AlarmClock alarmClock = new AlarmClock();
	alarmClock.setAlarm(16, 0);
	clocks[2] = alarmClock;

	
	for (int i = 0; i < clocks.length; i++) {
		System.out.println(  clocks[i].getTime());
	}
	
}	
	
}
}
