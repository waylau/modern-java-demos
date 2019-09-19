/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.operator;

/**
 * Bit Move Demo.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class BitMoveDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = -101;

		for (int i = 1; i < 33; i++) {
			System.out.println(a + "<<" + i + "=" + (a << i));
		}

	}

}
