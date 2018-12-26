/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import java.util.function.Function;

/**
 * JDK8:Function.
 * 
 * @since 1.0.0 2018年12月27日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class FunctionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// apply
		Function<Integer, String> f = x -> "Age:"+x;
        System.out.println(f.apply(20));
        
        // compose
        Function<String, Integer> f1 = x -> x.length();
        System.out.println(f1.compose(f).apply(20));
        
        
        System.out.println(f.andThen(f1).apply(20));
        
        System.out.println(Function.identity().apply(20));
        
	}

}
