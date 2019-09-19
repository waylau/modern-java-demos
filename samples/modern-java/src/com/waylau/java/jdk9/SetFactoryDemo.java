/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk9;

import java.util.HashSet;
import java.util.Set;

/**
 * JDK9:Set factory.
 * 
 * @since 1.0.0 2019年1月2日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
class SetFactoryDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Java 9之前
		Set<String> friends = new HashSet<>();
		friends.add("Alice");
		friends.add("Bob");
		friends.add("Cavin");

		// Java 9之后
		Set<String> friends2
			= Set.of("Alice", "Bob", "Cavin");
	}
 
}
