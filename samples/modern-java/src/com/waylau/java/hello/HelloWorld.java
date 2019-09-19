/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Hello World
 * 
 * @since 1.0.0 2019年3月30日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	/**
	 * 第一个JUnit5测试用例
	 */
	@Test
	void testUnit() {
		String name = "Way Lau";
		assertEquals("Way Lau", name);
	}

}
