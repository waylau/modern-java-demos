/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk9.flow;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

/**
 * Subscriber.
 * 
 * @since 1.0.0 2019年1月22日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
class MySubscriber<T> implements Subscriber<T> {

	private Subscription subscription;

	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
        subscription.request(1);
	}

	@Override
	public void onNext(T item) {
		System.out.println("获取 : " + item);
        subscription.request(1); 
	}

	@Override
	public void onError(Throwable throwable) {
		throwable.printStackTrace();
		
	}

	@Override
	public void onComplete() {
		System.out.println("完成");
	}

}
