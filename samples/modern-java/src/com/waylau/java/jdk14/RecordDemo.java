/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * JDK 14: Records (Preview)
 * JEP 359: https://openjdk.java.net/jeps/359
 * 
 * @since 1.0.0 2020年3月22日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@SuppressWarnings("preview")
class RecordDemo {

	@Test
	void testRecord() {
		var ponit = new Point(3,8);
		
		assertEquals(3, ponit.x);
		assertEquals(8, ponit.y);
		
	}

	private final record Point(int x, int y) {
	}
}
