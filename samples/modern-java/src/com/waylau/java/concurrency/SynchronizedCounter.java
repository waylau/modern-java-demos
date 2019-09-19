/**
 * 
 */
package com.waylau.java.concurrency;

/**
 * Synchronized Counter.
 * 
 * @since 1.0.0 2019年4月18日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class SynchronizedCounter {
	private int c = 0;

	public synchronized void increment() {
		c++;
	}

	public synchronized void decrement() {
		c--;
	}

	public synchronized int value() {
		return c;
	}
}