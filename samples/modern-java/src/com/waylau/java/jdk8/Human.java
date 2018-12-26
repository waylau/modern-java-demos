/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

/**
 * Human.
 * 
 * @since 1.0.0 2018年12月23日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public interface Human {

	default String say() {
		return "Mama";
	}

	static String suck() {
		return "suck sweet";
	}
}

interface Boy extends Human {
	default String say() {
		return "I love Mama";
	}

	static String suck() {
		return "suck mama-sweet";
	}
}

class Frank implements Human {
}

class Tom implements Boy {
}

class James implements Boy, Human {
}

class Kavin implements Boy {
	public String say() {
		return "I love Papa";
	}

	static String suck() {
		return "suck papa-sweet";
	}
}
