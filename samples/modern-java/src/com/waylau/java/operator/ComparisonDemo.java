/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.operator;

/**
 * Comparison Demo.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class ComparisonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;

		if (value1 == value2) {
			System.out.println("value1 == value2");
		}

		if (value1 != value2) {
			System.out.println("value1 != value2");
		}

		if (value1 > value2) {
			System.out.println("value1 > value2");
		}

		if (value1 < value2) {
			System.out.println("value1 < value2");
		}

		if (value1 <= value2) {
			System.out.println("value1 <= value2");
		}

	}

}
