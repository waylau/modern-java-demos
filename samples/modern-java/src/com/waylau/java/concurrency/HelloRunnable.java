/**
 * 
 */
package com.waylau.java.concurrency;

/**
 * Hello Runnable.
 * 
 * @since 1.0.0 2019年4月18日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class HelloRunnable implements Runnable {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Hello from a runnable!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		(new Thread(new HelloRunnable())).start();
	}
}
