/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

/**
 * JDK11:String API.
 * 
 * @since 1.0.0 2018年12月23日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class StringDemo {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

	}
	
	@Test
	void testRepeat() {
		// 重复两次
		var name ="Way Lau";
		var result = name.repeat(2);

		assertEquals("Way LauWay Lau", result);
		
		// 重复0次返回空字符串
	    var string = "foo";
	    var result1 = string.repeat(0);

	    assertEquals("", result1);
	    
	    // 重复空字符串
	    var string2 = "";
	    var result2 = string2.repeat(Integer.MAX_VALUE);

	    assertEquals("", result2);
 
	}

	@Test
	void testIsBlank() {
		// 空字符串
		var blankName ="";
		var result = blankName.isBlank(); // true

		assertEquals(true, result);
		
		// 非空字符串
	    var string = "waylau";
	    var result1 = string.isBlank(); // false

	    assertEquals(false, result1);
	    
	    // 空格
	    var string2 = "  ";
	    var result2 = string2.isBlank(); // true

	    assertEquals(true, result2);
 
	}
	
	
	@Test
	void testStrip() {
		// 前空格字符串
		var leadingWiteSpace = " abc";
		var result = leadingWiteSpace.strip(); 

		assertEquals("abc", result);
		
		// 后空格字符串
	    var trailingWhiteSpace = "abc ";
	    var result1 = trailingWhiteSpace.strip(); 

	    assertEquals("abc", result1);
 
	}
	
	@Test
	void testLines() {
		// 多行字符串
		var linesString = "abc\negf\nway\nlau";

		Stream<String> stream = linesString.lines();
		stream.forEach(System.out::println);  
		//打印出所有在元素
		//abc
		//egf
		//way
		//lau
	}
}
