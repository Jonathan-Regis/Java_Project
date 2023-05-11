/*
 * Student name: Jonathan Regis 
 * Lab professor: Leanne Seaward 
 * Due date: March 26,2023
 * Date modified: March 26, 2023
 * Description: This program creates a worldClock 
 * it takes an offset parameter that adds an offset to the hours of the time 
 * 
 */
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * This class takes a integer parameter and adds that integer to the getHours() method
 * that gives the hours of the location that has the offset 
 * @author Jonathan
 *
 */
public class WorldClock extends Clock {
	
	private int offset;
/**
 * parameterized constructor of worldClock
 * @param offset int value that is the location offet time relative to UTC time
 */
	public WorldClock(int offset) {
		this.offset = offset;
		
	}	
		
	/**
	 * This method is similar to the getHours method from the Clock class
	 * it sets the time to UTC time and then adds the offset value to the UTC time.
	 */
		public String getHours() {
			String timeString = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()).toString();
			String hours = timeString.substring(11, 13);
			int UTCHour = Integer.parseInt(hours) + 4;
			String UTCHours = String.valueOf(UTCHour);
			int UTCOffset = Integer.parseInt(UTCHours) + offset;
			String UTCHourOffset = String.valueOf(UTCOffset);
			return UTCHourOffset;
			
		}
		
		/**
		 * This method uses the same getMinutes method as the Clock class
		 */
		public String getMinutes() {
			return super.getMinutes();
		}
		
		/**
		 * this method overrides the getTime method from the Clock class
		 * it also makes sure that the hours dont go over 24 by substracting 24 from the value if its over 23. 
		 */
		@Override
		public String getTime() {
			String OffsetMin = super.getMinutes();
			int GetHoursInt = Integer.parseInt(getHours());
			if (GetHoursInt > 23) {
				GetHoursInt -= 24;
			}else if (GetHoursInt < 0) {
				GetHoursInt +=24;
			}
			String GetHoursStr = String.valueOf(GetHoursInt);
			String OffsetTime = GetHoursStr + ":" + OffsetMin;
			return OffsetTime;
			}
	}

