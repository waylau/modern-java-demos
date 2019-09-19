/**
 * 
 */
package com.waylau.java.concurrency;

/**
 * MsLunch
 * 
 * @since 1.0.0 2019年4月19日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class MsLunch {
	@SuppressWarnings("unused")
	private long c1 = 0;
	@SuppressWarnings("unused")
	private long c2 = 0;
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	public void inc1() {
		synchronized (lock1) {
			c1++;
		}
	}

	public void inc2() {
		synchronized (lock2) {
			c2++;
		}
	}
}
