/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

/**
 * JDK8:Collectors.
 * 
 * @since 1.0.0 2018年12月28日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class CollectorsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	void testCounting() {
		Integer[] intArray = {4, 5, 3, 9};
		
		long counting = Stream.of(intArray).collect(Collectors.counting());
		
		assertEquals(4, counting);	
		
		// 等同于
		long count = Stream.of(intArray).count();
		
		assertEquals(4, count);	
	}
	
	@Test
	void testMaxBy() {
		Integer[] intArray = {4, 5, 3, 9};
		
		Optional<Integer> resultMax = Stream.of(intArray).collect(Collectors.maxBy(CollectorsDemo::compareInteger));
		
		assertEquals(9, resultMax.get().intValue());	
	}
	
	@Test
	void testMin() {
		Integer[] intArray = {4, 5, 3, 9};
		
		Optional<Integer> resultMin = Stream.of(intArray).collect(Collectors.minBy(CollectorsDemo::compareInteger));
		
		assertEquals(3, resultMin.get().intValue());	
	}
	
	@Test
	void testSummingInt() {
		Integer[] intArray = {4, 5, 3, 9};
		
		int resultSummingInt = 
				Stream.of(intArray).collect(Collectors.summingInt(Integer::intValue));
		
		// 4+5+3+9=21
		assertEquals(21, resultSummingInt);	
		
		
		List<Apple> apples = 
				List.of(new Apple("A", 30),new Apple("B", 20),new Apple("C", 60));

		// 30+20+60=110
		assertEquals(110, apples.stream().collect(Collectors.summingInt(Apple::getWeight)).intValue());
	}
	
	@Test
	void testAveragingInt() {
		Integer[] intArray = {4, 5, 3, 9, 9};
		
		Double resultAveragingInt = 
				Stream.of(intArray).collect(Collectors.averagingInt(Integer::intValue));
		
		// (4+5+3+9+9)/5=6
		assertEquals(6D, resultAveragingInt.doubleValue());	

	}
	
	@Test
	void testJoining() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		String resultJoining = Stream.of(testStrings).collect(Collectors.joining());
		
		assertEquals("JavaC++Golang", resultJoining);	
		
		String resultJoining2 = Stream.of(testStrings).collect(Collectors.joining(","));
		
		assertEquals("Java,C++,Golang", resultJoining2);	
	}
	
	@Test
	void testGroupBy() {
		List<Apple> apples = 
				List.of(new Apple("A", 30),new Apple("B", 20),new Apple("C", 30));
		
		// 按照重量进行分组
		Map<Integer, List<Apple>> result =  
				apples.stream().collect(Collectors.groupingBy(Apple::getWeight));
		
		System.out.println(result);
	}
	
	@Test
	void testPartitioningBy() {
		List<Apple> apples = 
				List.of(new Apple("A", 30),new Apple("B", 20),new Apple("C", 60));
		
		// 按照重量进行分组
		Map<Boolean, List<Apple>> result =  
				apples.stream().collect(Collectors.partitioningBy( x -> x.getWeight() > 25));
		
		System.out.println(result);
	}
	
	/**
	 * 比较整数大小
	 * @param a
	 * @param b
	 * @return
	 */
	public static Integer compareInteger(Integer a, Integer b) {
		return a.compareTo(b);
	}
}
