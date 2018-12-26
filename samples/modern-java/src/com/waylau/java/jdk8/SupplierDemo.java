/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

/**
 * JDK8：Supplier
 * 
 * @since 1.0.0 2018年12月26日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class SupplierDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// get
		Supplier<String> supplier = () -> "Way Lau";
		System.out.println(supplier.get());
		
		// BooleanSupplier
		BooleanSupplier booleanS = () -> 1==2;
		System.out.println(booleanS.getAsBoolean());
		
		// IntSupplier
		IntSupplier intS = () -> 1*2;
		System.out.println(intS.getAsInt());
		
		// LongSupplier
		LongSupplier longS = () -> 1L*2;
		System.out.println(longS.getAsLong());
		
		// DoubleSupplier
		DoubleSupplier doubleS = () -> 1D*2;
		System.out.println(doubleS.getAsDouble());
		
	}

}
