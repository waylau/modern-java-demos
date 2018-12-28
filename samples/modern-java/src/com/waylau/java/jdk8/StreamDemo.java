/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
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
		
		// 构造Stream的方式
		// 空流处理
		// Java 9之前
		String homeValue = System.getProperty("home");
		Stream<String> homeValueStream = 
				homeValue == null ? Stream.empty() : Stream.of(homeValue);
		
		// Java 9之后，使用ofNullable
		Stream<String> homeValueStream1 = 
				Stream.ofNullable(System.getProperty("home"));
		
		// 从数组中构造
		Integer[] intArray = {4, 5, 3, 9};
		Stream<Integer> stream = Arrays.stream(intArray);
		
		// 从集合中构造
		Stream<Integer> streamList = List.of(1,2,3).stream();
		Stream<Integer> streamSet = Set.of(1,2,3).stream();
		
		// 从文件中构造
		long uniqueWords = 0;
		try (Stream<String> lines = Files.lines( Paths.get("data.txt"), Charset.defaultCharset())) {
			uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" "))).distinct().count();
		} catch (IOException e) {
		}
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

	@Test
	public void testReduceSum() {
		Integer[] intArray = {4, 5, 3, 9};
		
		// 4+5+3+9=21
		assertEquals(21, Stream.of(intArray).reduce(0, (a, b) -> a + b).intValue());	
	}
	
	
	@Test
	public void testReduceMaxAndMin() {
		Integer[] intArray = {4, 5, 3, 9};
		
		// 计算最大值
		assertEquals(9, Stream.of(intArray).reduce(Integer::max).get().intValue());	

		// 计算最小值
		assertEquals(3, Stream.of(intArray).reduce(Integer::min).get().intValue());	
	}


	@Test
	public void testDistinct() {
		Integer[] intArray = {1, 2, 3, 4, 3, 5};

		Stream<Integer> result = Stream.of(intArray).distinct();
		
		result.forEach(System.out::println);
	}
	
	@Test
	public void testTakeWhile() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		//判断J开头
		List<String> list = Stream.of(testStrings).takeWhile(x -> x.startsWith("J")).collect(Collectors.toList());
 
		list.forEach(System.out::println);
	}
	
	
	@Test
	public void testDropWhile() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		//判断J开头
		List<String> list = Stream.of(testStrings).dropWhile(x -> x.startsWith("J")).collect(Collectors.toList());
 
		list.forEach(System.out::println);
	}
	
	@Test
	public void testLimit() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		//长度大于2
		List<String> list = Stream.of(testStrings).filter(x -> x.length()>2)
				.limit(2).collect(Collectors.toList());
 
		list.forEach(System.out::println);
	}
	
	
	@Test
	public void testSkip() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		//长度大于2
		List<String> list = Stream.of(testStrings).filter(x -> x.length()>2)
				.skip(2).collect(Collectors.toList());
 
		list.forEach(System.out::println);
	}
	
	@Test
	public void testFlatMap() {
		String[] words = {"Hello", "World"};

		List<String> list = Stream.of(words)
				.map(word -> word.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(Collectors.toList());
 
		list.forEach(System.out::println);
	}

	@Test
	public void testAllMatch() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		//长度大于2,，全部匹配
		assertEquals(true, Stream.of(testStrings).allMatch(x -> x.length()>2));
		assertEquals(false, Stream.of(testStrings).allMatch(x -> x.length()>3));
	}
	
	@Test
	public void testAnyMatch() {
		String[] testStrings = {"Java", "C++", "Golang"};

		// 部分匹配
		assertEquals(true, Stream.of(testStrings).anyMatch(x -> x.length()>3));

		// 没有匹配
		assertEquals(false, Stream.of(testStrings).anyMatch(x -> x.length()>6));
	}
	
	@Test
	public void testFindFirst() {
		String[] testStrings = {"Java", "C++", "Golang"};

		// 部分匹配
		assertEquals("Java", Stream.of(testStrings).filter(x -> x.length()>3).findFirst().get());
	}
	
	@Test
	public void testFindAny() {
		String[] testStrings = {"Java", "C++", "Golang"};

		// 部分匹配
		assertEquals("Java", Stream.of(testStrings).filter(x -> x.length()>3).findAny().get());
	}
}
