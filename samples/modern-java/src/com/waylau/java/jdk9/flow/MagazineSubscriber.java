/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk9.flow;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.stream.IntStream;

/**
 * Magazine Subscriber.
 * 
 * @since 1.0.0 2019年6月10日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class MagazineSubscriber implements Subscriber<Integer> {

	public static final String LUCY = "LUCY";
	public static final String LILY = "LILY";

	private final long sleepTime;
	private final String subscriberName;
	private Subscription subscription;
	private int nextMagazineExpected;
	private int totalRead;

	MagazineSubscriber(final long sleepTime, final String subscriberName) {
		this.sleepTime = sleepTime;
		this.subscriberName = subscriberName;
		this.nextMagazineExpected = 1;
		this.totalRead = 0;
	}

	@Override
	public void onSubscribe(final Subscription subscription) {
		this.subscription = subscription;
		subscription.request(1);
	}

	@Override
	public void onNext(final Integer magazineNumber) {
		if (magazineNumber != nextMagazineExpected) {
			IntStream.range(nextMagazineExpected, magazineNumber)
					.forEach((msgNumber) -> log("我错过了杂志: " + msgNumber));
			nextMagazineExpected = magazineNumber;
		}
		log("真棒! 我拿到了新杂志: " + magazineNumber);
		takeSomeRest();
		nextMagazineExpected++;
		totalRead++;

		log("我拿到了另外一本杂志, 下一本将是: " + nextMagazineExpected);
		subscription.request(1);
	}

	@Override
	public void onError(final Throwable throwable) {
		log("从Publisher那出错了: " + throwable.getMessage());
	}

	@Override
	public void onComplete() {
		log("订阅完成! 我共拿到了" + totalRead + "本杂志.");
	}

	private void log(final String logMessage) {
		System.out.println("<=========== [" + subscriberName + "] : " + logMessage);
	}

	public String getSubscriberName() {
		return subscriberName;
	}

	private void takeSomeRest() {
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
