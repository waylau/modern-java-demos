/**
 * 
 */
package com.waylau.java.io.formatting;

/**
 * Root Demo.
 * 
 * @since 1.0.0 2019年4月11日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class Root {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 2;
		double r = Math.sqrt(i);

		System.out.print("值 ");
		System.out.print(i);
		System.out.print(" 的平方根是 ");
		System.out.print(r);
		System.out.println(".");

		i = 5;
		r = Math.sqrt(i);
		System.out.println("值 " + i + " 的平方根是 " + r + ".");
	}
}
