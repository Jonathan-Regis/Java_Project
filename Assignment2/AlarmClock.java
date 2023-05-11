/*
 * Student name: Jonathan Regis 
 * Lab professor: Leanne Seaward 
 * Due date: March 26,2023
 * Date modified: March 26, 2023
 * Description: This program creates an alarm clock that takes for input the hours and minutes of the alarm 
 * checks the alarm 
 * and clears it if it reaches it 
 * 
 */
/**
 *  This program creates an alarm clock that takes for input the hours and minutes of the alarm 
 * checks the alarm 
 * and clears it if it reaches it
 * @author Jonathan
 *
 */
public class AlarmClock extends Clock {
	
	private int hours = 0;
	private int minutes =0;
	
	/**
	 * This method sets the alarm for the user 
	 * @param hours is the hours of the alarm
	 * @param minutes are the minutes of the alarm
	 */
	public void setAlarm(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
		
	}
	// Stores the getHours and getMinutes into variables
	int CurrentHour = Integer.parseInt(super.getHours());
	int CurrentMin = Integer.parseInt(super.getMinutes());
	
	@Override
	/**
	 * this method displays the current and if the alarm time is reached it will print alarm and clear the alarm 
	 * if not it will just print the current time.
	 */
	public String getTime() {
		if (CurrentHour > hours || (CurrentHour == hours && CurrentMin >= minutes)) {
			return "Alarm" + super.getTime();
			}else {
				return super.getTime();
			}
}
}

