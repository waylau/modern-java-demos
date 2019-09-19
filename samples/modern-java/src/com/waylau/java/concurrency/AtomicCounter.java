/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Atomic Counter.
 * 
 * @since 1.0.0 2019年4月19日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class AtomicCounter {

	private AtomicInteger c = new AtomicInteger(0);

	public void increment() {
		c.incrementAndGet();
	}

	public void decrement() {
		c.decrementAndGet();
	}

	public int value() {
		return c.get();
	}

}
