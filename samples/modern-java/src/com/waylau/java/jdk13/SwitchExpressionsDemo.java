/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk13;

import static java.util.Calendar.*;


/**
 * JDK13: Switch Expressions (Preview)
 * JEP 354: http://openjdk.java.net/jeps/354
 * 
 * @since 1.0.0 2019年9月19日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class SwitchExpressionsDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("preview")
	public static void main(String[] args) {
		var day = SATURDAY;
		
		// JDK12之前
		switch (day) {
	    case MONDAY:
	    case FRIDAY:
	    case SUNDAY:
	        System.out.println(6);
	        break;
	    case TUESDAY:
	        System.out.println(7);
	        break;
	    case THURSDAY:
	    case SATURDAY:
	        System.out.println(8);
	        break;
	    case WEDNESDAY:
	        System.out.println(9);
	        break;
		}

	    // JDK12之后
		switch (day) {
		    case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
		    case TUESDAY                -> System.out.println(7);
		    case THURSDAY, SATURDAY     -> System.out.println(8);
		    case WEDNESDAY              -> System.out.println(9);
		}
		
		// JDK13之后
		int date = switch (day) {
		    case MONDAY, FRIDAY, SUNDAY : yield 6;
		    case TUESDAY                : yield 7;
		    case THURSDAY, SATURDAY     : yield 8;
		    case WEDNESDAY              : yield 9;
		    default 					: yield 1; // default条件是必须的
		};

		System.out.println(date);
	}
}
