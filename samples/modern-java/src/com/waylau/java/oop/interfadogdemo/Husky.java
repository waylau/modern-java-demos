/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.oop.interfadogdemo;

/**
 * 
 * @since 1.0.0 2019年4月1日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class Husky implements Dog {

	String color;
	String name;

	@Override
	public void bark() {
		System.out.println(color + " " + name + " barking...");

	}

	@Override
	public void wag() {
		System.out.println(color + " " + name + " wagging...");
	}

}
