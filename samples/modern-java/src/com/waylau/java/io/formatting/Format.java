/**
 * 
 */
package com.waylau.java.io.formatting;

/**
 * Format Demo.
 * 
 * @since 1.0.0 2019年4月11日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class Format {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.format("%f, %1$+020.10f %n", Math.PI);
	}
}
