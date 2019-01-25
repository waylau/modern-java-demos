/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk9;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;

/**
 * 
 * @since 1.0.0 2019年1月25日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class HttpClientDemo {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 * @throws InterruptedException 
	 * @throws IOException 
	 * @throws ExecutionException 
	 */
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		// 客户端
		var client = HttpClient
		        .newBuilder()
		        .build();

		// 请求
		var request = HttpRequest
				.newBuilder()
				.uri(new URI("https://waylau.com/books/"))
				.GET()
				.build();
 
		// 同步
		var response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println(response.body());
		
		// 异步
		var responseAsync = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(responseAsync.get().body());

	}

}
