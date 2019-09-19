/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.concurrency;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Random.
 * 
 * @since 1.0.0 2019年4月19日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class Random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int r = ThreadLocalRandom.current().nextInt(4, 77);
		System.out.println(r);
	}

}
