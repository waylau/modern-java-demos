/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/**
 * JDK8:Consumer.
 * 
 * @since 1.0.0 2018年12月26日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class ConsumerDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// andThen
		Consumer<String> c1 = (x) -> System.out.println(x.toLowerCase());
		Consumer<String> c2 = (x) -> System.out.println(x.toUpperCase());
		
	    c1.andThen(c2).accept("Way Lau");
	    
	    
	    // IntConsumer
	    IntConsumer intC = (x) -> System.out.println(x*2);
	    intC.accept(3);
	    
	    // LongConsumer
	    LongConsumer longC = (x) -> System.out.println(x*2);
	    longC.accept(3L);
	    
	    // DoubleConsumer
	    DoubleConsumer doubleC = (x) -> System.out.println(x*2);
	    doubleC.accept(3D);
	    
	    // BiConsumer
	    BiConsumer<String, Integer> biC = (x, i) -> System.out.println(x + i);
	    biC.accept("Way Lau", 3);
	}

}
