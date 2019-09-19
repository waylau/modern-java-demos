/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.enumdemo;

/**
 * Enum Demo.
 * 
 * @since 1.0.0 2019年4月4日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class EnumDemo {
	Day day;

	/**
	 * 
	 */
	public EnumDemo(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EnumDemo firstDay = new EnumDemo(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumDemo thirdDay = new EnumDemo(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumDemo fifthDay = new EnumDemo(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumDemo sixthDay = new EnumDemo(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumDemo seventhDay = new EnumDemo(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}

	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
}
