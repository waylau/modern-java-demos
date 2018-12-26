/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

/**
 * JDK8:Predicate.
 * 
 * @since 1.0.0 2018年12月26日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class PredicateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// test
		Predicate<String> i  = (s)-> s.length() > 5;
	    System.out.println(i.test("Way Lau"));
	
	    // negate
	    System.out.println(i.negate().test("Way Lau"));
	    
	    // or
	    Predicate<String> i1  = (s)-> s.endsWith("XXX");
	    System.out.println(i.or(i1).test("Way Lau"));
	    
	    // and
	    System.out.println(i.and(i1).test("Way XXX"));
	    
	    // JDK11:not
	    System.out.println(Predicate.not(i1).test("Way Lau"));

	}

	@Test
	void testIntPredicateTest() {
	    // IntPredicate test
	    IntPredicate intP =  (s)-> s > 5;
	    
	    assertEquals(true, intP.test(7));
	    assertEquals(false, intP.test(2));
	}
	@Test
	void testIntPredicateAnd() {
	    // IntPredicate and
	    IntPredicate intP =  (s)-> s > 5;   
	    IntPredicate intP1 =  (s)-> s < 15;
	    
	    assertEquals(true, intP.and(intP1).test(12));
	    assertEquals(false, intP.and(intP1).test(2));
    
	}
	
	@Test
	void testIntPredicateOr() {
	    // IntPredicate or
	    IntPredicate intP =  (s)-> s > 5;   
	    IntPredicate intP1 =  (s)-> s < 15;

	    assertEquals(true, intP.or(intP1).test(2));
	}
	
	@Test
	void testIntPredicateNegate() {
	    // IntPredicate negate
	    IntPredicate intP =  (s)-> s > 5;   

	    assertEquals(true, intP.negate().test(2));
	}
	
    
	@Test
	void testBiPredicateTest() {
	    // BiPredicate test
	    BiPredicate<Integer, Integer> bitP = (s, b) -> s + b < 15;

	    assertEquals(true, bitP.test(12, 1));
	    assertEquals(false, bitP.test(12, 4));
	}
	
}
