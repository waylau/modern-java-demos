/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8.shop;

import java.util.concurrent.Future;

/**
 * CompletableFuture Shop Demo.
 * 
 * @since 1.0.0 2019年1月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class CompletableFutureShopDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shop shop = new Shop("A店");
		long start = System.currentTimeMillis();

		Future<Double> futurePrice = shop.getPriceAsync("产品B");
		long invocationTime = System.currentTimeMillis();
		System.out.println("调用返回耗时" + (invocationTime - start) + " 毫秒");

		// 模拟执行其他任务
		doSomethingElse();

		// 获取价格
		try {
			double price = futurePrice.get();
			System.out.printf("商品价格是 %.2f%n元", price);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		long retrievalTime = System.currentTimeMillis() - start;
		System.out.println("查询产品价格耗时 " + retrievalTime + "毫秒");
	}

	private static void doSomethingElse() {
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
