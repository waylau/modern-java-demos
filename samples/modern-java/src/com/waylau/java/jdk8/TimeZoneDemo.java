/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

/**
 * JDK8:TimeZone.
 * 
 * @since 1.0.0 2019年1月15日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class TimeZoneDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 区域标识
		ZoneId romeZone = ZoneId.of("Europe/Rome");

		// TimeZone转为ZoneId
		ZoneId zoneId = TimeZone.getDefault().toZoneId();
	}

	@Test
	void testTimeZone() {
		// 区域标识
		ZoneId romeZone = ZoneId.of("Europe/Rome");

		// 实例化2019-1-21日期
		LocalDate date = LocalDate.of(2019, 1, 21);
		assertEquals("2019-01-21", date.toString());

		ZonedDateTime zdt1 = date.atStartOfDay(romeZone);
		assertEquals("2019-01-21T00:00+01:00[Europe/Rome]", zdt1.toString());

		// 实例化时间日期
		LocalDateTime dt1 = LocalDateTime.of(2019, 1, 21, 13, 45, 20);
		ZonedDateTime zdt2 = dt1.atZone(romeZone);
		assertEquals("2019-01-21T13:45:20+01:00[Europe/Rome]", zdt2.toString());

		Instant instant = Instant.ofEpochSecond(60 * 24L); // 1440秒
		ZonedDateTime zdt3 = instant.atZone(romeZone);
		assertEquals("1970-01-01T01:24+01:00[Europe/Rome]", zdt3.toString());
		
		// UTC/GMT
		ZoneOffset newYorkOffset = ZoneOffset.of("-05:00");
		OffsetDateTime dateTimeInNewYork = OffsetDateTime.of(dt1, newYorkOffset);
		assertEquals("2019-01-21T13:45:20-05:00", dateTimeInNewYork.toString());
	}
}
