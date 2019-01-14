/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.Test;

/**
 * JDK8:Period.
 * 
 * @since 1.0.0 2019年1月15日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class PeriodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {



	}
	@Test
	void testDuration() {
		
		LocalDate day1 = LocalDate.of(2015, 10, 2);
		LocalDate day2 = LocalDate.of(2019, 1, 3);

		Period period = Period.between(day1, day2);

		assertEquals(1, period.getDays());

		assertEquals(3, period.getMonths());
		
		assertEquals(3, period.getYears());
	}
}
