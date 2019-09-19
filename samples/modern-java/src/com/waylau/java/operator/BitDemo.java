/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.operator;

/**
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class BitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int bitmask = 0x000F;
		int val = 0x2222;

		System.out.println(val & bitmask); // 2
	}

}
