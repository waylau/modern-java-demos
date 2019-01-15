/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseDate;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * JDK8: Calendar.
 * 
 * @since 1.0.0 2019年1月16日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class CalendarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	void testCalendar() {
		// 实例化2019-1-21日期
		LocalDate date = LocalDate.of(2019, 1, 21);
		assertEquals("2019-01-21", date.toString());

		JapaneseDate japaneseDate = JapaneseDate.from(date);
		assertEquals("Japanese Heisei 31-01-21", japaneseDate.toString());
		
		// 实例化2019-1-21日期
		Chronology japaneseChronology = Chronology.ofLocale(Locale.JAPAN);
		ChronoLocalDate chronoLocalDate = japaneseChronology.date(2019, 1, 21);
		assertEquals("2019-01-21", chronoLocalDate.toString());
	}
}
