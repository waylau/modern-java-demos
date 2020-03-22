/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * JDK 14: Pattern Matching for instanceof (Preview)
 * JEP 305: https://openjdk.java.net/jeps/305
 * 
 * @since 1.0.0 2020年3月22日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class InstanceofPatternMatchingDemo {

	@Test
	void testIsBlank() {
		// String不为空
		var name ="Way Lau"; 
		assertEquals(false, isBlank(name));
		
		// Integer不为空
		var age = 12; 
		assertEquals(false, isBlank(age));
		
		// Double不为空
		var price = 12.7D; 
		assertEquals(false, isBlank(price));
		
		// String为null
		String nameNull = null; 
		assertEquals(false, isBlank(nameNull));
		
		// 为空
		var nameEmpty =""; 
		assertEquals(true, isBlank(nameEmpty));
		

	}
	
	@SuppressWarnings("preview")
	private boolean isBlank(Object o) {
		return (o instanceof String s) && s.isBlank();
	}
}
