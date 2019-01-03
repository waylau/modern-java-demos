/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.jupiter.api.Test;

/**
 * JDK8:ConcurrentHashMap.
 * 
 * @since 1.0.0 2019年1月4日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class ConcurrentHashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	@Test
	public void testForEach() {
		ConcurrentHashMap<String, Integer> friends = new ConcurrentHashMap<>();
		friends.put("Alice", 30);
		friends.put("Bob", 28);
		friends.put("Cavin", 33);
		
		friends.forEach((k, v) -> System.out.println(k + ":" + v));
	}
	
	@Test
	public void testReduce() {
		ConcurrentHashMap<String, Integer> friends = new ConcurrentHashMap<>();
		friends.put("Alice", 30);
		friends.put("Bob", 28);
		friends.put("Cavin", 33);
		
		System.out.println(friends.reduce(123L, (k, v)->v, (k,v)->v));
	}


}
