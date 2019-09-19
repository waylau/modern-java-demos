/**
 * 
 */
package com.waylau.java.concurrency;

/**
 * Producer Consumer Example.
 * 
 * @since 1.0.0 2019年4月18日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class ProducerConsumerExample {
	public static void main(String[] args) {
		Drop drop = new Drop();
		(new Thread(new Producer(drop))).start();
		(new Thread(new Consumer(drop))).start();
	}
}
