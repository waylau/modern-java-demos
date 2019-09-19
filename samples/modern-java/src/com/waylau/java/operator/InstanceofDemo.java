/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.operator;

/**
 * Instanceof Demo.
 * 
 * @since 1.0.0 2019年4月3日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class InstanceofDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Parent obj1 = new InstanceofDemo().new Parent();
		Parent obj2 = new InstanceofDemo().new Child();

		System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));
		System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));
		System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));
		System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));
		System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));
		System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));
	}

	// 以下为内部类
	class Parent {
	}

	class Child extends Parent implements MyInterface {
	}

	interface MyInterface {
	}

}
