/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.operator;

/**
 * Conditional Demo1.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class ConditionalDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;

		if ((value1 == 1) && (value2 == 2)) {
			System.out.println("value1 is 1 AND value2 is 2");
		}

		if ((value1 == 1) || (value2 == 1)) {
			System.out.println("value1 is 1 OR value2 is 1");
		}

	}

}
