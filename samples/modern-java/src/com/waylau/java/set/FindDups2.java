/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.set;

import java.util.HashSet;
import java.util.Set;

/**
 * FindDups2.
 * 
 * @since 1.0.0 2019年4月6日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class FindDups2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();

		for (String a : args) {
			if (!uniques.add(a)) {
				dups.add(a);
			}

		}
		uniques.removeAll(dups);

		System.out.println("Unique words:    " + uniques);
		System.out.println("Duplicate words: " + dups);
	}

}
