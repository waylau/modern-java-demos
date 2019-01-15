/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

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
	
	// 修改
	@Test
	void testModifiedLocalDate() {
		// 实例化2019-1-21日期
		LocalDate date = LocalDate.of(2019, 1, 21); 
		assertEquals("2019-01-21", date.toString());
		
		// 修改年
		LocalDate date2 = date.withYear(2011); 
		assertEquals("2011-01-21", date2.toString());
		
		// 修改日
		LocalDate date3 = date.withDayOfMonth(25); 
		assertEquals("2019-01-25", date3.toString());
		
		// 修改月
		LocalDate date4 = date.with(ChronoField.MONTH_OF_YEAR, 2);
		assertEquals("2019-02-21", date4.toString());
		
		// 修改为相对的日期
		// 加一周
		LocalDate date5 = date.plusWeeks(1); 
		assertEquals("2019-01-28", date5.toString());
		
		// 减少6年
		LocalDate date6 = date.minusYears(6); 
		assertEquals("2013-01-21", date6.toString());
		
		// 加6个月
		LocalDate date7 = date.plus(6, ChronoUnit.MONTHS); 
		assertEquals("2019-07-21", date7.toString());
	}
}
