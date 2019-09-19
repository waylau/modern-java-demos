/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.controlflow;

import java.util.ArrayList;

/**
 * Switch Demo Fall Through.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class SwitchDemoFallThrough {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> futureMonths = new ArrayList<String>();

		int month = 8;

		switch (month) {
		case 1:
			futureMonths.add("January");
		case 2:
			futureMonths.add("February");
		case 3:
			futureMonths.add("March");
		case 4:
			futureMonths.add("April");
		case 5:
			futureMonths.add("May");
		case 6:
			futureMonths.add("June");
		case 7:
			futureMonths.add("July");
		case 8:
			futureMonths.add("August");
		case 9:
			futureMonths.add("September");
		case 10:
			futureMonths.add("October");
		case 11:
			futureMonths.add("November");
		case 12:
			futureMonths.add("December");
			break;
		default:
			break;
		}

		if (futureMonths.isEmpty()) {
			System.out.println("Invalid month number");
		} else {
			for (String monthName : futureMonths) {
				System.out.println(monthName);
			}
		}

	}

}
