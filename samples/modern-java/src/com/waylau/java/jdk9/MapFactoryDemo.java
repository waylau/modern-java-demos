/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

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
	
	@Test
	public void testGetOrDefault() {
		Map<String, Integer> friends = 
				Map.of("Alice", 30, "Bob", 28, "Cavin", 33);
		
		// key存在，不会使用默认值
		assertEquals(30, friends.getOrDefault("Alice", 18).intValue());
		
		// key不存在，会使用默认值
		assertEquals(18, friends.getOrDefault("Way", 18).intValue());
	}
	
	@Test
	public void testCompanyIfAbsent() {
		Map<String, Integer> friends = new HashMap<>();
		friends.put("Alice", 30);
		friends.put("Bob", 28);
		friends.put("Cavin", 33);
		
		// key存在，不会覆盖原有值
		friends.computeIfAbsent("Alice", k -> Integer.valueOf(18));
		assertEquals(30, friends.get("Alice").intValue());
		
		// key不存在，则会添加计算值
		friends.computeIfAbsent("David", k -> Integer.valueOf(18));
		assertEquals(18, friends.get("David").intValue());
		
		// key存在，则会重新计算值
		friends.computeIfPresent("Alice", (k, v) -> 18);
		assertEquals(18, friends.get("Alice").intValue());
		
		// key不存在，不会计算值
		friends.computeIfPresent("Eric", (k, v) -> 18);
		assertEquals(0, friends.getOrDefault("Eric", 0).intValue());
				
		// key存在，则会重新计算值
		friends.compute("Bob", (k, v) -> 18);
		assertEquals(18, friends.get("Bob").intValue());
		
		// key不存在，也会计算值
		friends.compute("Franc", (k, v) -> 18);
		assertEquals(18, friends.get("Franc").intValue());
	}
	
	@Test
	public void testRemove() {
		Map<String, Integer> friends = new HashMap<>();
		friends.put("Alice", 30);
		friends.put("Bob", 28);
		friends.put("Cavin", 33);
		
		
		/*
		// Java 8之前
		if (friends.containsKey("Cavin") &&
				Objects.equals(friends.get("Cavin"), 33)) {
			friends.remove("Cavin");
		}
		*/
		
		// Java 8之后
		friends.remove("Cavin", 33);
		
		friends.forEach((friend, age) 
				-> System.out.println(friend + " is " + age + " years old"));
	}
	
	
	@Test
	public void testReplace() {
		Map<String, Integer> friends = new HashMap<>();
		friends.put("Alice", 30);
		friends.put("Bob", 28);
		friends.put("Cavin", 33);

		// key存在，则会替换新值
		friends.replace("Cavin", 18);
		
		// key不存在，则不做任何动作
		friends.replace("David", 18);
				
		System.out.println(friends);
	}
	
	@Test
	public void testReplaceAll() {
		Map<String, Integer> friends = new HashMap<>();
		friends.put("Alice", 30);
		friends.put("Bob", 28);
		friends.put("Cavin", 33);

		// key存在，则会替换新值
		friends.replaceAll((k,v) -> v + 10);
				
		System.out.println(friends);
	}
	
	@Test
	public void testMerge() {
		Map<String, Integer> friends = new HashMap<>();
		friends.put("Alice", 30);
		friends.put("Bob", 28);
		friends.put("Cavin", 33);
	 
		// key存在，则会替换新值
		friends.merge("Alice", 18, (k, v) -> 18);
		
		// key不存在，则会添加新值
		friends.merge("Eric", 18, (k, v) -> 18);
				
		System.out.println(friends);
	}
}
