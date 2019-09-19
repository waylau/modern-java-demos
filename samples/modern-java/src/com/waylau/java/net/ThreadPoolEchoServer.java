/**
 * 
 */
package com.waylau.java.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thread Pool Echo Server.
 * 
 * @since 1.0.0 2019年4月17日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class ThreadPoolEchoServer {
	public static int DEFAULT_PORT = 7;

	public static void main(String[] args) throws IOException {

		int port;

		try {
			port = Integer.parseInt(args[0]);
		} catch (RuntimeException ex) {
			port = DEFAULT_PORT;
		}
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		Socket clientSocket = null;
		try (ServerSocket serverSocket = new ServerSocket(port);) {
			while (true) {
				clientSocket = serverSocket.accept();

				// Thread Pool
				threadPool.submit(new Thread(new EchoServerHandler(clientSocket)));
			}
		} catch (IOException e) {
			System.out.println("监听端口异常，端口： " + port);
			System.out.println(e.getMessage());
		}
	}
}
