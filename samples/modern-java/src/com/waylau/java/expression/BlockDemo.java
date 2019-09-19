/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.expression;

/**
 * Block Demo.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class BlockDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean condition = true;

		if (condition) { // 块1开始
			System.out.println("Condition is true.");
		} // 块1结束
		else { // 块2开始
			System.out.println("Condition is false.");
		} // 块2结束

	}

}
