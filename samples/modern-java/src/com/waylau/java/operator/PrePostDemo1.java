/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.operator;

/**
 * @since 1.0.0 2020年4月25日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class PrePostDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a  = 1;
		int b  = 1;
		
		int a1 = increaseAfter(a);
		int b1 = increaseBefore(b);
		
		System.out.println("a1:" + a1);
		System.out.println("b1:" + b1 );
	}

	public static int increaseAfter(int i) {
		return i++;
	}
	
	public static int increaseBefore(int i) {
		return ++i;
	}

}
