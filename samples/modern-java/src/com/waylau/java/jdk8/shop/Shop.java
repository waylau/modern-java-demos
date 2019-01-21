/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8.shop;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Shop.
 * 
 * @since 1.0.0 2019年1月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class Shop {
	private String shopName;
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Shop(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 获取商品的价格
	 * 
	 * @param product
	 * @return
	 */
	public double getPrice(String product) {
		// 查询数据库或者外部服务
		return calculatePrice(product);
	}

	/**
	 * 异步方式获取商品的价格
	 * 
	 * @param product
	 * @return
	 */
	/*
	public Future<Double> getPriceAsync(String product) {
		CompletableFuture<Double> futurePrice = new CompletableFuture<>();
		new Thread(() -> {
			try {
				double price = calculatePrice(product);
				
				// 正常计算完成使任务完成
				futurePrice.complete(price);
			} catch (Exception e) {
				
				// 捕获异常使任务完成
				futurePrice.completeExceptionally(e);
			}
		}).start();
		return futurePrice;
	}
	*/
	public Future<Double> getPriceAsync(String product) {
		return CompletableFuture.supplyAsync(() -> calculatePrice(product))
				.orTimeout(3, TimeUnit.SECONDS); // 超时3秒
	}

	/**
	 * 计算价格
	 * 
	 * @param product
	 * @return
	 */
	private double calculatePrice(String product) {
		delay();
		Random random = new Random();
		return random.nextDouble() * product.charAt(0) + product.charAt(1);
	}

	/**
	 * 模拟耗时操作
	 */
	public static void delay() {
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
