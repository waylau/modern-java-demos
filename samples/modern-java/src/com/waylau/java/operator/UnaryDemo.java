/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.operator;

/**
 * Unary Demo.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class UnaryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = +1; // 1
		System.out.println(result);

		result--; // 0
		System.out.println(result);

		result++; // 1
		System.out.println(result);

		result = -result; // -1
		System.out.println(result);

		boolean success = false;
		System.out.println(success); // false
		System.out.println(!success); // true
	}

}
