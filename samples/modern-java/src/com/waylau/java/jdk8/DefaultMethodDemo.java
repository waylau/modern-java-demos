/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

/**
 * JDK8:Default Method.
 * 
 * @since 1.0.0 2018年12月23日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class DefaultMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 默认方法
		Human frank = new Frank();
		System.out.println(frank.say()); // Mama

		Human tom = new Tom();
		System.out.println(tom.say()); // I love Mama

		Human james = new James();
		System.out.println(james.say()); // I love Mama

		Human kavin = new Kavin();
		System.out.println(kavin.say()); // I love Papa

		// 静态方法
		System.out.println(Human.suck()); // suck sweet
		System.out.println(Boy.suck()); // suck mama-sweet
		System.out.println(Kavin.suck()); // suck papa-sweet
	}

}
