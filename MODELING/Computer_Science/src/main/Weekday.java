package main;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Given a date, return the day of the week
 * @author sebastian
 *
 */

public class Weekday {
	public static void main(String[] args) {
		String[] days = new String[]{"", "Sunday", "Monday", "Thuesday", "Wensday", "Thursday", "Friday", "Saturday"};
		Calendar cal = new GregorianCalendar(2010, 7, 9);
		System.out.println(days[cal.get(Calendar.DAY_OF_WEEK)]);
	}
}
