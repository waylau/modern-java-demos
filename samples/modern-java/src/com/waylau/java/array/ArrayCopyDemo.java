/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.array;

/**
 * Array Copy Demo.
 * 
 * @since 1.0.0 2019年4月2日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class ArrayCopyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] copyFrom = { 'd', 'e', 'w', 'a', 'y', 'f', 'e', 'd' };
		char[] copyTo = new char[7];

		System.arraycopy(copyFrom, 2, copyTo, 0, 3);
		System.out.println(new String(copyTo));
	}

}
