/**
 * 
 */
package com.waylau.java.io.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copy Bytes Demo.
 * 
 * @since 1.0.0 2019年4月10日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class CopyBytes {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("resources/xanadu.txt");
			out = new FileOutputStream("resources/outagain.txt");
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
