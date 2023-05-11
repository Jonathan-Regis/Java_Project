/*
 * Student name: Jonathan Regis 
 * Lab professor: Leanne Seaward 
 * Due date: March 26,2023
 * Date modified: March 26, 2023
 * Description: This program creates a clock class
 * it uses API's to get the time and 
 * with the help of substrings we take the minutes, the hours and we use both of them to generate a time
 * 
 */

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Implement a class Clock whose getHours, getMinutes and
   getTime methods return the current time at your location.
   Return the time as a string.

   Here is how to retrieve the current time as a String:
    With Java 8, you can use 3 classes in the java.time package:
      Instant, LocalDateTime and ZoneId. Here's how you do it:
      String timeString = LocalDateTime.ofInstant(Instant.now(),
                              ZoneId.systemDefault()).toString()

   you'll need to extract the hours and minutes as a substring.
 * @author Jonathan
 *
 */
public class Clock {
	
	/**
	 * method that just gets the hours needed for the time using LocateDateTime API
	 * and substrings to only get the hours 
	 * @return hours only
	 */
	public String getHours() {
		String timeString = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()).toString();
		String hours = timeString.substring(11, 13);
		return hours;
	}
	/**
	 * This method only gets the minutes using the same method described in the getHours.
	 * @return the minutes only 
	 */
	public String getMinutes() {
		String timeString = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()).toString();
		String minutes = timeString.substring(14, 16);
		return minutes;
	}
	/**
	 * this method combines the getHours() and getMinutes() methods 
	 * it adds them up and uses them to print out the current time.
	 * @return the current time
	 */
	public String getTime() {
		String CurrentHour = getHours();
		String CurrentMin = getMinutes();
		String CurrentTime = CurrentHour + ":" + CurrentMin;
		return CurrentTime;
	}
  











}
