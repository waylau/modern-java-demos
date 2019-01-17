/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

/**
 * JDK8:CompletableFuture
 * 
 * @since 1.0.0 2019年1月17日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class CompletableFutureDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	@Test
	void testCompletedFuture() {

		CompletableFuture<String> cf = 
				CompletableFuture.completedFuture("Hello World");

		assertTrue(cf.isDone());

		// 返回计算结果或者null
		assertEquals("Hello World", cf.getNow(null));

	}
	
	@Test
	void testThenApply() {

		CompletableFuture<String> cf = 
				CompletableFuture.completedFuture("Hello World")
				.thenApply(String::toUpperCase); // 转为大写
 
		assertTrue(cf.isDone());

		// 返回计算结果或者null
		assertEquals("HELLO WORLD", cf.getNow(null));

	}
	
	@Test
	void testThenApplyAsync() {

		CompletableFuture<String> cf = 
				CompletableFuture.completedFuture("Hello World")
				.thenApplyAsync(String::toUpperCase); // 转为大写
 
		assertFalse(cf.isDone());

		// 返回计算结果或者null
		assertEquals(null, cf.getNow(null));

		// 完成计算，获取结果
		assertEquals("HELLO WORLD", cf.join());
	}
	
	@Test
	void testException() {

		CompletableFuture<String> cf = 
				CompletableFuture.completedFuture("Hello World")
				.thenApplyAsync(
					String::toUpperCase,
					CompletableFuture.delayedExecutor(1, TimeUnit.SECONDS)
				);

		CompletableFuture<String> exceptionHandler = cf.handle((s, th) -> {
			return (th != null) ? "message upon cancel" : "";
		});

		cf.completeExceptionally(new RuntimeException("completed exceptionally"));

		assertTrue(cf.isCompletedExceptionally());

		try {

			cf.join();

			fail("Should have thrown an exception");

		} catch (CompletionException ex) {

			assertEquals("completed exceptionally", ex.getCause().getMessage());

		}

		assertEquals("message upon cancel", exceptionHandler.join());

	}
	
	@Test
	void testCancel() {

		CompletableFuture<String> cf = 
				CompletableFuture.completedFuture("Hello World")
				.thenApplyAsync(
					String::toUpperCase,
					CompletableFuture.delayedExecutor(1, TimeUnit.SECONDS)
				);

		CompletableFuture<String> cf2 = cf.exceptionally(throwable -> "canceled message");

	    assertTrue(cf.cancel(true));

	    assertTrue(cf.isCompletedExceptionally());

	    assertEquals("canceled message", cf2.join());

	}
}
