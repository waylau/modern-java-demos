/**
 * 
 */
package com.waylau.java.concurrency;

/**
 * Drop.
 * 
 * @since 1.0.0 2019年4月18日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class Drop {

	private String message;

	private boolean empty = true;

	public synchronized String take() {

		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		empty = true;
		// 通知生产者状态已经改变
		notifyAll();
		return message;
	}

	public synchronized void put(String message) {
		// 等待直到接收到消息
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		// 触发状态
		empty = false;
		// 存储消息
		this.message = message;
		// 通知消费者状态已经发生改变
		notifyAll();
	}
}