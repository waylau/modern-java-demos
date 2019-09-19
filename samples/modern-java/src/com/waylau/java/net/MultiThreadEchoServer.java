/**
 * 
 */
package com.waylau.java.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Multi Thread Echo Server.
 * 
 * @since 1.0.0 2019年4月17日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class MultiThreadEchoServer {
	public static int DEFAULT_PORT = 7;

	public static void main(String[] args) throws IOException {

		int port;

		try {
			port = Integer.parseInt(args[0]);
		} catch (RuntimeException ex) {
			port = DEFAULT_PORT;
		}
		Socket clientSocket = null;
		try (ServerSocket serverSocket = new ServerSocket(port);) {
			while (true) {
				clientSocket = serverSocket.accept();

				// 多线程
				new Thread(new EchoServerHandler(clientSocket)).start();
			}
		} catch (IOException e) {
			System.out.println("监听端口异常，端口： " + port);
			System.out.println(e.getMessage());
		}
	}
}