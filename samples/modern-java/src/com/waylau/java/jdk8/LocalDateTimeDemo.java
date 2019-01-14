/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import org.junit.jupiter.api.Test;

/**
 * JDK8:LocalDateTime.
 * 
 * @since 1.0.0 2019年1月14日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class LocalDateTimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println(dt1);
	}

	@Test
	void testLocalDateTime() {
		// 实例化时间日期
		LocalDateTime dt1 = LocalDateTime.of(2019, 1, 21, 13, 45, 20);
		assertEquals(13, dt1.getHour());
		
		
		// 实例化时间
		LocalDate date = LocalDate.of(2019, 1, 21); 
				
		// 实例化时间
		LocalTime time = LocalTime.of(13, 45, 20); 
		
		LocalDateTime dt2 = LocalDateTime.of(date, time);
		
		assertEquals(dt1, dt2);
		
		
		// 获取年份
		int year = dt2.getYear(); 
		assertEquals(2019, year);
		
		// 获取月份
		Month month = dt2.getMonth(); 
		
		assertEquals(1, month.getValue());
		
		// 获取日
		int day = dt2.getDayOfMonth(); 
		assertEquals(21, day);
		
		// 获取星期几
		DayOfWeek dow = dt2.getDayOfWeek(); 
		
		assertEquals(1, dow.getValue());
		assertEquals("MONDAY", dow.toString());
				
		// 获取小时
		int hour = dt2.getHour(); 
		assertEquals(13, hour);
		
		// 获取分钟
		int minute = dt2.getMinute(); 
		assertEquals(45, minute);
		
		// 获取秒
		int second = dt2.getSecond();
		assertEquals(20, second);
	}
}
