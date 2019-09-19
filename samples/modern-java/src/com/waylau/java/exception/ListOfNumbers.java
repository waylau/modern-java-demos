/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * ListOfNumbers Demo.
 * 
 * @since 1.0.0 2019年4月8日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class ListOfNumbers {

	private List<Integer> list;
	private static final int SIZE = 10;

	public ListOfNumbers() {
		list = new ArrayList<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			list.add(i);
		}
	}

	/*
	 * public void writeList() { // FileWriter构造函数会抛出IOException，必须捕获该异常 PrintWriter
	 * out = new PrintWriter(new FileWriter("OutFile.txt"));
	 * 
	 * for (int i = 0; i < SIZE; i++) { //
	 * get(int)方法会抛出IndexOutOfBoundsException，必须捕获该异常 out.println("Value at: " + i +
	 * " = " + list.get(i)); } out.close(); }
	 */

	public void writeList() throws IOException {
		// FileWriter构造函数会抛出IOException，必须捕获该异常
		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

		for (int i = 0; i < SIZE; i++) {
			// get(int)方法会抛出IndexOutOfBoundsException，必须捕获该异常
			out.println("Value at: " + i + " = " + list.get(i));
		}
		out.close();
	}

}
