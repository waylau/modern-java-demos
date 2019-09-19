/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk9.flow;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * Reactive Flow App.
 * 
 * @since 1.0.0 2019年6月10日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class ReactiveFlowApp {

	private static final int NUMBER_OF_MAGAZINES = 10;
	private static final long MAX_SECONDS_TO_KEEP_IT_WHEN_NO_SPACE = 2;

	public static void main(String[] args) throws Exception {
		final ReactiveFlowApp app = new ReactiveFlowApp();

		System.out.println("\n\n### 场景 1: Subscriber很快，在这种情况下缓冲区大小并不那么重要.");
		app.magazineDeliveryExample(100L, 100L, 4);

		System.out.println("\n\n### 场景 2: Subscriber很慢，但发布者的缓冲区大小足以保留所有数据，直到他们被消费.");
		app.magazineDeliveryExample(1000L, 3000L, NUMBER_OF_MAGAZINES);

		System.out.println("\n\n### 场景 3: Subscriber很慢，以及发布者方面的缓冲区大小非常有限，因此Subscriber的Flow Control很重要.");
		app.magazineDeliveryExample(1000L, 3000L, 4);

	}

	void magazineDeliveryExample(final long sleepTimeLucy, final long sleepTimeLily, final int maxStorageInPO)
			throws Exception {
		final SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>(ForkJoinPool.commonPool(),
				maxStorageInPO);

		final MagazineSubscriber lucy = new MagazineSubscriber(sleepTimeLucy, MagazineSubscriber.LUCY);
		final MagazineSubscriber lily = new MagazineSubscriber(sleepTimeLily, MagazineSubscriber.LILY);

		publisher.subscribe(lucy);
		publisher.subscribe(lily);

		System.out.println("打印了10本杂志给每个subscriber, 存放空间是" + maxStorageInPO
				+ ". 他们有" + MAX_SECONDS_TO_KEEP_IT_WHEN_NO_SPACE + "秒来消费他们.");
		IntStream.rangeClosed(1, 10).forEach((number) -> {
			System.out.println("提供第" + number + "本杂志给consumer");
			final int lag = publisher.offer(number, MAX_SECONDS_TO_KEEP_IT_WHEN_NO_SPACE, TimeUnit.SECONDS,
					(subscriber, msg) -> {
						subscriber.onError(new RuntimeException(((MagazineSubscriber) subscriber).getSubscriberName()
								+ "! 你获取杂志的速度太慢了，我们没有地方方他们了! "
								+ "我要把你的杂志丢了: " + msg));
						return false;
					});
			if (lag < 0) {
				log("丢弃杂志 " + -lag);
			} else {
				log("最慢的consumer共拿到了" + lag + "本杂志");
			}
		});

		// 阻塞，直到所有订阅者完成
		while (publisher.estimateMaximumLag() > 0) {
			Thread.sleep(500L);
		}

		// 关闭publisher,在所有的subscriber上调用onComplete()方法
		publisher.close();
		
		// 给最慢的消费者一些时间醒来，注意它已经完成了
		Thread.sleep(Math.max(sleepTimeLucy, sleepTimeLily));
	}

	private static void log(final String message) {
		System.out.println("===========> " + message);
	}

}