/**
 * 
 */
package com.waylau.java.io.characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Copy Lines Demo.
 * 
 * @since 1.0.0 2019年4月10日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class CopyLines {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader("resources/xanadu.txt"));
			outputStream = new PrintWriter(new FileWriter("resources/characteroutput.txt"));

			String l;
			while ((l = inputStream.readLine()) != null) {
				outputStream.println(l);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}
