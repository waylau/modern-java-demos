/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

/**
 * JDK9:Map factory.
 * 
 * @since 1.0.0 2019年1月2日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class MapFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Java 9之后
		Map<String, Integer> friends = 
				Map.of("Alice", 30, "Bob", 28, "Cavin", 33);
		
		Map<String, Integer> friends2 = 
				Map.ofEntries(
						Map.entry("Alice", 30), 
						Map.entry("Bob", 28),
						Map.entry("Cavin", 33));
	}

	@Test
	public void testForEach() {
		Map<String, Integer> friends = 
				Map.of("Alice", 30, "Bob", 28, "Cavin", 33);
		
		// Java 8之前
		for(Map.Entry<String, Integer> entry: friends.entrySet()) {
			String friend = entry.getKey();
			Integer age = entry.getValue();
			System.out.println(friend + " is " + age + " years old");
		}
		
		// Java 8之后
		friends.forEach((friend, age) 
				-> System.out.println(friend + " is " + age + " years old"));
	}
	
	@Test
	public void testSorted() {
		Map<String, Integer> friends = 
				Map.of("Alice", 30, "Bob", 28, "Cavin", 33);
		
		// 按值排序
		friends.entrySet().stream()
			.sorted(Entry.comparingByValue())
			.forEachOrdered(System.out::println);
		
		// 按键排序
		friends.entrySet().stream()
			.sorted(Entry.comparingByKey())
			.forEachOrdered(System.out::println);
	}
}
