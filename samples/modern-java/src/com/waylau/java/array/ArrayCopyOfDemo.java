/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.array;

/**
 * ArrayCopyOf Demo.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class ArrayCopyOfDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] copyFrom = { 'd', 'e', 'w', 'a', 'y', 'f', 'e', 'd' };

		char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 5);

		System.out.println(new String(copyTo));
	}

}
