/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.controlflow;

/**
 * Do While Demo.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class DoWhileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 1;

		do {
			System.out.println("Count is: " + count);
			count++;
		} while (count < 11);

	}

}
