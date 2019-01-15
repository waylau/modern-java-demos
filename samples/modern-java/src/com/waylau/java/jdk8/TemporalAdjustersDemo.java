/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

/**
 * JDK8:TemporalAdjusters.
 * 
 * @since 1.0.0 2019年1月15日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class TemporalAdjustersDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	void testTemporalAdjusters() {
		// 实例化2019-1-21日期
		LocalDate date = LocalDate.of(2019, 1, 21); 
		assertEquals("2019-01-21", date.toString());
		
		// 下个周日
		LocalDate date2 = date.with(nextOrSame(DayOfWeek.SUNDAY)); 
		assertEquals("2019-01-27", date2.toString());
		
		// 本月最后一天
		LocalDate date3 = date.with(lastDayOfMonth()); 
		assertEquals("2019-01-31", date3.toString());
	}
}
