/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

/**
 * JDK8:LocalDate.
 * 
 * @since 1.0.0 2019年1月9日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class LocalDateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println(today.toString());
	}

	@Test
	void testLocalDate() {
		// 实例化2019-1-21日期
		LocalDate date = LocalDate.of(2019, 1, 21); 
		
		// 获取年份
		int year = date.getYear(); 
		assertEquals(2019, year);
		
		// 获取月份
		Month month = date.getMonth(); 
		
		assertEquals(1, month.getValue());
		
		// 获取日
		int day = date.getDayOfMonth(); 
		assertEquals(21, day);
		
		// 获取星期几
		DayOfWeek dow = date.getDayOfWeek(); 
		
		assertEquals(1, dow.getValue());
		assertEquals("MONDAY", dow.toString());
		
		// 获取月份的日数
		int len = date.lengthOfMonth(); 
		assertEquals(31, len);

		// 是否闰年
		boolean leap = date.isLeapYear(); 
		assertEquals(false, leap);
	}
}
