/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

/**
 * JDK8:DateTimeFormatters.
 * 
 * @since 1.0.0 2019年1月15日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class DateTimeFormatterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	void testDateTimeFormatter() {
		// 实例化2019-1-21日期
		LocalDate date = LocalDate.of(2019, 1, 21);
		assertEquals("2019-01-21", date.toString());

		// 日期转字符串
		String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		assertEquals("20190121", s1);

		String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		assertEquals("2019-01-21", s2);

		// 字符串转日期
		LocalDate date1 = LocalDate.parse("20190121", 
				DateTimeFormatter.BASIC_ISO_DATE);
		assertEquals("2019-01-21", date1.toString());

		LocalDate date2 = LocalDate.parse("2019-01-21", 
				DateTimeFormatter.ISO_LOCAL_DATE);
		assertEquals("2019-01-21", date2.toString());
		
		// 格式化日期
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String formattedDate = date.format(formatter); 
		assertEquals("21/01/2019", formattedDate);
		
		LocalDate date3 = LocalDate.parse(formattedDate, formatter);
		assertEquals("2019-01-21", date3.toString());
	}
}
