/**
 * 
 */
package com.waylau.java.concurrency;

/**
 * Hello Thread.
 * 
 * @since 1.0.0 2019年4月18日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class HelloThread extends Thread {

	public void run() {
		System.out.println("Hello from a thread!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		(new HelloThread()).start();
	}
}
