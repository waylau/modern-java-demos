package com.waylau.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Freq.
 * 
 * @since 1.0.0 2019年4月6日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class Freq {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();

		for (String a : args) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.println(m.size() + " distinct words:");
		System.out.println(m);
	}

}
