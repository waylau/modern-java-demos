/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.oop.dogdemo;

/**
 * Dog.
 * 
 * @since 1.0.0 2019年4月1日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class Dog {

	String color;
	String name;

	/**
	 * 叫唤
	 */
	void bark() {
		System.out.println(color + " " + name + " barking...");
	}

	/**
	 * 摇尾
	 */
	void wag() {
		System.out.println(color + " " + name + " wagging...");
	}

}
