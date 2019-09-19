/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.operator;

/**
 * Arithmetic Demo.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class ArithmeticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = 1 + 2; // 3
		System.out.println("1 + 2 = " + result);
		int original_result = result;

		result = result - 1; // 2
		System.out.println(original_result + " - 1 = " + result);
		original_result = result;

		result = result * 2; // 4
		System.out.println(original_result + " * 2 = " + result);
		original_result = result;

		result = result / 2; // 2
		System.out.println(original_result + " / 2 = " + result);
		original_result = result;

		result = result + 8; // 10
		System.out.println(original_result + " + 8 = " + result);
		original_result = result;

		result = result % 7; // 3
		System.out.println(original_result + " % 7 = " + result);
	}

}
