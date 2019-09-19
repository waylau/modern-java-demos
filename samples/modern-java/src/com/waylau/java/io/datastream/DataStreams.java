/**
 * 
 */
package com.waylau.java.io.datastream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Data Streams Demo.
 * 
 * @since 1.0.0 2019年4月15日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class DataStreams {
	static final String dataFile = "resources/invoicedata.txt";

	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = { "Java T-shirt", "Java Mug", "Duke Juggling Dolls", "Java Pin", "Java Key Chain" };

	public static void main(String[] args) throws IOException {

		DataOutputStream out = null;

		try {
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));

			for (int i = 0; i < prices.length; i++) {
				out.writeDouble(prices[i]);
				out.writeInt(units[i]);
				out.writeUTF(descs[i]);
			}
		} finally {
			out.close();
		}

		DataInputStream in = null;
		double total = 0.0;
		try {
			in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));

			double price;
			int unit;
			String desc;

			try {
				while (true) {
					price = in.readDouble();
					unit = in.readInt();
					desc = in.readUTF();
					System.out.format("预定了 %d 件 %s ,价位是 $%.2f%n", unit, desc, price);
					total += unit * price;
				}
			} catch (EOFException e) {
			}
			System.out.format("总计: $%.2f%n", total);
		} finally {
			in.close();
		}
	}
}