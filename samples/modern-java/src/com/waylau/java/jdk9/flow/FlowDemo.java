/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk9.flow;

import java.util.Arrays;
import java.util.concurrent.SubmissionPublisher;

/**
 * Flow Demo.
 * 
 * @since 1.0.0 2019年1月22日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class FlowDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建Publisher
		SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

		// 注册Subscriber
		MySubscriber<String> subscriber = new MySubscriber<>();
		publisher.subscribe(subscriber);

		// 发布项目
		System.out.println("开始发布项目...");
		String[] items = {"1", "《Cloud Native 分布式架构原理与实践》", 
				"2", "《分布式系统常用技术及案例分析》",
				"3", "《Spring 5 开发大全》"};
		Arrays.asList(items).stream().forEach(i -> publisher.submit(i));
		publisher.close(); 
	}

}
