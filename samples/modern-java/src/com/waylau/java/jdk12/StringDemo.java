/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

/**
 * JDK12:String API.
 * 
 * @since 1.0.0 2019年4月19日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
class StringDemo {
	
	@Test
	void testTransform() {
		// 转成小写
		var name ="Way Lau";
		var result = name.transform(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toLowerCase();
            }
        });

		assertEquals("way lau", result);
	}

	@Test
	void testIndent() {
		// 缩进
		var name ="Way Lau";
		var result = name.indent(3);

		assertEquals("   Way Lau\n", result);
	}
}
