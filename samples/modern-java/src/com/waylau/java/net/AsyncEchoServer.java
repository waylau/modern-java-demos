package com.waylau.java.net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.StandardSocketOptions;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Asynchronous Echo Server(Asynchronous IO Model)
 * 
 * @since 1.0.0 2019年4月17日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class AsyncEchoServer {

	public static int DEFAULT_PORT = 7;

	public static void main(String[] args) throws IOException {
		int port;

		try {
			port = Integer.parseInt(args[0]);
		} catch (RuntimeException ex) {
			port = DEFAULT_PORT;
		}

		ExecutorService taskExecutor = Executors.newCachedThreadPool(Executors.defaultThreadFactory());

		try (AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open()) {
			if (asynchronousServerSocketChannel.isOpen()) {

				asynchronousServerSocketChannel.setOption(StandardSocketOptions.SO_RCVBUF, 4 * 1024);
				asynchronousServerSocketChannel.setOption(StandardSocketOptions.SO_REUSEADDR, true);

				asynchronousServerSocketChannel.bind(new InetSocketAddress(port));

				System.out.println("等待连接 ...");
				while (true) {
					Future<AsynchronousSocketChannel> asynchronousSocketChannelFuture = asynchronousServerSocketChannel
							.accept();
					try {
						final AsynchronousSocketChannel asynchronousSocketChannel = asynchronousSocketChannelFuture
								.get();
						Callable<String> worker = new Callable<String>() {
							@Override
							public String call() throws Exception {
								String host = asynchronousSocketChannel.getRemoteAddress().toString();
								System.out.println("进来的连接来自: " + host);
								final ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

								while (asynchronousSocketChannel.read(buffer).get() != -1) {
									buffer.flip();
									asynchronousSocketChannel.write(buffer).get();
									if (buffer.hasRemaining()) {
										buffer.compact();
									} else {
										buffer.clear();
									}
								}
								asynchronousSocketChannel.close();
								System.out.println(host + " 成功启动!");
								return host;
							}
						};
						taskExecutor.submit(worker);
					} catch (InterruptedException | ExecutionException ex) {
						System.err.println(ex);
						System.err.println("\n 服务器正在关闭...");
						taskExecutor.shutdown();
						while (!taskExecutor.isTerminated()) {
						}
						break;
					}
				}
			} else {
				System.out.println("异步服务器Socket管道不能打开!");
			}
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
}