/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.expression;

/**
 * Statement Demo.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class StatementDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		double aValue;

		// 赋值表达式
		aValue = 8933.234;

		// 递增表达式
		aValue++;

		// 方法调用
		System.out.println("Hello World!");

		// 对象创建
		String s = new String();

		// 声明表达式
		double bValue = 8933.234;

		// 控制流程语句
		boolean isMoving = true;
		int currentSpeed = 0;

		if (isMoving) {
			currentSpeed--;
		}

	}

}
