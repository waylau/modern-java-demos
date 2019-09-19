/**
 * 
 */
package com.waylau.java.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * File Test Demo.
 * 
 * @since 1.0.0 2019年4月16日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class FileTest {
	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("usage: FileTest file");
			System.exit(-1);
		}

		// 将输入的字符串转为Path对象.
		Path inputPath = Paths.get(args[0]);

		// 将路径转为绝对路径
		Path fullPath = inputPath.toAbsolutePath();
	}
}
