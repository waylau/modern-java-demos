/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;

import org.junit.jupiter.api.Test;

/**
 * JDK8:Instant.
 * 
 * @since 1.0.0 2019年1月14日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class InstantDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Instant instant = Instant.ofEpochSecond(60*24L); // 1440秒
		System.out.println(instant.toString());
		
		Instant now = Instant.now();
		System.out.println(now.getEpochSecond());
	}


	@Test
	void testInstant() {
		
		Instant instant = Instant.ofEpochSecond(60*24L); // 1970-01-01T00:24:00Z
		
		// 与纪元时间的偏移秒数
		assertEquals(1440, instant.getEpochSecond());
		
		// 偏移秒速
		Instant instant2 = instant.plusSeconds(100);
		
		// 与纪元时间的偏移秒数
		assertEquals(1540, instant2.getEpochSecond());
	}
}
