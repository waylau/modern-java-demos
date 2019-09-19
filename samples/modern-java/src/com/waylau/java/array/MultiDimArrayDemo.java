/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.array;

/**
 * Multidimensional Array Demo.
 * 
 * @since 1.0.0 2019年4月2日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class MultiDimArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Way", "Lau" } };

		// Mr. Way
		System.out.println(names[0][0] + names[1][0]);

		// Ms. Lau
		System.out.println(names[0][2] + names[1][1]);
	}

}
