/**
 * 
 */
package com.waylau.java.io.formatting;

/**
 * Root2 Demo.
 * 
 * @since 1.0.0 2019年4月11日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class Root2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 2;
		double r = Math.sqrt(i);

		System.out.format("值 %d 的平方根是 %f.%n", i, r);
	}
}
