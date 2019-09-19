/**
 * Welcome to https://waylau.com
 */
package com.waylau.java.exception;

/**
 * AutoCloseable Muti Resource Demo.
 * 
 * @since 1.0.0 2019年4月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
class AutoCloseableMutiResourceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (ResourceSome some = new ResourceSome(); 
				ResourceOther other = new ResourceOther()) {
			some.doSome();
			other.doOther();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

class ResourceSome implements AutoCloseable {
	void doSome() {
		System.out.println("do something");
	}

	@Override
	public void close() throws Exception {
		System.out.println("some resource is closed");
	}
}

class ResourceOther implements AutoCloseable {
	void doOther() {
		System.out.println("do other things");
	}

	@Override
	public void close() throws Exception {
		System.out.println("other resource is closed");
	}
}
