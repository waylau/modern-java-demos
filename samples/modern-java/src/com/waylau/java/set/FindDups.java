/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.set;

import java.util.HashSet;
import java.util.Set;

/**
 * FindDups.
 * 
 * @since 1.0.0 2019年4月6日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class FindDups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		for (String a : args) {
			s.add(a);
			System.out.println(s.size() + " distinct words: " + s);
		}

	}

}
