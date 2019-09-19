/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk12;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Compact Number Formatting.
 * 
 * @since 1.0.0 2019年4月20日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
class CompactNumberFormattingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var cnf = NumberFormat.getCompactNumberInstance(Locale.CHINA, NumberFormat.Style.SHORT);
		
        System.out.println(cnf.format(1_0000));
        System.out.println(cnf.format(1_9200));
        System.out.println(cnf.format(1_000_000));
        System.out.println(cnf.format(1L << 30));
        System.out.println(cnf.format(1L << 40));
        System.out.println(cnf.format(1L << 50));
        
		var cnf2 = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

		System.out.println(cnf2.format(1_0000));
		System.out.println(cnf2.format(1_9200));
		System.out.println(cnf2.format(1_000_000));
		System.out.println(cnf2.format(1L << 30));
		System.out.println(cnf2.format(1L << 40));
		System.out.println(cnf2.format(1L << 50));
	}

}
