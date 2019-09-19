/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.controlflow;

/**
 * If Else Demo.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class IfElseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int testscore = 76;
		char grade;

		if (testscore >= 90) {
			grade = 'A';
		} else if (testscore >= 80) {
			grade = 'B';
		} else if (testscore >= 70) {
			grade = 'C';
		} else if (testscore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Grade = " + grade);
	}

}
