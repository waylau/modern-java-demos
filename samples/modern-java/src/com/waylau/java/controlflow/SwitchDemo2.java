/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.controlflow;

/**
 * Switch Demo2.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class SwitchDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int month = 2;
		int year = 2000;
		int numDays = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 2:
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
				numDays = 29;
			else
				numDays = 28;
			break;
		default:
			System.out.println("Invalid month.");
			break;
		}

		System.out.println("Number of Days = " + numDays);

	}

}
