/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.operator;

/**
 * PrePost Demo.
 * @since 1.0.0 2020年4月25日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class PrePostDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 3;

		i++;
		System.out.println(i); // 4

		++i;
		System.out.println(i); // 5

		System.out.println(++i); // 6

		System.out.println(i++); // 6

		System.out.println(i); // 7
	}

}
