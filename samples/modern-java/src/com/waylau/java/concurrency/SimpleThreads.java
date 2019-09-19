/**
 * 
 */
package com.waylau.java.concurrency;

/**
 * Simple Threads.
 * 
 * @since 1.0.0 2019年4月18日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class SimpleThreads {

	// 显示当前执行线程的名称、信息
	static void threadMessage(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, message);
	}

	private static class MessageLoop implements Runnable {
		public void run() {
			String importantInfo[] = { "Mares eat oats", "Does eat oats", "Little lambs eat ivy",
					"A kid will eat ivy too" };
			try {
				for (int i = 0; i < importantInfo.length; i++) {

					// 暂停4秒
					Thread.sleep(4000);

					// 打印消息
					threadMessage(importantInfo[i]);
				}
			} catch (InterruptedException e) {
				threadMessage("I wasn't done!");
			}
		}
	}

	public static void main(String args[]) throws InterruptedException {

		// 在中断MessageLoop线程（默认为1小时）前先延迟一段时间（单位是毫秒）
		long patience = 1000 * 60 * 60;

		// 如果命令行参数出现
		// 设置patience的时间值
		// 单位是秒
		if (args.length > 0) {
			try {
				patience = Long.parseLong(args[0]) * 1000;
			} catch (NumberFormatException e) {
				System.err.println("Argument must be an integer.");
				System.exit(1);
			}
		}

		threadMessage("Starting MessageLoop thread");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();

		threadMessage("Waiting for MessageLoop thread to finish");

		// 循环直到MessageLoop线程退出
		while (t.isAlive()) {
			threadMessage("Still waiting...");

			// 最长等待1秒
			// 给MessageLoop线程来完成
			t.join(1000);
			if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
				threadMessage("Tired of waiting!");
				t.interrupt();

				// 等待
				t.join();
			}
		}
		threadMessage("Finally!");
	}
}
