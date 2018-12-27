/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

/**
 * 
 * @since 1.0.0 2018年12月27日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class StreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// JDK8之前
		// 初始化集合
		List<Apple> apples = new ArrayList<>();
		List<Apple> resultApples = new ArrayList<>();
		
		apples.add(new Apple("A", 30));
		apples.add(new Apple("B", 20));
		apples.add(new Apple("C", 60));
		
		// 过滤剩下大于25的苹果
		for(Apple apple : apples) {
			if (apple.getWeight() > 25) { 
				resultApples.add(apple);
			}
		}
		
		// 输出过滤后的集合信息
		for(Apple apple : resultApples) {
			System.out.println(apple);
		}
		
		
		// JDK8之后
		// 初始化集合
		List<Apple> apples1 = List.of(new Apple("A", 30),new Apple("B", 20),new Apple("C", 60));

		// 过滤剩下大于25的苹果
		Stream<Apple> applesStream = apples1.stream().filter((x) -> x.getWeight() > 25);
		
		// 输出过滤后的集合信息
		applesStream.forEach(System.out::println);
	}

	@Test
	public void testCollect() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		List<String> list = Stream.of(testStrings).collect(Collectors.toList());
 
		list.forEach(System.out::println);
	}
	
	@Test
	public void testMap() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		// 转为大写
		List<String> list = Stream.of(testStrings).map(String::toUpperCase).collect(Collectors.toList());
 
		list.forEach(System.out::println);
	}
	
	@Test
	public void testFilter() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		//判断J开头
		List<String> list = Stream.of(testStrings).filter(x -> x.startsWith("J")).collect(Collectors.toList());
 
		list.forEach(System.out::println);
	}
	
	@Test
	public void testCount() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		//判断J开头
		long count = Stream.of(testStrings).filter(x -> x.startsWith("J")).count();
		
		assertEquals(1, count);	
	}
	
	@Test
	public void testMin() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		// 取最小值
		Optional<String> min= Stream.of(testStrings).min((p1, p2) -> Integer.compare(p1.length(), p2.length()));
		
		assertEquals("C++", min.get());	
	}
	
	@Test
	public void testMax() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		// 取最大值
		Optional<String> max= Stream.of(testStrings).max((p1, p2) -> Integer.compare(p1.length(), p2.length()));
		
		assertEquals("Golang", max.get());	
	}
	
	@Test
	public void testReduce() {
		Integer[] intArray = {1, 2, 3, 4};

		assertEquals(10, Stream.of(intArray).reduce(Integer::sum).orElse(0).intValue());	
		
		assertEquals(4, Stream.of(intArray).reduce(Integer::max).orElse(0).intValue());
		
		assertEquals(1, Stream.of(intArray).reduce(Integer::min).orElse(0).intValue());
	}
}
