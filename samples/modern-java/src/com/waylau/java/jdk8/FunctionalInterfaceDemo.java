/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * JDK8:FunctionalInterface
 * 
 * @since 1.0.0 2018年12月26日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class FunctionalInterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("A");
		listOfStrings.add(""); // 空字符串
		listOfStrings.add("CCC");
		listOfStrings.add("DDDD");

		// Predicate
		Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
		List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);

		nonEmpty.stream().forEach(System.out::println);
		
		// Consumer
		forEach(listOfStrings, System.out::println);
		
		// Function
		List<Integer> result = map(listOfStrings, String::length);
		result.stream().forEach(System.out::println);
	}

	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> results = new ArrayList<>();
		for (T t : list) {
			if (p.test(t)) { // 判读
				results.add(t);
			}
		}
		return results;
	}

	public static <T> void forEach(List<T> list, Consumer<T> c) {
		for (T t : list) {
			c.accept(t); // 接受
		}
	}
	
	public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
		List<R> result = new ArrayList<>();
		for (T t : list) {
			result.add(f.apply(t));
		}
		return result;
	}
}
