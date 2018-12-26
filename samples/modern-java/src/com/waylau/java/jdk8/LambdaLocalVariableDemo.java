/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import java.util.function.Supplier;

/**
 * JDK8:Lambda local variables.
 * 
 * @since 1.0.0 2018年12月27日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class LambdaLocalVariableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name =  "Way Lau";
		
		Supplier<String> supplier = () -> name;
		System.out.println(supplier.get());
		
		// name = "waylau";  // 错误！name不可更改
		
	}

}
