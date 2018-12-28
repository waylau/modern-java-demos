/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

/**
 * Jdk8:Parallel Stream.
 * 
 * @since 1.0.0 2018年12月28日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class ParallelStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	public void testParallelStream() {
		String[] testStrings = {"Java", "C++", "Golang"};
		
		List<String> list = Stream.of(testStrings).collect(Collectors.toList());
		// 串行流
		list.stream().forEach(System.out::println);
		// 并行流
		list.parallelStream().forEach(System.out::println);
		
		// 按照顺序执行
		list.parallelStream().forEachOrdered(System.out::println);
	}
}
