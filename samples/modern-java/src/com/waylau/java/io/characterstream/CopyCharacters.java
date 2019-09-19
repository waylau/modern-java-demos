/**
 * 
 */
package com.waylau.java.io.characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Copy Characters Demo.
 * 
 * @since 1.0.0 2019年4月10日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class CopyCharacters {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = new FileReader("resources/xanadu.txt");
			outputStream = new FileWriter("resources/characteroutput.txt");

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
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
