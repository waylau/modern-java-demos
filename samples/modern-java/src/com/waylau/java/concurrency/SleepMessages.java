/**
 * 
 */
package com.waylau.java.concurrency;

/**
 * Sleep Messages.
 * 
 * @since 1.0.0 2019年4月18日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class SleepMessages {

	public static void main(String[] args) throws InterruptedException {
		String importantInfo[] = { "Mares eat oats", "Does eat oats", "Little lambs eat ivy",
				"A kid will eat ivy too" };

		for (int i = 0; i < importantInfo.length; i++) {

			// 暂停4秒
			Thread.sleep(4000);

			// 打印消息
			System.out.println(importantInfo[i]);
		}
	}
}
