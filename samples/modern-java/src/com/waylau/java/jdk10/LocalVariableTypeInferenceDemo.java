/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.jdk10;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK10:Local-Variable Type Inference（本地变量引用）. 
 * JEP 286：http://openjdk.java.net/jeps/286
 * 
 * @since 1.0.0 2019年4月19日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class LocalVariableTypeInferenceDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/****** JDK10之前 ******/
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<>();

		/****** JDK10之后 ******/
		var list = new ArrayList<String>(); // 推断类型为ArrayList<String>
		var stream = list.stream(); // 推断类型为Stream<String>

		var var = 1;

		/****** 限制：下面的方式是不行的哦 ******/
		/*
		 * var list4; // 错误！必须赋值。
		 */

		/*
		 * var f = () -> { }; // 错误！必须要有显式的目标类型
		 * 
		 * var k = { 1 , 2 }; // 错误！必须要有显式的目标类型
		 */

		/*
		 * var g = null; // 错误！不能赋null值
		 */
	}

}
