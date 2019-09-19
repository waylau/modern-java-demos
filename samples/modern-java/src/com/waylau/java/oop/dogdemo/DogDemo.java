/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.oop.dogdemo;

/**
 * Dog Demo.
 * 
 * @since 1.0.0 2019年4月1日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class DogDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创造两条狗狗
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();

		// 给他们状态
		dog1.name = "Lucy";
		dog1.color = "Black";
		dog2.name = "Lily";
		dog2.color = "White";

		// 展示他们的行为
		dog1.bark();
		dog1.wag();
		dog2.bark();
		dog2.wag();

	}

}
