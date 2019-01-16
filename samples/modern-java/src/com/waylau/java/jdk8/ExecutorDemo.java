/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * JDK8:Executors.newWorkStealingPool()
 * 
 * @since 1.0.0 2019年1月16日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class ExecutorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int nThreads = 2;

		Runnable taskA = () -> {System.out.println("hello A");};
		Runnable taskB = () -> {System.out.println("hello B");};
		
		Executor exec = Executors.newFixedThreadPool(nThreads);
		
		exec.execute(taskA);
		exec.execute(taskB);
		
		// Java 8
		Executor exec2 = Executors.newWorkStealingPool(nThreads);
		
		exec2.execute(taskA);
		exec2.execute(taskB);
	}

}
